package exercises.technology.test;

import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone samsung;

    @Before
    public void createSmartPhone(){
        samsung = new SmartPhone("Samsung", "2019", "Silver", "Small");
    }

    @Test
    public void constructorSetsValues(){
        assertEquals("Samsung", samsung.getModel());
        assertEquals("2019", samsung.getYear());
        assertEquals("Silver", samsung.getColor());
        assertEquals("Small", samsung.getSize());
    }

    @Test
    public void ringtoneReturnsRing(){
        assertEquals("Riiiiing!", samsung.ring());
    }
}
