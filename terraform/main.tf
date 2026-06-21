provider "kubernetes" {
  config_path = "~/.kube/config"
}

resource "kubernetes_deployment" "springboot_app" {
  metadata {
    name = "springboot-app"
    labels = {
      app = "springboot"
    }
  }

  spec {
    replicas = 1

    selector {
      match_labels = {
        app = "springboot"
      }
    }

    template {
      metadata {
        labels = {
          app = "springboot"
        }
      }

      spec {
        container {
          name  = "springboot-container"
          image = "ghcr.io/letsdevapps/springboot-rest:latest"

          image_pull_policy = "Always"

          port {
            container_port = 8080
          }
        }
      }
    }
  }
}

resource "kubernetes_service" "springboot_service" {
  metadata {
    name = "springboot-service"
  }

  spec {
    selector = {
      app = "springboot"
    }

    port {
      port        = 8080
      target_port = 8080
    }

    type = "NodePort"
  }
}

resource "kubernetes_ingress_v1" "app_ingress" {
  metadata {
    name = "app-ingress"

    annotations = {
      "nginx.ingress.kubernetes.io/rewrite-target" = "/"
    }
  }

  spec {
    ingress_class_name = "nginx"

    rule {
      http {
        path {
          path      = "/spring"
          path_type = "Prefix"

          backend {
            service {
              name = kubernetes_service.springboot_service.metadata[0].name
              port {
                number = 8080
              }
            }
          }
        }
      }
    }
  }
}