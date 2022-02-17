package smarthome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartHomeTest {
    @Test
    public void turnBulbOn_whenSwitchIsOn() {
        BulbSpy bulb = new BulbSpy();
        AlwaysOnSwitchStub aSwitch = new AlwaysOnSwitchStub();

        new SmartHome().run(bulb, aSwitch);

        assertTrue(bulb.isTurnOnWasCalled());
        assertFalse(bulb.isTurnOffWasCalled());
    }

    @Test
    public void turnBulbOff_whenSwitchIsOff() {
        BulbSpy bulb = new BulbSpy();
        AlwaysOffSwitchStub aSwitch = new AlwaysOffSwitchStub();

        new SmartHome().run(bulb, aSwitch);

        assertTrue(bulb.isTurnOffWasCalled());
        assertFalse(bulb.isTurnOnWasCalled());
    }
}
