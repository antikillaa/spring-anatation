package by.speshkur.fortune.services;

import by.speshkur.fortune.FortuneService;

public class MiddleFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your normal day";
    }
}
