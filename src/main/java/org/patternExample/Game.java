package org.patternExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Game {
    private String name;
    private List<String> achievements;
    private String description;
    private String documentation;
}
