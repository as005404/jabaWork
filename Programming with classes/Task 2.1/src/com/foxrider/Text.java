package com.foxrider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    List<Sentence> text;

    Text(Sentence ...sentences){
        text = new ArrayList<>();
        this.text.addAll(Arrays.asList(sentences));
    }

    public Text appendText(String text){
        this.text.add(new Sentence(text));
        return this;
    }
    public Text appendText(Word text){
        this.text.add(new Sentence(text.getWord()));
        return this;
    }

    public void showText(){
        for (int i = 0; i < text.size(); i++) {
            System.out.println(text.get(i).getSentence());
        }
    }

    public void showTitle(){
        System.out.println(text.get(0).getSentence());
    }
}
