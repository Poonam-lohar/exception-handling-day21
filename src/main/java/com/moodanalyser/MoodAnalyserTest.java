package com.moodanalyser;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
        @Test
        public void given_AnyMood_Should_Return_HAPPY() {
            MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
            String mood = moodAnalyser.analyseMood("I am in Any Mood");
            Assert.assertEquals(mood, "HAPPY");
        }
    }
