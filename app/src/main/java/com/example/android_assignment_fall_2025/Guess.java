package com.example.android_assignment_fall_2025;

// DO NOT MODIFY THIS CLASS
public class Guess {
    private int value;
    private boolean isCorrect;

    public Guess(int value, boolean isCorrect) {
        this.value = value;
        this.isCorrect = isCorrect;
    }

    public int getValue() {
        return value;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
