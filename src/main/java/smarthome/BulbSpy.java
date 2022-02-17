package smarthome;

public class BulbSpy implements  Bulb{
    private boolean turnOnWasCalled = false;
    @Override
    public void turnOn() {
        turnOnWasCalled = true;
    }

    @Override
    public void turnOff() {

    }

    public boolean isTurnOnWasCalled() {
        return turnOnWasCalled;
    }

}
