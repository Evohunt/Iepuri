package Iepuri;

public class EggState implements IEggState {
    private IEggState nextState;
    private IEgg egg;

    @Override
    public void checkContent(IRabbit rabbit) {
        rabbit.take(egg);
    }

    @Override
    public IEggState next() {
        return nextState;
    }
}
