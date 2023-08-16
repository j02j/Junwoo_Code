package Day9.Employee;

public class Employee_Test {
    public static void printPay(Employee emp) {
        System.out.println("-------------------");
        System.out.println(emp);
        System.out.println("-------------------");
        System.out.println(emp.getMonthPay());
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] =new RegularEmployee("E001", "홍길동", 3000, 500);
        emps[1] =new TempEmployee("E002", "임꺽정", 4000,1);

        for(int i = 0; i < emps.length; i++) {
            printPay(emps[i]);
        }

    }
}
