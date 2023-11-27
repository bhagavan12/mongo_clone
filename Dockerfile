# Use the official Tomcat base image with Java 11
FROM tomcat:9.0-jre11

# Remove the default ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy the WAR file into the Tomcat webapps directory with the name 'ROOT.war'
COPY target/mongo_clone-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 9876

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]
