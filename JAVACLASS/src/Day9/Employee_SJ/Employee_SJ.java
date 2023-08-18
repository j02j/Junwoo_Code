package Day9.Employee_SJ;

public abstract class Employee_SJ {

    protected String empno;

    protected String name;

    protected int pay;

    public abstract double getMonthPay();

    public Employee_SJ(String empno, String name, int pay) {
        super();
        this.empno = empno;
        this.name = name;
        this.pay = pay;
    }

    public String getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public int getPay(){
        return pay;
    }

    @Override
    public String toString() {
        return "Employee [empno = " + empno + ", name = " + name + ", pay = " + pay + "]";
    }
}
