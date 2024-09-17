public class Worker extends Person{
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    private double hourlyPayRate;


    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " hourlyPayRate=" + hourlyPayRate +
                "}";
    }

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            double overTime = hoursWorked - 40;
            totalPay = (hourlyPayRate * 40) + (hourlyPayRate * 1.5 * overTime);
        } else {
            totalPay = hourlyPayRate * hoursWorked;
        }
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = calculateWeeklyPay(hoursWorked);
        return "Weekly pay: " + totalPay;
    }
    @Override
    public String toJSONRecord() {
        String retString = "";
        final char DQ = '\u0022';
        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.getFirstName() + DQ + ",";
        retString += " " + DQ + "lastName" + DQ + ":" + DQ + this.getLastName() + DQ + ",";
        retString += " " + DQ + "YOB" + DQ + ":" + DQ + this.getYOB() + DQ + ",";
        retString += " " + DQ + "hourlyPayRate" + DQ + ":" + DQ + this.hourlyPayRate + "}";

        return retString;
    }

    @Override
    public String toXMLRecord() {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.getID() + "</ID>";
        retString += "<firstName>" + this.getFirstName() + "</firstName>";
        retString += "<lastName>" + this.getLastName() + "</lastName>";
        retString += "<YOB>" + this.getYOB() + "</YOB>";
        retString += "<hourlyPayRate>" + this.hourlyPayRate + "</hourlyPayRate>";

        return retString;
    }
    @Override
    public String toCSV() {
        return String.format("%s, %s, %s, %s, %d", getID(), getFirstName(), getLastName(), getTitle(), getYOB(), hourlyPayRate);
    }
}
