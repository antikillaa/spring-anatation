package by.speshkur.coach;


import by.speshkur.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PingPongCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;


    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    public String getDailyWorkout() {
        return "Practice your pingpong drop shot";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void post() {
        System.out.println("\n> PostConstruct method");
    }

    @PreDestroy
    public void after() {
        System.out.println("\n>> PreDestroy method");
    }

}
