package Iepuri;

public class InnerParcel implements IParcel {

    private IEggState eggState;

    @Override
    public void checkContent(IRabbit rabbit) {
        eggState.checkContent(rabbit);
        eggState = eggState.next();
    }
}
