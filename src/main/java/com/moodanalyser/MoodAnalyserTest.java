package com.moodanalyser;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}

