
# Spring Framework - Spring IOC

A POC to learn about Spring Framework and Spring IOC.
 






## Includes

1. How to create a Maven project on Eclipse IDE
2. How to write a bean specified xml configuration file
3. How Spring IOC creates and manages multiple beans / objects.

    
## Screenshots

### How to create maven project on Eclipse IDE

1. Goto File -> New -> Project -> Maven -> New Maven Project 

![Select Maven Project](https://github.com/CodeBenchers006/SpringIOC/blob/main/screenshots/01.%20Creating%20Maven%20Project.PNG?raw=true)

2. Select Maven Archetype as "maven-archetype-quickstart"

![Select Maven Archetype version](https://github.com/CodeBenchers006/SpringIOC/blob/main/screenshots/02.Selecting%20Maven%20Archetype.PNG?raw=true)

3. Give proper name to your project and create your project.

### How to create bean specified XML configuration File


![Select Maven Archetype version](https://github.com/CodeBenchers006/SpringIOC/blob/main/screenshots/03.Bean%20xml%20configuration.PNG?raw=true)

* On the src folder, click new -> file. Save as "filename.xml" with .xml extension
* Goto https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html and copy spring bean xsd lines as shown in the screenshot, this will validate the bean configuration
* <bean id="This is like assigning a reference variable" class="give full path of the class of which you object to be created and managed"></bean>

### How Spring IOC creates and manages multiple objects

![](https://github.com/CodeBenchers006/SpringIOC/blob/main/screenshots/04.IOC.PNG?raw=true)

* Spring IOC has an interface called Application Context, which provides a container to store objects into it that has been configured in the XML file. 
* This XML file is assigned to the application context using a class called ClassPathXmlConfiguration().
* Now using the reference variable of Application context we can call all the classes as you can see in the screenshot 