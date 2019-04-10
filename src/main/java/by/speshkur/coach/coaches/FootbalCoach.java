package by.speshkur.coach.coaches;

import by.speshkur.coach.Coach;
import by.speshkur.fortune.FortuneService;

public class FootbalCoach implements Coach {

    FortuneService fortuneService;

    public FootbalCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Play with ball for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
