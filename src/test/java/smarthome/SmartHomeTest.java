package smarthome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartHomeTest {
    @Test
    public void turnBulbOn_whenSwitchIsOn() {
        BulbSpy bulb = new BulbSpy();
        SwitchStub aSwitch = new SwitchStub();

        new SmartHome().run(bulb, aSwitch);

        assertTrue(bulb.isTurnOnWasCalled());
    }
}
