package by.speshkur.configuration;

import by.speshkur.coach.Coach;
import by.speshkur.coach.coaches.FootbalCoach;
import by.speshkur.coach.coaches.SwimCoach;
import by.speshkur.fortune.FortuneService;
import by.speshkur.fortune.services.MiddleFortuneService;
import by.speshkur.fortune.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.speshkur")
@PropertySource("classpath:sport.properties")

public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    public MiddleFortuneService middleFortuneService() {
        return new MiddleFortuneService();
    }

    @Bean
    public Coach footbalCoach() {
        return new FootbalCoach(middleFortuneService());
    }

}
