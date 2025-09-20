package com.example.android_assignment_fall_2025;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    // TODO 7: Write a unit test for ensuring correct behavior of checkGuess in GameManagerSingleton
    @Test
    public void test_check_guess_behavior() {
        GameManagerSingleton gm = GameManagerSingleton.getInstance();
        gm.resetGame();

        // Test that guesses are being tracked
        int initialGuessCount = gm.getGuessCount();
        assertEquals(0, initialGuessCount);

        // Test "Too Low" feedback
        String feedbackLow = gm.checkGuess(0);
        assertEquals("Too Low!", feedbackLow);
        assertEquals(1, gm.getGuessCount());

        // Test "Too High" feedback
        String feedbackHigh = gm.checkGuess(101);
        assertEquals("Too High!", feedbackHigh);
        assertEquals(2, gm.getGuessCount());

        // Test that guesses are stored
        assertEquals(2, gm.getGuesses().size());
    }
}
