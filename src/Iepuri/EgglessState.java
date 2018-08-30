package Iepuri;

public class EgglessState implements IEggState {
    private IEggState nextState;

    @Override
    public void checkContent(IRabbit rabbit) {
        // nimic
    }

    @Override
    public IEggState next() {
        return nextState;
    }
}
