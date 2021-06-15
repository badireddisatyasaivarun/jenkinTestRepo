FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 9090
VOLUME /tmp
ADD target/booking.war booking.war
ENTRYPOINT ["java","-jar","/booking.war"]
