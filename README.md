# BDDFramework
A maven project to automate scenarios of Sauce Demo website constructed by following BDD framework. 
It uses Gherkin syntax in feature files. It follows a Page Object Model (POM) design pattern in the project, which basically means all pages of the Website have their individual class files. Since it is a Maven project it consists of 4 main directories  which are :
a.) src/main/java
b.) src/main/resources
c.) src/test/java
d.) src/test/resources
While constructing a Maven project one has to keep following things in mind:
a.) The tests which are repetative like driver initialization, cross-browser driver initialization such files we keep under a directory named utils at src/main/java/utils
b.) The feature files written in Gherkin syntax which involves keywords like Scenario, Given, When, Then, And etc. are kept under src/test/resources/Features. Under Features folder indiviual feature files corresponding to their respective pages in the website can be kept. eg. LoginPage.feature, HomeScreenPage.feature etc.
c.) Corresponding to the scenarios and steps written in above feature files, there has to be Step Defination files which are basically methods/functions written in Java. These step definition files are kept at src/test/java/StepDefinition. For eg. LoginPageDefinition.java, HomePageDefinition.java etc. They will hold methods that correspond to feature files.
d.) What ever WebElements are present on a WebPage and the actions to be done on those elements are all stored at src/test/java/PageObjects. One needs to locators of these WebElemets in a class and define methods to performs action on these WebElements. These methods are called in StepDefinition files.
All dependencies related to Selenium, maven, testng, maven - surefire plugin are added to POM.xml file
One has to add a TestRunner.java file at src/test/java/TestRunner path.
Following above one contructs a Maven project using POM design.
You need to run mvn clean test for your TestRunner file which will build your project, install all dependencies and then run the project as well as generate reports too.
