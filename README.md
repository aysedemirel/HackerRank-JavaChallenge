# HackerRank-JavaChallenge
Hacker Rank Java Challenge Repository

## What I learned:
### Introduction
About Scanner: skip method is ignoring the pattern what you want. You want a String input, and don't want some characters, you can use <b>skip</b> method. </br>
The pattern is a regular expression. For more info about regular exp. and skip method : 
(https://www.geeksforgeeks.org/scanner-skip-method-in-java-with-examples/)
(https://www.vogella.com/tutorials/JavaRegularExpressions/article.html)

In JavaIfElse Challenge, HackerRank gives you a start code for scanner. There is a skip method with a pattern to ignore. I didn't know the meaning the pattern excatly. </br>
Pattern is : <b>"(\r\n|[\n\r\u2028\u2029\u0085])?" </b> </br>
I found an explanation for the pattern: (https://stackoverflow.com/questions/52111077/explain-this-line-written-in-java)

Eclipse has a problem with end-of-file. Normally, Ctrl-Z is ended line and you can control it with scanner.hasNextLine(). </br>
But in Eclipse, before Ctrl-Z you should click anywhere except consol (I clicked editor) and click consol again, now you can end with Ctrl-Z. :)



### Strings

**Regex**

- \d represents digits in regular expressions, same as [0-9]
- \\d{1, 2} catches any one or two-digit number
- (0|1) means zero or one
- [0-5] means between 0 to 5
- ^  tells the computer that the match must start at the beginning of the string or line.
- $ tells the computer that the match must occur at the end of the string or before \n at the end of the line or string.
- More: https://www.geeksforgeeks.org/write-regular-expressions/







