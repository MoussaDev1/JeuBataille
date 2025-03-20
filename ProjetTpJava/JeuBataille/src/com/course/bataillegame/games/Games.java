package com.course.bataillegame.games;

import com.course.bataillegame.controller.GameController;
import com.course.bataillegame.model.Deck;
import com.course.bataillegame.view.View;

public class Games {
    public static void main (String[] args){
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}
