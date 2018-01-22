package br.com.valdecipedroso.javajoker;

import java.util.Random;

public class Joker {
    //http://www.jokesoftheday.net/tag/short-jokes/
    private static final String[] Jokers = new String[]{
            "A drummer who became a policeman was pounding a beat.",
            "Feather dusters are used to clean parakeets.",
            "There was a joke about fishing I was going to tell you. Oh no, I forgot the line",
            "Rabbit relationships are based on a financial transaction. If he's got the doe she gets a buck",
            "Moonlighting at stand-up comedy, the baker was known for his rye humor",
            "A drummer who became a policeman was pounding a beat",
            "I lost my job at the quarry, I guess you could say I've hit rock bottom",
            "I just got a car phone. I'm not here at the moment. Leave me a message and I'll call you when I'm out",
            "There was a joke about fishing I was going to tell you. Oh no, I forgot the line!",
            "I lost my job at the quarry, I guess you could say I've hit rock bottom."};

    public Joker() {
    }

    private static String[] getJokers() {
        return Jokers;
    }

    public String tellJoker(){
        Random position = new Random();

        return getJokers()[position.nextInt(10)];
    }
}
