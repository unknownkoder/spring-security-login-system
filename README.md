# Spring Security Login System Tutorial Code

Java application code for a Spring Boot 3+, Spring Data JPA, Spring Security, Spring Web, and OAuth2Resource server application which allows users to login or register using HTTP POST requests, then view endpoints based on their roles.

Users are authenticated against a database using a custom `UserDetailsService` and `AuthenticationManager` along with Spring Data JPA repositories.

When a successful login occurs, a JWT is generated and sent back to the user, the user can use this JWT in the header as a bearer token to access authenticated routes according to their roles

[Follow the youtube tutorial here]()