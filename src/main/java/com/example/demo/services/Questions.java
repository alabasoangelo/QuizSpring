package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

@Service
public class Questions {
    private static List<Question> questions = List.of(
            new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, "Paris"),
            new Question("What is 2^2?", new String[]{"3", "4", "5", "6"}, "4"),
            new Question("What is the largest ocean?", new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, "Pacific"),
            new Question("What is the highest mountain in the world?", new String[]{"Mt. Apo", "Mt. Everest", "K2", "Mt. Fuji"}, "Mt.Everest"),
            new Question("Who is the president of the United States?", new String[]{"Barrack Obama","Joe Biden","George W Bush","Donald Trump"}, "Joe Biden")
    );

    public static List<Question> getQuestions() {
        List<Question> shuffledQuestions = new ArrayList<>(questions);
        Collections.shuffle(shuffledQuestions);
        return shuffledQuestions;
    }
}