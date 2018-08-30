package Iepuri;

public interface IPosition {
    void decrementLine();
    void incrementLine();
    void decrementColumn();
    void incrementColumn();

    void checkContent(IRabbit rabbit);
}
