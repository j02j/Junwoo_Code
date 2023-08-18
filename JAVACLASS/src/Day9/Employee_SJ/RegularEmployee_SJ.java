package Day9.Employee_SJ;

public class RegularEmployee_SJ extends Employee_SJ {

    private int bonus;

    public RegularEmployee_SJ(String empno, String name, int pay, int bonus) {
        super(empno, name, pay);
        this.bonus = bonus;
    }

    @Override
    public double getMonthPay() {
        return (pay/(double)12) + (bonus/(double)12);
    }

    @Override
    public String toString() {
        return "RegularEmployee [bonus = " + bonus + "]";
    }
}
