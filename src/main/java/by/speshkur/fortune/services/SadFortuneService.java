package by.speshkur.fortune.services;

import by.speshkur.fortune.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
