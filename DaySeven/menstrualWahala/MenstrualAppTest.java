import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenstrualAppTest {


@Test
public void testThatCalculateNextPeriodDate() {

     LocalDate lastPeriodDate = LocalDate.parse("04/04/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     int averageCycleLength = 28;
     LocalDate expectedNextPeriodDate = LocalDate.parse("o5/o2/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     LocalDate actualNextPeriodDate = MenstrualApp.ThatCalculateNextPeriodDate(lastPeriodDate, averageCycleLength);

     assertEquals(expectedNextPeriodDate, actualNextPeriodDate);

    }


  }