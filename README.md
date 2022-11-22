# Credit Restriction API

This project was created to start the initial steps with test automation for a REST API using RestAssured.

# Required software

* Java JDK 17+
* Maven installed and in your classpath
* Lombok plugin in your IDE

# About the API

## How to start the API

First, clone or download this project. After:

1. Navigate to the project folder using the Terminal / Command prompt
2. Execute the following: `mvn spring-boot:run`
3. Wait until you see something like this: _Started CreditSimulatorApplication in 6.53 seconds_
4. The API is ready and listen all requests on `http://localhost:8088`

## How to change the port

The default port is `8088`.
If you want to change the port to another one, execute the following command, replacing the text `<NEW_PORT>`.

```
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=<NEW_PORT>
```

## How to access the documentation (Swagger)

After the application has started open the link: http://localhost:8088/swagger-ui/index.html

## Testing

You can use the following `cpf's` to test the restriction's response, also placed at the `LoadDatabase` class:

| CPF         | Reason (in v2) |
|-------------|----------------|
| 97093236014 | Judicial Issue |
| 60094146012 | Credit Card    |
| 84809766080 | Banking        |
| 62648716050 | Credit Score   |
| 26276298085 | Credit Score   |
| 01317496094 | Credit Card    |
| 55856777050 | Banking        |
| 19626829001 | Judicial Issue |
| 24094592008 | Banking        |
| 58063164083 | Banking        |

# Do you want to help?

Please read the [Contribution guide](CONTRIBUTING.md)
