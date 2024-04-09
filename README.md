# Estudos sobre microserviços

## Recursos

- Gateway
- Product-ms
- OAuth2 (Keycloak)

### Rodar Keycloak

Vamos utilizar o docker para rodar o Keycloak

```bash
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.5 start-dev
```
