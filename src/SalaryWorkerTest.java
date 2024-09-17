import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker salaryWorker = new SalaryWorker("Simon", "Okun","000001", "Mr.", 2002, 20,52000);
    @Test
    void testToString() {
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, salaryWorker.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly Pay (from yearly salary): 1000.0", salaryWorker.displayWeeklyPay(40));
    }
}