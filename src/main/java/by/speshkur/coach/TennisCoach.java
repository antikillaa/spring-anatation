package by.speshkur.coach;

import by.speshkur.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

/*    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public TennisCoach() {
        System.out.println(">>> TennisCoach: inside default constructor");
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
        }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

/*    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>> TennisCoach: inside setFortuneService method");

        this.fortuneService = fortuneService;
    }

    @Autowired
    public void doSomeCreazyThing(FortuneService fortuneService) {
        System.out.println(">>> TennisCoach: inside doSomeCreazyThing method");
        this.fortuneService = fortuneService;
    }*/
}
