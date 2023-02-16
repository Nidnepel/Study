package org.patternExample.subscribers;

import lombok.AllArgsConstructor;
import org.patternExample.Game;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class Gamer implements Subscriber {
    private String name;
    @Override
    public void react(Game newGame) {
        List<String> achievements = newGame.getAchievements();
        HashSet<String> receivedAchievements = new HashSet<>();
        var rnd = new Random();
        for (int t = 0; t < achievements.size(); ++t) {
            int achievementIndex = rnd.nextInt(achievements.size());
            receivedAchievements.add(achievements.get(achievementIndex));
        }
        StringBuilder result = new StringBuilder();
        result.append("Gamer ");
        result.append(name);
        result.append("\nTitle : ");
        result.append(newGame.getName());
        result.append("\nAchievements: ||");
        receivedAchievements.forEach(el -> result.append(el).append(" || "));
        result.append('\n');
        System.out.println(result);
    }
}
