public class Worker implements Payable,Abscensable{
    protected String name;
    protected String position;
    protected double salary;
    protected double internship;

    Worker(){
        setName("Dimitar");
        setPosition("cleaner");
        setSalary(1300.45);
        setInternship(2.5);
    }

    Worker(String name, String position, double salary, double internship){
        setName(name);
        setPosition(position);
        setSalary(salary);
        setInternship(internship);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println(getName() + " requested " + length + " days of paid leave.");
    }

    @Override
    public void unpaidLeave(int length) {
        System.out.println(getName() + " requested " + length + " days of unpaid leave.");
    }

    @Override
    public void sick(int length, String disease) {
        System.out.println(getName() + " will be absent for " + length + " days, because he/she are sick from " + disease + ".");    }

    @Override
    public void paySalary() {
        System.out.println(getName() + " get his monthly salary paid and received " + getSalary() + "$.");
    }

    @Override
    public void payBonus(double amount) {
        System.out.println(getName() + " received " + amount + "$ as a monthly bonus.");
    }
}
