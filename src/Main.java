import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker sally = new Worker("Sally","Williams","0001", "Ms. ", 2002,20);
        workers.add(new Worker("Lisa","Simpson","000001","Mrs.",1956,18));
        workers.add(new Worker("Homer","Simpson","000002","Mr.",1956,16));
        workers.add(new Worker("Bart","Simpson","000003","Mr.",1991,10));
        workers.add(new SalaryWorker("Sam","Bosson","000004","Mr.",2002,20,41000));
        workers.add(new SalaryWorker("Evan","Pugh","000005","Mr.",2002,22,45000));
        workers.add(new SalaryWorker("Brody","Osborne","000006","Mr.",2002,24,50000));


        int [] weeklyHours = {40, 50, 40};
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + ": ");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.fullName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}