package com.foxrider;

import java.security.SecureRandom;

public class Sentence {
    StringBuilder sentence;

    Sentence(String a){
        sentence = new StringBuilder(a);
    }

    public StringBuilder getSentence() {
        return sentence;
    }
}
