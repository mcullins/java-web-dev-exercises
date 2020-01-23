package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    @Test
    public void constructorSetsModelName() {
        Computer dell = new Computer("Dell");
        assertEquals("Dell", dell.getModel());
    }

    @Test
    public void contructorSetsAll(){
        Computer dell = new Computer("Dell", "1999", "Black");
        assertEquals("Dell", dell.getModel());
        assertEquals("1999", dell.getYear());
        assertEquals("Black", dell.getColor());
    }

    @Test
    public void sendEmailDrainsBattLife(){
        Computer dell = new Computer("Dell");
        dell.sendEmail("Hello World");
        assertEquals(90, dell.getBattLife());
    }
}
