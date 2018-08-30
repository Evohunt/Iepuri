package Iepuri;

public class MoveToSouth implements IMovementDirection {

    private IPosition position;
    private IMovementDirection nextState;

    @Override
    public void move() {
        position.incrementLine();
    }

    @Override
    public IMovementDirection next() {
        return nextState;
    }
}
