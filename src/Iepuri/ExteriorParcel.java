package Iepuri;

public class ExteriorParcel implements IParcel {

    private IGame game;

    @Override
    public void checkContent(IRabbit rabbit) {
        game.removeRabbitFromGame(rabbit);
    }
}
