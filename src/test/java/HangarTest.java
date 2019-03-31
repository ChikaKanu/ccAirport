import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Hangar hangar;

    @Before
    public void before() {
        hangar = new Hangar( "WestHangar");
    }

    @Test
    public void canGetHanger() {
        assertEquals("WestHangar", hangar.getHangar());
    }

    @Test
    public void canAddHanger() {
        hangar.addHangar("SouthHangar");
        assertEquals("SouthHangar", hangar.getHangar());
    }
}
