package com.moodanalyser;

public class MoodAnalyserMain {
    private String message;

    /**
     * create a default constructor name as MoodAnalyserMain
     */

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
          return "HAPPY";
    }
}
