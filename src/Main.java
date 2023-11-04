public class Main {
    public static void main(String[] args) {
        Worker mitko = new Worker();
        Worker acho = new Worker("Angel","chef",3100.4,12.7);
        Worker sasho = new Worker("Sasho", "mechanic", 1600.9, 4.5);

        mitko.paySalary();
        mitko.payBonus(100.5);
        mitko.paidLeave(5);
        mitko.unpaidLeave(2);
        mitko.sick(4,"flu");
        System.out.println("-----------");
        acho.paySalary();
        acho.payBonus(355.1);
        acho.paidLeave(2);
        acho.unpaidLeave(3);
        acho.sick(3,"diarrhea");
        System.out.println("-----------");
        sasho.paySalary();
        sasho.payBonus(521.2);
        sasho.paidLeave(3);
        sasho.unpaidLeave(1);
        sasho.sick(1,"headache");
    }
}