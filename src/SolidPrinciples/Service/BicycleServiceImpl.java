package SolidPrinciples.Service;

public class BicycleServiceImpl implements BikeService{

    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle has no engine");
    }

    @Override
    public void accelerate() {
        /*
        accelerates bicycle
         */
    }
}
