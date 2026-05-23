# 🚀 CodingBat - Warmup-1 Java Suolution Journal

This repository contains the **Warmup-1** level Java problem solutions from the CodingBat platform. I focus on clear logic, basic algorithms, and defensive programming principles.

I will explain the logic of problems and solutions by my approach which are make it stronger with my personal comments.

I use the intellij IDEA IDE for solving the problems .

! Some solutions may be diffrent from the official solutions.

## 📌 Project Standards
* **Naming Convention:** Class and file names follow Java standards (CamelCase, e.g., `QXXProblemName.java`).
* **Main Goal:** Improve coding logic and write clean, optimized code.
* **Security Notes:** Basic validation notes are added for real-world scenarios.

-----

### 1. Exercise: `Q[01][SleepIn].java`

* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p187868)
* **Problem Statement:** The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
* **Problem Logic:** The system checks if we can sleep in. We can sleep if it is not a weekday or if we are on vacation.


* **What I Achieved:** 
* Using the logical OR operator (`||`) and the logical NOT operator (`!`).
* I had a problem which is hard to find solution for me, so I made a search for using the solution. I created a new method for taking input and displaying the result to see the result on my IDE.
* Also I had a problem while creating the first folders for ProblemSolving folder and integrate to github, then I solved the problem.
* This problem was a short and easy problem for me but I had a lot of difficulties in solving it that is why I spent a lot of time on it. I improved my skills in solving this problem.
* There were a lot of options to break the program but my target was just create the logic of solution, then I completed the program without defensive perspective.

-----

### 2. Exercise: `Q[02][monkeyTrouble].java`

* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p181646)
* **Problem Statement:** We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
* **Problem Logic:** The system checks whether both monkeys are smiling or not smiling at the same time. If both conditions are the same, it means we are in trouble.


* **What I Achieved:** 
* Although the problem was short and simple, I spent time understanding the logic completely. 
* I improved my programming logic and simplified the code structur
* There were a lot of options to break the program but my target was just create the logic of solution, then I completed the program without defensive perspective.

-----

### 3. Exercise: `Q[03][sumDouble].java

* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p154485)
* **Problem Statement:** 
Given two int values, return their sum. Unless the two values are the same, then return double their sum. Given test cases were used and displayed on the console.
* **Problem Logic:** The method checks if the two inputs (a and b) are equal. If they are equal, it multiplies the sum by 2; otherwise, it returns the standard sum.

* **What I Achieved:** 
* I learned how to create test cases and print their outputs side-by-side inside the `main` method.
* **Skill Development:** Compared to my first exercises (where I used user inputs), I advanced my skills by creating automated test cases side-by-side. While keeping the old solutions as a sign of my improvement, I learned to make the code faster and more readable.

-----

### 4. Exercise: `Q[04][diff21].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p116624)
* **Problem Statement:** Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
* **Problem Logic:** The method checks if `n` is greater than 21. If it is, the difference is multiplied by 2. Otherwise, the standard difference is returned.

-----

### 5. Exercise: `Q[05][parrotTrouble].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p140449)
* **Problem Statement:** We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
* **Problem Logic:** The method evaluates two conditions: the parrot must be talking, and the time must be outside the safe hours (between 7 and 20). If the parrot talks during "trouble hours" (before 7:00 or after 20:00), it returns true.


* **What I Achieved:** 
* In my first try, I used to forget to add static keyword to the main method which has using. Then I tried to see results for test cases but I didn't see the results. Then I added the 'static' then problem was solved. 

-----

### 6. Exercise: `Q[06][makes10].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p182873)
* **Problem Statement:** Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
* **Problem Logic:** Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


* **What I Achieved:** 
* I copmleted the problem easily and correctly. 

-----

### 7. Exercise: `Q[07][nearHundred].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p184004)
* **Problem Statement:** Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.  


* **What I Achieved:** 
* The task required me to to use 'Math.abs()' method to get the absolute value of the number. I learned how to use the 'mat.abs()' method.
* Creating the logic was different from the previous exercises and my general using of the statements.

-----

### 8. Exercise: `Q[08][posNeg].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p159227)
* **Problem Statement:**
  Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. 


* **What I Achieved:** 
* I forgot to add the 'static' keyword to the main method. I took an error message and I corrected it.

-----

### 9. Exercise: `Q[09][notString].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p191914)
* **Problem Statement:** Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


* **What I Achieved:** 
* I learned to use '.equals()' method to compare two strings.
* I learned to use the '.substring()' method to get a substring from a string. Also I learned to combine it with another method to get a new string.

-----

### 10. Exercise: `Q[10][missingChar].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p190570)
* **Problem Statement:** Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


* **What I Achieved:**
* I learned to bypass a specific index of a string by splitting. Then I learned to combine it with another splitted string to get a new string.

-----

### 11. Exercise: `Q[11][frontBack].java`
* **Source:** [CodingBat - Warmup-1](http://codingbat.com/prob/p123384)
* **Problem Statement:** 


* **What I Achieved:** 
* Divided the string into three logical parts: `first`, `middle`, and `last`, then combined them in a new order.

-----

### 12. Exercise: `Q[12][front3].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p136351)
* **Problem Statement:** Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


* **What I Achieved:**
* I used conditional checking to handle strings with less than 3 characters.
* I practiced using the 'substring()' method to get a substring from a string.

-----

### 13. Exercise: `Q[13][backAround].java`
* **Source:** [CodingBat - Warmup-1](https://codingbat.com/prob/p161642)
* **Problem Statement:** Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


* **What I Achieved:** 
* I practiced using the 'substring()' method to get a substring from a string.

-----

### 14. Exercise: `Q[14][title14].java`
* **Source:** [CodingBat - Warmup-1](link14)
* **Problem Statement:**


* **What I Achieved:** 

-----

### 15. Exercise: `Q[15][title15].java`
* **Source:** [CodingBat - Warmup-1](link15)
* **Problem Statement:**


* **What I Achieved:** 

-----