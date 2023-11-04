public class Worker implements Abscensable{
    protected String firstName;
    protected String position;
    protected double salary;
    protected double internship;

    Worker(){
        setFirstName("Dimitar");
        setPosition("cleaner");
        setSalary(1300.45);
        setInternship(2.5);
    }

    Worker(String name, String position, double salary, double internship){
        setFirstName(name);
        setPosition(position);
        setSalary(salary);
        setInternship(internship);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getInternship() {
        return internship;
    }

    public void setInternship(double internship) {
        this.internship = internship;
    }

    @Override
    public void paidLeave(int length) {
        System.out.println(getFirstName() + " requested " + length + " days of paid leave.");
    }

    @Override
    public void unpaidLeave(int length) {
        System.out.println(getFirstName() + " requested " + length + " days of unpaid leave.");
    }

    @Override
    public void sick(int length, String disease) {
        System.out.println(getFirstName() + " will be absent for " + length + " days, because he/she are sick from " + disease + ".");    }


    @Override
    public void paySalary() {
        System.out.println(getName() + " get his monthly salary paid and received " + getSalary() + "$.");
    }

}
