package Day9.Employee_SJ;

public class TempEmployee_SJ extends Employee_SJ {
    private int hireYear;

    public TempEmployee_SJ(String empno, String name, int pay, int hireYear) {
        super(empno, name, pay);
        this.hireYear = hireYear;
    }

    @Override
    public double getMonthPay() {
        return pay/(double)12;
    }

    @Override
    public String toString() {
        return "TempEmployee [hireYear = " + hireYear + "]";
    }
}
