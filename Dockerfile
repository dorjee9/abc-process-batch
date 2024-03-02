From openjdk:11
ADD target/abc-process-batch.jar abc-process-batch.jar
ENTRYPOINT ["java","-jar","/abc-process-batch.jar"]