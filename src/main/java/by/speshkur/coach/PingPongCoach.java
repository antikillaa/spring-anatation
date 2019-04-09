package by.speshkur.coach;


import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    public String getDailyWorkout() {
        return "Practice your pingpong drop shot";
    }

    public String getDailyFortune() {
        return null;
    }

}
