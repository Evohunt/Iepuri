package Iepuri;

import java.util.List;

public class Game implements IGame {
    private int turn;
    private List<IRabbit> rabbitsOnField;
    private List<IRabbit> rabbitsOutOfField;

    public void start() {
        while (areRabbitsOnField()) {
            incrementTurn();
            moveRabbits();
        }
    }

    private void moveRabbits() {
        for (int index = rabbitsOnField.size() - 1; index >= 0; index--) {
            IRabbit rabbit = rabbitsOnField.get(index);
            rabbit.move();
        }
    }

    private void incrementTurn() {
        turn++;
    }

    private boolean areRabbitsOnField() {
        return rabbitsOnField.size() > 0;
    }

    @Override
    public void removeRabbitFromGame(IRabbit rabbit) {
        rabbitsOnField.remove(rabbit);
        rabbitsOutOfField.add(rabbit);
    }
}
