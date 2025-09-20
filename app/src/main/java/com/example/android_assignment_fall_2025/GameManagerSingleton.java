package com.example.android_assignment_fall_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManagerSingleton {
    private static GameManagerSingleton instance;
    private int targetNumber;
    private int guessCount;
    private List<Guess> guesses;

    // DO NOT MODIFY!
    private GameManagerSingleton() {
        resetGame();
    }

    // DO NOT MODIFY!
    public static GameManagerSingleton getInstance() {
        if (instance == null) {
            instance = new GameManagerSingleton();
        }
        return instance;
    }

    // TODO 2: Implement addGuess functionality
    // Hint : You might wanna consider how to store guesses and keep count of how many guesses have been made
    public void addGuess(Guess guess) {
        guesses.add(guess);
        guessCount++;
    }

    // DO NOT MODIFY BELOW THIS!!
    public String checkGuess(int guessValue) {
        if (guessValue == targetNumber) {
            addGuess(new Guess(guessValue, true));
            return "Correct! 🎉 The number was " + targetNumber;
        } else if (guessValue < targetNumber) {
            addGuess(new Guess(guessValue, false));
            return "Too Low!";
        } else {
            addGuess(new Guess(guessValue, false));
            return "Too High!";
        }
    }

    public void resetGame() {
        guesses = new ArrayList<>();
        guessCount = 0;
        targetNumber = new Random().nextInt(100) + 1; // 1–100
    }

    public int getGuessCount() {
        return guessCount;
    }

    public List<Guess> getGuesses() {
        return guesses;
    }
}
