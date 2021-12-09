#run native, after build
docker run --name fhir-client-quarkus --rm -p 50100:50100 upoehner/fhir-client-quarkus-arm64v8:1.0-SNAPSHOT
