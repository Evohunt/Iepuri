package Iepuri;

public class Rabbit implements IRabbit {

    private IPosition position;
    private IMovementDirection movementDirection;
    private IBasket basket;


    @Override
    public void move() {
        movementDirection.move();
        position.checkContent(this);
    }

    @Override
    public void take(IEgg egg) {
        basket.add(egg);
        movementDirection = movementDirection.next();
    }


}
