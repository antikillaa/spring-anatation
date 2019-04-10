package by.speshkur.fortune.services;

import by.speshkur.fortune.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    public String getFortune() {
        String[] fortunesList =
                {
                        "You are lucky",
                        "Your are unlucky",
                        "Hello world"
                };

        Random random = new Random();
        int i = random.nextInt(fortunesList.length);

        return fortunesList[i];
    }
}
