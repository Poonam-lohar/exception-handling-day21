package com.moodanalyser;

public class MoodAnalyserMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
          return "HAPPY";
    }
}
