package Iepuri;

public class MoveToWest implements IMovementDirection {

    private IPosition position;
    private IMovementDirection nextState;

    @Override
    public void move() {
        position.decrementColumn();
    }

    @Override
    public IMovementDirection next() {
        return nextState;
    }
}
