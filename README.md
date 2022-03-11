
# 7Mind Application Sample Automation 

This is a sample automation project using the application 7Mind application. 
Where, only Register and Login functionalities have been automated.
This file is for presentation purpose.

The Project include :
-	Technologies:
-	Selenium
-	Java
-	Appium (GUI and Inspector)
-	TestNG
-	Maven

Here in this repository excel file shows the documentation of the test cases and test scenarios.
Which include :
  - App Logo
  - App Launch
  - Welcome function
  - Register functionality
  - Login functionality
  - Forgot Password functionality


The automated source package is started named after 7Mind.

This Project uses POM (Page Object Model ).
As Follows the folder structure.




```
7Mind
├── src
|    |──test
|    |     |──java
|    |           |──com.sevenMind.PageObjects
|    |           |──com.sevenMind.testCases
|    |           |──com.sevenMind.utilities
|    |──resources
|            
|─── Configurations            
|─── ScreenShots            
|─── test- output            
|─── application.log            
|─── pom.xml            
|─── testng.xml                     
                       
```



To run this Project

Basic Installations :
- JAVA JDK 
- Eclipse IDE 
    and set the Environmet Valiable JAVA_HOME.
    
 Appium installations :
  (click the links to proceed)

## Step 1:-
  Install [Appium GUI](https://appium.io/).
      - click Download Appium button it will navigate to a Gitub Page.
      - then click on the link which specifies Appium-Server-GUI-windows-(Version Number).exe  (for windows systems).
      - after downloading the .exe package contiue procedure of installation.
      - start the application by double tap on  icon. 


when app opens it looks like this

   ![appium gui ](https://user-images.githubusercontent.com/52613470/157946686-5d198747-ee3d-472e-aa9e-85567654cdb8.png)

- click on start server button.
Step 2:
- Connect your mobile device to the system, 
- If you dont have virtual mobile options in your system 
- install [Air Droid] (https://www.airdroid.com/de/download/airdroid-personal/) for Desktop as well as mobile and complete the login process also make sure devices connected.

Step 3 :
- Download the project from [this](https://github.com/Rajesh-medipally/Appium-Project) github page.
- open eclipse.
- click File-> Open File -> select folder 7Mind. (make sure eclipse has maven installed).
- sync the project to eclipse 
- open 7Mind-> Configurations -> config.properties file
- it looks like below 
- 
