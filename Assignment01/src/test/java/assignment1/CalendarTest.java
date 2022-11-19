package assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarTest {
    @Test
    public void NotLeapyear() throws DateException {
        Calendar date = new Calendar("28/02/2013");
        date.addDay();
        assertEquals(date.toString(), "01/03/2013");
    }

    @Test
    public void NonLeapYear() {
        boolean exception = false;
        try {
            Calendar date = new Calendar("29/02/2013");
        } catch (DateException e) {
            System.out.println("Date is  not correct");
            exception = true;
        } finally {
            assertTrue(exception);
        }
    }
    @Test
    public void LeapYear() throws DateException {
        Calendar date = new Calendar("29/02/2000");
        date.addDay();
        assertEquals(date.toString(), "01/03/2000");
    }
    @Test
    public void TestMonth30Days() throws DateException {
        Calendar date = new Calendar("30/04/2013");
        date.addDay();
        assertEquals(date.toString(), "01/05/2013");
    }

}