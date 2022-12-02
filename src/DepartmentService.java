import java.text.DecimalFormat;
import java.util.ArrayList;

public class DepartmentService {
    //логические методы
    public static Employee[] departmentStuff (Employee [] employees, int departmentNo){
        checkDepartmentNo(departmentNo);
        ArrayList<Employee> departmentList = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            if (departmentNo == employees[i].getDepartment()){
                departmentList.add(employees[i]);}
        }
        Employee[] department = new Employee[departmentList.size()];
        departmentList.toArray(department);
        return department;}
    public static double expensesDepartment(Employee [] employees, int departmentNo) {
        checkDepartmentNo(departmentNo);
        Employee[] department = departmentStuff(employees, departmentNo);
        double departmentTotal = 0;
        for (int i = 0; i < department.length; i++) {
            departmentTotal = departmentTotal + department[i].getSalary();}
        return departmentTotal;}
    public static Employee minDepartmentSalary(Employee [] employees, int departmentNo) {
        checkDepartmentNo(departmentNo);
        Employee[] department = departmentStuff(employees, departmentNo);
        int j = 0;
        double minSalary = department[j].getSalary();
        for (int i = 0; i <department.length; i++) {
            if (minSalary > department[i].getSalary()){
                minSalary = department[i].getSalary();
                j = i;}}
        return department[j];}
    public static Employee maxDepartmentSalary(Employee [] employees, int departmentNo) {
        checkDepartmentNo(departmentNo);
        Employee[] department = departmentStuff(employees, departmentNo);
        int j = 0;
        double maxSalary = department[j].getSalary();
        for (int i = 0; i < department.length; i++) {
            if (maxSalary < department[i].getSalary()) {
                maxSalary = department[i].getSalary();
                j = i;}}
        return department[j];}
    public static double middleDepartmentSalary (Employee [] employees, int departmentNo) {
        int size = departmentStuff(employees, departmentNo).length;
        for (int i = 0; i < departmentStuff(employees, departmentNo).length; i++) {
            if (departmentStuff(employees, departmentNo)[i] == null) {
                size = size - 1;}}
        checkDepartmentNo(departmentNo);
        double middleDepartmentSalary = expensesDepartment(employees, departmentNo) / size;
        return middleDepartmentSalary;}

    public static void indexDepartment (Employee[]employees, int departmentNo, double indexPercent) {
        checkDepartmentNo(departmentNo);
        for (int i = 0; i < departmentStuff(employees, departmentNo).length; i++) {
            double salary = departmentStuff(employees, departmentNo)[i].getSalary();
            double index = 1 + (indexPercent / 100);
            departmentStuff(employees, departmentNo)[i].setSalary(salary * index);
        }
    }

    //Методы Print
    public static void printDepartmentStaff (Employee [] employees, int departmentNo) {
        System.out.println("Сотрудники " + departmentNo + " отдела:");
        for (int i = 0; i < departmentStuff(employees, departmentNo).length; i++) {
            System.out.println("id: " + departmentStuff(employees, departmentNo)[i].getId() + "; ФИО: " + departmentStuff(employees, departmentNo)[i].fullName() + "; зарплата: " + decimalFormat().format(departmentStuff(employees, departmentNo)[i].getSalary()) + " рублей.");}
        System.out.println();}
    public static void printExpensesDepartment (Employee [] employees, int departmentNo) {
        System.out.println("Расходы компании на зарплату отдела " + departmentNo + " - " + decimalFormat().format(expensesDepartment(employees, departmentNo)) + " рублей \n");}
    public static void printMinDepartmentSalary (Employee [] employees, int departmentNo) {
        System.out.println("В отделе " + departmentNo + " сотрудник с минимальным доходом - " + minDepartmentSalary(employees, departmentNo).fullName() + "\n");}
    public static void printMaxDepartmentSalary (Employee [] employees, int departmentNo) {
        System.out.println("В отделе " + departmentNo + " сотрудник с максимальным доходом - " + maxDepartmentSalary(employees, departmentNo).fullName() + "\n");}
    public static void printMiddleDepartmentSalary (Employee [] employees, int departmentNo) {
        System.out.println("Средняя зарплата отдела " + departmentNo + " - " + decimalFormat().format(middleDepartmentSalary(employees, departmentNo)) + " рублей \n");}
    private static DecimalFormat decimalFormat (){
        DecimalFormat df = new DecimalFormat("#.##");
        return df;}

    //Методы check
    private static void checkDepartmentNo (int departmentNo){
        if (departmentNo > 5 || departmentNo < 1) {
            throw new IllegalArgumentException("Указан не верный номер отдела");}
    }
}
