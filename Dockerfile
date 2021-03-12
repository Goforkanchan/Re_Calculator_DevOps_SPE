FROM openjdk:8
MAINTAINER Kanchan Mahajan kanchanmahajan67@gmail.com
COPY ./target/Re_Calculator_DevOps_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Re_Calculator_DevOps_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar"]
                                                                                       
