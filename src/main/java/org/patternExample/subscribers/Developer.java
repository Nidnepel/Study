package org.patternExample.subscribers;

import org.patternExample.Game;

public class Developer implements Subscriber{
    @Override
    public void react(Game newGame) {
        String result = "developer :" +
                "\nGame documentation : " +
                newGame.getDocumentation() +
                '\n';
        System.out.println(result);
    }
}
