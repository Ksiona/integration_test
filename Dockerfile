FROM artifactorycn.netcracker.com:17003/general/openjdk-x86:8u232b09-centos771908b02
MAINTAINER netcracker

ADD controller-impl/target/controller-1.0.0-SNAPSHOT.jar /app/

CMD ["/usr/bin/java", "-Xmx64m", "-jar", "/app/controller-1.0.0-SNAPSHOT.jar"]
