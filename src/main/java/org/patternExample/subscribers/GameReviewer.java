package org.patternExample.subscribers;

import org.patternExample.Game;

public class GameReviewer implements Subscriber{
    @Override
    public void react(Game newGame) {
        String result = "journalist :" +
                "\nGame description : " +
                newGame.getDescription() +
                '\n';
        System.out.println(result);
    }
}
