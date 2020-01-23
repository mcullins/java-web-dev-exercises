package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LaptopTest {

    Laptop dell;

    @Before
    public void buildLaptop() {
        dell = new Laptop("Dell", "2019", "Pink", 5);
    }

    @Test
    public void checkConstructorExtends(){
        assertEquals("Dell", dell.getModel());
        assertEquals("2019", dell.getYear());
        assertEquals("Pink", dell.getColor());
        assertEquals(5, dell.getWeight());
    }

    @Test
    public void checkIdIncrements(){
        Laptop lenovo = new Laptop("Lenovo", "2017", "Silver", 1);
        assertEquals(2, lenovo.getId());
    }

    @Test
    public void checkMeasureWeight(){
        assertEquals("The weight of this device is: 5", dell.measureWeight());
    }
}
