package by.speshkur.coach;

import by.speshkur.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout() {
        return "Swim Harder!!!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
