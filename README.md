jsr363-showcase
===============

JSR 363: Units of Measurement API Showcase


To Build please do the following

Fork/Download the unit-api from the following github url
https://github.com/unitsofmeasurement/unit-api

Build it in local 
mvn clean install

Then build the unit-showcase project


TODO -- Once the unit-api is available in central repo, pom to be modified to be fetched from there.


Set up instructions
====================

1. To start with if you have not done already download netbeans for EE, add Java EE plugin. 
2. If you have not installed maven already, download it from http://maven.apache.org/download.cgi and follow the set up steps
3. In the command line traverse to directory where you have downloaded the code, and do a mvn clean install
4. Open Netbeans and open the project ( in our case just select the directory you downloaded the code to)
5. In netbeans go to "services" view and see if "Servers" show up ( if not you have to go to tools-> plugins and select all plugins related to Java EE)
6. Right click on "servers" and chose new Glassfish server. If not downloaded already accept terms and conditions and Netbeans will download for you
7. Once you have set this up, right click on the project and say run. You should be able to see the sample JSF pages Raj created for us.
