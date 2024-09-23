# HackerRank-JavaChallenge

<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
<div align="center">

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

</div>

<!-- PROJECT LOGO/TITLE -->
<br />
<div align="center">
  <a href="https://github.com/aysedemirel/HackerRank-JavaChallenge">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">HackerRank-JavaChallenge</h3>
  <p align="center">
    HackerRank Java Challenge Solutions
    <br />
    <br />
    <a href="https://github.com/aysedemirel/HackerRank-JavaChallenge/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/aysedemirel/HackerRank-JavaChallenge/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#executing-program">Executing Program</a></li>
      </ul>
    </li>
    <li><a href="#key-takeaways">Key Takeaways</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About The Project

This project includes solutions to Java problems on the HackerRank platform.
While solving the problems, you can both practice Java and take a look at problem-solving
techniques.
I will present different solutions according to Worst, Average and Best Case analysis in
problem-solving.
Thus, we will be able to analyze the algorithm we created while solving the problem.
While the codes of the problem solutions are here, you can find detailed explanations on my Medium
account.

[Medium- HackerRank Solutions](https://aysedemirel.medium.com/hackerrank-java-challenge-0bce4a52707a)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

- [![made-with-java][Java-shield]][Java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->

## Getting Started

In this project, each class has its own main method.
You can copy the codes in the main method directly to the area on HackerRank to solve problems via
HackerRank.

### Prerequisites

Prerequisites to run the project:

- Java 19
- Maven

You can download and install JDK
from [this link](https://www.oracle.com/java/technologies/downloads/?er=221886),
and you can also
find [a sample installation document](https://medium.com/@aysedemirel/jdk-15-kurulumu-c02680d7d9ea)
on how to install the JDK.
To download Maven, you can refer [the link](https://maven.apache.org/download.cgi).

### Installation

How to download the project:

1. Clone the repo
   ```sh
   git clone https://github.com/aysedemirel/HackerRank-JavaChallenge.git
   ```
2. Install Maven packages (Via IDE or mvn install)

### Executing Program

How to run the project:

- Each class works independently
- Each class compile with the code (or just via IDE):
   ```sh
   javac ClassName
   ```
- After compiling, run the bytecode:
   ```sh
   java ClassName
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->

## Key Takeaways

### Introduction

**Scanner's `skip` Method:**
The `skip` method in Java's `Scanner` class allows you to skip specific patterns defined by regular expressions.
It's useful when you need to filter out certain unwanted characters from a `String` input.
For more details on the `skip` method and regular expressions, refer
to [GeeksforGeeks](https://www.geeksforgeeks.org/scanner-skip-method-in-java-with-examples/).

**HackerRank's Java If-Else Challenge:**
The provided starter code for the `Scanner` includes a `skip` method with the following
pattern: `(\r\n|[\n\r\u2028\u2029\u0085])`?.
This pattern is used to handle various line-ending characters.
For an in-depth explanation, check
out [this Stack Overflow post](https://stackoverflow.com/questions/52111077/explain-this-line-written-in-java).

**Eclipse End-of-File Issue:**
When using Eclipse, handling the end-of-file (EOF) with `scanner.hasNextLine()` can be tricky.
The `Ctrl + Z` shortcut is used to indicate EOF, but you need to click outside the console (e.g., on the editor) and
then
back into the console for it to work properly.

### Strings and Regular Expressions

**Regex Basics:**

- `\d`: Represents any digit (equivalent to `[0-9]`).
- `\d{1,2}`: Matches any one or two-digit number.
- `(0|1)`: Matches either `0` or `1`.
- `[0-5]`: Matches any single digit between `0` and `5`.
- `^`: Asserts that the match must start at the beginning of the string or line.
- `$`: Ensures that the match must occur at the end of the string or just before `\n`.

**For More Information:** Further reading on regular expressions can be found
at [GeeksforGeeks](https://www.geeksforgeeks.org/write-regular-expressions/).

You can access my detailed write-ups and step-by-step solutions for all the problems through the following links:

- [Turkish articles](https://medium.com/@aysedemirel/hackerrank-java-challenge-0bce4a52707a)
- English articles (coming soon)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Roadmap

- [x] Introduction
- [ ] Strings
- [ ] BigNumber
- [ ] Data Structures
- [ ] Object Oriented Programming
- [x] Exception Handling
- [ ] Advanced

See the [open issues](https://github.com/aysedemirel/HackerRank-JavaChallenge/issues) for a full
list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and
create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull
request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Top contributors:

<a href="https://github.com/aysedemirel/HackerRank-JavaChallenge/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=aysedemirel/HackerRank-JavaChallenge" alt="contrib.rocks image" />
</a>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->

## Contact

Ayşe Demirel Deniz - [Linkedln - aysedemirel](https://www.linkedin.com/in/ayse-demirel/) -
aysedemireldeniz@gmail.com

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

<!--URL-->

[english-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge

[turkish-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge

[contributors-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge/graphs/contributors

[forks-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge/network/members

[stars-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge/stargazers

[issues-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge/issues

[license-url]: https://github.com/aysedemirel/HackerRank-JavaChallenge/blob/master/LICENSE

[linkedin-url]: https://www.linkedin.com/in/ayse-demirel/

[Java-url]: https://www.java.com/

<!--SHIELD-->

[english-shield]: https://img.shields.io/badge/English-En-blue?style=for-the-badge

[turkish-shield]: https://img.shields.io/badge/Turkish-Tr-red?style=for-the-badge

[contributors-shield]: https://img.shields.io/github/contributors/aysedemirel/HackerRank-JavaChallenge.svg?style=for-the-badge

[forks-shield]: https://img.shields.io/github/forks/aysedemirel/HackerRank-JavaChallenge.svg?style=for-the-badge

[stars-shield]: https://img.shields.io/github/stars/aysedemirel/HackerRank-JavaChallenge?style=for-the-badge

[issues-shield]: https://img.shields.io/github/issues/aysedemirel/HackerRank-JavaChallenge.svg?style=for-the-badge

[license-shield]: https://img.shields.io/github/license/aysedemirel/HackerRank-JavaChallenge.svg?style=for-the-badge

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[Java-shield]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
