package org.patternExample.subscribers;

import org.patternExample.Game;

public interface Subscriber {
    void react(Game newGame);
}
