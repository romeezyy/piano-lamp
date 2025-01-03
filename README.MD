# Selenium piano
**This project demonstrates how test automation tools can be creatively used to play music online with Java.**
## Description
**The project is based on the online piano site [Multiplayer Orchestra](https://multiplayer-orchestra.com/). Don't take this seriously, I wrote this project to prove my girlfriend that I can play piano too.**
## How to play
Playing the piano typically requires two hands: the left hand handles the accompaniment, while the right hand plays the main melody. Since a standard keyboard lacks enough keys for both hands simultaneously, I implemented a solution by dividing the roles into two parallel automated tests.
To play the piano, you need to write a collection consisting of note objects, note holding durations, and note rests. Then you need to pass your collection of notes for the main melody and accompaniment to the method play() (you don't have to write both, you can write one if you want).
As an example, I wrote a short excerpt from the melody **"The Game is On"** by _Michael Price_ and _David Arnold_. I hope you enjoy it. 
## Technologies and tools

This project is built with Java and utilizes the following technologies:

- **[Maven](https://maven.apache.org/):** A powerful tool for dependency management and project build automation.
- **[Selenium WebDriver](https://www.selenium.dev/):** Enables browser automation for testing web applications.
- **[JUnit 5](https://junit.org/junit5/):** Framework for writing and executing tests.
- **[WebDriverManager](https://bonigarcia.dev/webdrivermanager/):** Automatically manages browser driver binaries for Chrome, Firefox, and other browsers.
- **[Phaser](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Phaser.html):** Facilitates thread synchronization, particularly useful for multithreaded testing scenarios.
- **[ThreadLocal](https://docs.oracle.com/javase/8/docs/api/java/lang/ThreadLocal.html):** Ensures thread-safe isolation of data, providing a unique WebDriver instance for each thread during parallel test execution.
- **[Actions](https://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html):** A robust Java tool that offers flexible keystroke functionality.