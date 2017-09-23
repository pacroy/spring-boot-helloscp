# spring-boot-helloscp

Hello World Spring Boot Application for deploying on SAP Cloud Platform (Cloud Foundry and Neo environment).

# Building Instructions

## Local

```
mvn clean package install
```

## SCP Cloud Foundry Environment

```
mvn clean package install -P cf
```

## SCP Neo Environment

```
mvn clean package install -P neo
```

# Blog

Please visit my blog about this repository at https://medium.com/pacroy/running-spring-boot-application-on-sap-cloud-platform-ceede6d65106 