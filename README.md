# Estudos sobre microserviços e implementação com SpringBoot

## Recursos

- Gateway (Spring-Cloud-Gateway)
- Service-Discovery (Eureka)
- OAuth2 (Keycloak)
- Product-ms

### Rodar Keycloak

Vamos utilizar o docker para rodar o Keycloak

```bash
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.5 start-dev
```
