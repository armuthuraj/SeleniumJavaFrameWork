package runningTestNGusingJenkins;

public class RunningTestNGusingJenkinsDemo {

}

/*For integration with Jenkins + Git : When you have provided your github url in the git section of jenkins job, when you run your job you can goto the logs and see the location where the project is cloned from github on the system, you can use the same folder location in your commands. Another way is you can put the parent folder location in Jenkins job ＞ General ＞ Advanced ＞ Custom workspace. Now all locations will be taken relative to this so you can only provide the location starting from here. For example you can see this video - https://www.youtube.com/watch?v=U6Ty0...

How to setup Jenkins
Create job and run Selenium tests

helpful
tips

Prerequisite
Generate commands to run tests from command line

How to run Selenium TestNG tests from command line
https://www.youtube.com/watch?v=lQCyV...

How to setup Jenkins

Step 1
Download jenkins.war file
https://jenkins.io/download/

Step 2
Run Jenkins
java -jar jenkins.war
java -jar jenkins.war --httpPort=9090


Create job and run Selenium tests

Step 1
Create a new freestyle job

Step 2
Add details
Add commands to run Selenium tests

Step 3
Apply and Save

Step 4
Run and validate

Add Selenium test report or TestNG report using plugins in case if you want to generate any report at the end of each build

*/