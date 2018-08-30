package Iepuri;

public class MoveToEast implements  IMovementDirection {

    private IPosition position;
    private IMovementDirection nextState;

    @Override
    public void move() {
        position.incrementColumn();
    }

    @Override
    public IMovementDirection next() {
        return nextState;
    }
}
