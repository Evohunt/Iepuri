package Iepuri;

public class MoveToNorth implements IMovementDirection {

    private IPosition position;
    private IMovementDirection nextState;

    @Override
    public void move() {
        position.decrementLine();
    }

    @Override
    public IMovementDirection next() {
        return nextState;
    }
}
