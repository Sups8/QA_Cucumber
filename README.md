# GUI TESTS

This Project is about automating the websites for the search functionality using Selenium in BDD.

## URL

www.google.com

www.expedia.com


### Installation

Step 1: Install Java 8

https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Step 2: Install Maven 3.3.1 or higher

```bash
brew install maven
```

Step 3: Install IntelliJ IDEA (Community version)

https://www.jetbrains.com/toolbox/app/

Step 4: Install IntelliJ IDEA Cucumber for Java plugin

https://www.jetbrains.com/help/idea/managing-plugins.html

Step 5: Install Selenium Standalone Server

https://www.seleniumhq.org/download/

Step 6: Install ChromeDriver

http://chromedriver.chromium.org/

#### Configuration

Setup IntelliJ Preferences

   * Open IntelliJ and Click on New Project. 
        
   * Select Maven and make sure the Project SDK is Java version 8. (If it's not present, add New and select Java 8).
   
   * Provide relevant name for GroupID and ArtifactId and press Next.
   
   * Select the location where you want your tests to be present and then you are good to go.
   
   * Add all the required dependencies in POM file and run below command in the terminal
   
   ```bash
   mvn compile
   ```
   * In IntelliJ: File > Project Structure
   
        * Check the Libraries: Selenium and JDK1.8 need to be here
        
        * Check the SDKs: 1.8 needs to be here

##### Run

Click on Add Config present on the right side and do the below configuration - 

Program arguments:  

--plugin org.jetbrains.plugins.cucumber.java.run.CucumberJvm2SMFormatter --monochrome

[![Screenshot-2019-04-30-at-23-51-20.png](https://i.postimg.cc/nzkDvbMY/Screenshot-2019-04-30-at-23-51-20.png)](https://postimg.cc/XGrqbPfp)

Click on Play Button to run the test.