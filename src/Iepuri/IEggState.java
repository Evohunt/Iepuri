package Iepuri;

public interface IEggState {
    void checkContent(IRabbit rabbit);

    IEggState next();
}
