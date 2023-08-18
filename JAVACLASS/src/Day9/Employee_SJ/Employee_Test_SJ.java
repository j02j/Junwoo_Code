package Day9.Employee_SJ;

public class Employee_Test_SJ {
    public static void printPay(Employee_SJ emp) {
        System.out.println("-----------------");
        System.out.println(emp);
        System.out.println("-----------------");
        System.out.println(emp.getMonthPay());
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Employee_SJ[] emps = new Employee_SJ[2];
        emps[0] = new RegularEmployee_SJ("E001", "홍길동", 3000, 500);
        emps[1] = new TempEmployee_SJ("E002", "임꺽정", 4000, 1);

        for (int i = 0; i < emps.length; i++) {
            printPay(emps[i]);
        }
    }
}
