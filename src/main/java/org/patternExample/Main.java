package org.patternExample;

import org.patternExample.subscribers.Developer;
import org.patternExample.subscribers.GameReviewer;
import org.patternExample.subscribers.Gamer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gamer firstPlayer = new Gamer("first player"), secondPlayer = new Gamer("second player"), thirdPlayer = new Gamer("third player");
        var reviewer = new GameReviewer();
        var developer = new Developer();
        var notificator = new NewGameNotificator();
        notificator.AddSubscriber(firstPlayer);
        notificator.AddSubscriber(secondPlayer);
        notificator.AddSubscriber(thirdPlayer);
        notificator.AddSubscriber(reviewer);
        notificator.AddSubscriber(developer);
        ArrayList<String> firstAchievementsList = new ArrayList<>(), secondAchievementsList = new ArrayList<>();
        firstAchievementsList.add("No game - No life");
        firstAchievementsList.add("Dota is my world");
        firstAchievementsList.add("Dota is my world");
        firstAchievementsList.add("You're hamster");
        firstAchievementsList.add("Legend of the crabs");
        firstAchievementsList.add("You're really game addict");
        secondAchievementsList.add("A");
        secondAchievementsList.add("B");
        secondAchievementsList.add("V");
        secondAchievementsList.add("G");
        secondAchievementsList.add("D");
        secondAchievementsList.add("E");
        secondAchievementsList.add("YO");
        Game firstGame = new Game("Dota", firstAchievementsList,
                "Dota is coolest game in the world!", "Zero iq documentation"),
                secondGame = new Game("Cs Go ", secondAchievementsList,
                        "CS GO iS RUBBISH", "ONE MILLION IQ DOCUMENTATION");
        notificator.ReleaseNewGame(firstGame);
        System.out.println("\n\n\nNEW RELEASE\n\n\n");
        notificator.ReleaseNewGame(secondGame);
    }
}