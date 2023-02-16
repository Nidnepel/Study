package org.patternExample;


import org.patternExample.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewGameNotificator {
    private Game lastGame;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void AddSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void ReleaseNewGame(Game newGame) {
        lastGame = newGame;
        subscribers.forEach(el -> el.react(lastGame));
    }


}
