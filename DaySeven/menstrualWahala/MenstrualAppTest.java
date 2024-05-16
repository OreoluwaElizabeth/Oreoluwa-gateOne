import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenstrualAppTest {


@Test
public void testThatCalculateNextPeriodDate() {

     LocalDate lastPeriodDate = LocalDate.parse("04/04/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     int averageCycleLength = 28;
     LocalDate expectedNextPeriodDate = LocalDate.parse("05/02/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     LocalDate actualNextPeriodDate = MenstrualApp.ThatCalculateNextPeriodDate(lastPeriodDate, averageCycleLength);

     assertEquals(expectedNextPeriodDate, actualNextPeriodDate);

    }

@Test
public void testThatCalculateOvulation() {

     LocalDate lastPeriodDate = LocalDate.parse("04/04/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     LocalDate expectedOvulationDate = LocalDate.parse("04/18/2024", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
     LocalDate actualOvulationDate = MenstrualApp.ThatCalculateOvulation(lastPeriodDate, 14);
     assertEquals(expectedOvulationDate, actualOvulationDate);

    }


  }