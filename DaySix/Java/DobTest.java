import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DobTest {

    @Test
    public void testCalculateAge() {
        String dateOfBirth = "4/05/1999";
        int expectedAge = 25;

        int actualAge = DateOfBirth.calculateAge(dateOfBirth);

        assertEquals(expectedAge, actualAge);

     }

}