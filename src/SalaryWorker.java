public class SalaryWorker extends Worker{
    private double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" +
                " annualSalary=" + annualSalary +
                '}';
    }

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }
    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Weekly Pay (from yearly salary): " + weeklyPay;
    }

    @Override
    public String toJSONRecord() {
        String retString = "";
        final char DQ = '\u0022';
        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.getFirstName() + DQ + ",";
        retString += " " + DQ + "lastName" + DQ + ":" + DQ + this.getLastName() + DQ + ",";
        retString += " " + DQ + "YOB" + DQ + ":" + DQ + this.getYOB() + DQ + ",";
        retString += " " + DQ + "hourlyPayRate" + DQ + ":" + DQ + this.getHourlyPayRate() + DQ + ",";
        retString += " " + DQ + "annualSalary" + DQ + ":" + DQ + this.annualSalary + "}";

        return retString;
    }

    @Override
    public String toXMLRecord() {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.getID() + "</ID>";
        retString += "<firstName>" + this.getFirstName() + "</firstName>";
        retString += "<lastName>" + this.getLastName() + "</lastName>";
        retString += "<YOB>" + this.getYOB() + "</YOB>";
        retString += "<hourlyPayRate>" + this.getHourlyPayRate() + "</hourlyPayRate>";
        retString += "<annualSalary>" + this.annualSalary + "</annualSalary>";

        return retString;
    }
    @Override
    public String toCSV() {
        return String.format("%s, %s, %s, %s, %d", getID(), getFirstName(), getLastName(), getTitle(), getYOB(), getHourlyPayRate(), annualSalary);
    }

}
