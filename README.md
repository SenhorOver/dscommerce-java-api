# DSCommerce

# Sobre o projeto

DSCommerce é uma aplicação backend que consiste em um ecossistema com validações, autenticação e CRUD de produtos e pedidos.

Rotas protegidas com acesso limitado via Token (JWT).
Cargos (Roles) definidos para cada tipo de conta.

## Modelo conceitual
![Modelo Conceitual](https://i.ibb.co/Jdpn1Qn/image-2024-07-07-T19-33-34-381-Z.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Hibernate Validator
- Spring Security
- OAuth2 Servers

# Como executar o projeto

## Back end
Pré-requisitos: Java 17 e Postman

```bash
# clonar repositório
git clone https://github.com/SenhorOver/dscommerce-java-api.git

# entrar na pasta do projeto back end
cd dscommerce

# executar o projeto
./mvnw spring-boot:run
```

[Postman Collection](https://github.com/SenhorOver/dscommerce-java-api/blob/master/DSCommerce.postman_collection.json)

[Postman Environment](https://github.com/SenhorOver/dscommerce-java-api/blob/master/DSCommerce-Env.postman_environment.json)
* Possui dois usuários por padrão:
* email: maria@gmail.com | senha: 123456   -> Usuário comum (client)
* email: alex@gmail.com  | senha: 123456   -> Usuário admin (admin)


# Autor

Marcos Vinicius Silva

https://www.linkedin.com/in/marcos-v-s/
