import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker worker = new Worker("Simon", "Okun","000001", "Mr.", 2002, 20);

    @Test
    void testToString() {
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(800, worker.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly pay: 800.0", worker.displayWeeklyPay(40));
    }
}