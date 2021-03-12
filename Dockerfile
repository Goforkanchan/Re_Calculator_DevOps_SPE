FROM openjdk:8
MAINTAINER Shubham Aggarwal shubhamaggarwal890@gmail.com
COPY ./target/Re_Calculator_DevOps_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Re_Calculator_DevOps_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar"]
                                                                                       
