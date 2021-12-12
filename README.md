# fhir-client-quarkus Project

This project uses Quarkus and the HAPI FHIR client.

## The Code is mainly based on the work of goafabric

LINK!!

> **_NOTE:_**  This project does not show how to use the HAPI FHIR client in detail. It is about how to configure it for building a native image.


#run native, after build
docker run --name fhir-client-quarkus --rm -p 50100:50100 upoehner/fhir-client-quarkus-arm64v8:1.0-SNAPSHOT
