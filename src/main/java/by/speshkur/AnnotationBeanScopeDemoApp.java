package by.speshkur;

import by.speshkur.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach firstCoach = context.getBean("tennisCoach", Coach.class);

        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (firstCoach == secondCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for firstCoach: " + firstCoach);

        System.out.println("\nMemory location for secondCoach: " + secondCoach);

        context.close();
    }
}
