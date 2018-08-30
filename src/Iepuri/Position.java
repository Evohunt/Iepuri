package Iepuri;

public class Position implements IPosition {

    private int line;
    private int column;
    private IParcel[][] parcel;

    @Override
    public void decrementLine() {
        line--;
    }

    @Override
    public void incrementLine() {
        line++;
    }

    @Override
    public void decrementColumn() {
        column--;
    }

    @Override
    public void incrementColumn() {
        column++;
    }

    @Override
    public void checkContent(IRabbit rabbit) {
        parcel[line][column].checkContent(rabbit);
    }
}
