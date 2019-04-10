package by.speshkur;

import by.speshkur.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {


    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("swimCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

//        System.out.println(tennisCoach.getEmail());
//        System.out.println(tennisCoach.getTeam());


        context.close();
    }

}
