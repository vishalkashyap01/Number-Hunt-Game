# Number Guessing Game

## Overview
The Number Guessing Game is a simple Java console application where the player attempts to guess a randomly generated number between 1 and 100. The program provides hints to the player about whether their guess is too high or too low, and keeps track of the number of attempts made. Based on the number of attempts, a remark is given at the end of the game.

## Features
- Random number generation between 1 and 100.
- User input validation to ensure guesses are within the valid range.
- Hints to guide the player if their guess is too high or too low.
- A scoring system that tracks the number of attempts.
- Exit option for the player to quit the game at any time by entering `404`.
- Remarks based on the number of attempts taken to guess the number correctly.

## How to Play
1. The game will prompt you to guess a number between 1 and 100.
2. Enter your guess and press Enter.
3. The game will provide hints if your guess is too high or too low.
4. Continue guessing until you find the correct number or decide to quit the game.
5. To exit the game, enter `404`.

## Instructions to Run
1. Ensure you have Java installed on your system.
2. Download the `Guess.java` file.
3. Open a terminal or command prompt.
4. Navigate to the directory where `Guess.java` is saved.
5. Compile the Java file using the following command:
    ```
    javac Guess.java
    ```
6. Run the compiled Java program using the command:
    ```
    java Guess
    ```

## Example Gameplay
<<< Welcome 2 Number Guessing Game >>>

---Guess a number between 1 to 100---
for exit game - 404!
>>> : 50

big & close...keep decreasing!
>>> : 25

small...increase number!
>>> : 35

Well-done!!!

Total chances: 3
Remark: Excellent!
