package by.speshkur;

import by.speshkur.coach.Coach;
import by.speshkur.configuration.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("footbalCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
/*        System.out.println("\nEmail: \n" + coach.getEmail());
        System.out.println("\nTeam: \n" + coach.getTeam());*/


        context.close();
    }
}
