


# register
POST /register

```json
{
    "username": "user1",
    "password": "pass123"
}
```

# authenticate
POST /authenticate

```json
{
    "username": "user1",
    "password": "pass123"
}
```
get a valid JTW

```json
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmdpcmlzIiwic2NvcGVzIjoiUk9MRV9VU0VSIiwiaWF0IjoxNjEwNjI2NjgwLCJleHAiOjE2MTA2Mjg0ODB9.WfXvZCihS72H9vKnw4CB7vvBAo3Dt-t7C2RUITE7bxw"
}
```

# use it in each request
```bash
Header
Authorization
Value
Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbGV4IiwiZXhwIjoxNjEwNTUzMjc5LCJpYXQiOjE2MTA1MzUyNzl9.DoeZWv6Wk9WlgZ5UWuEtAL0MwoYTpAIaVpDZpIYdn-N1hvLUKy5eASZ3ogj0i920WVJAwXOqyXzEB_tePnnWvA
 
```

based on [Spring Boot Security + JWT (JSON Web Token) Authentication using MYSQL Example](https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt-mysql)