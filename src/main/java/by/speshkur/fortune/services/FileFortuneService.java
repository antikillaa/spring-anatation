package by.speshkur.fortune.services;

import by.speshkur.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    @Value("${fileFortune.filename}")
    private String fileName;
    private List<String> theFortunes = new ArrayList<>();
    private Random myRandom = new Random();

    public String getFortune() {
        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(theFile))) {
            String tempLine;
            while ((tempLine = reader.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int index = myRandom.nextInt(theFortunes.size());

        return theFortunes.get(index);
    }
}
