import java.text.DecimalFormat;
import java.util.ArrayList;

public class EmployeeService {
    //Логические методы
    public static double expensesStaff (Employee [] employee) {
        double expenses = 0;
        for (int i = 0; i < employee.length; i++) {
            expenses = expenses + employee[i].getSalary();}
        return expenses;}
    public static Employee maxStuffSalary(Employee [] employee) {
        int j = 0;
        double maxSalary = employee[j].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()){
                maxSalary = employee[i].getSalary();
                j = i;}}
        return employee[j];}
    public static Employee minStuffSalary(Employee [] employee) {
        int j = 0;
        double minSalary = employee[j].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()){
                minSalary = employee[i].getSalary();
                j = i;}}
        return employee[j];}
    public static double middleStuffSalary(Employee [] employees) {
        int size = employees.length;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                size = size - 1;}}
        double middleSalary = expensesStaff(employees) / size;
        return middleSalary;}
    public static void indexing (Employee [] employees, double percentIndexing){
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i].getSalary();
            double indexing = 1 + percentIndexing/100;
            employees[i].setSalary(salary * indexing);}
    }
    public static Employee [] higherThan (Employee [] employees, double salary) {
        ArrayList<Employee> higherThemList = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                higherThemList.add(employees[i]);}
        }
        Employee[] higherThan = new Employee[higherThemList.size()];
        higherThemList.toArray(higherThan);
        return higherThan;}

    public static Employee [] lowerThan (Employee [] employees, double salary){
        ArrayList<Employee> lowerThanList = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                lowerThanList.add(employees[i]);}
        }
        Employee[] lowerThan = new Employee[lowerThanList.size()];
        lowerThanList.toArray(lowerThan);
        return lowerThan;}




    //Методы Print
    public static void printStaff(Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value);}
        System.out.println();}
    public static void printExpensesStaff (Employee [] employee) {
        System.out.println("Расходы компании на заработную плату сотрудникам " + expensesStaff(employee) + " рублей.\n");}
    public static void printNamesStaff(Employee [] employees) {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].fullName());}
        System.out.println();}
    public static void printMaxStuffSalary (Employee [] employees) {
        System.out.println("Сотрудник с наибольшим доходом - " + maxStuffSalary(employees).fullName() + "\n");}
    public static void printMinStuffSalary (Employee [] employees) {
        System.out.println("Сотрудник с наименьшим доходом - " + minStuffSalary(employees).fullName() + "\n");}
    public static void printMiddleStuffSalary (Employee [] employees) {
        System.out.println("Средняя зарплата сотрудников - " + decimalFormat().format(middleStuffSalary(employees)) + " рублей \n");}
    public static void printHigherThan (Employee [] employees, double salary){
        System.out.println("Сотрудники с заработной платой выше - " + decimalFormat().format(salary) + " рублей");
        printStaff(higherThan(employees, salary));
        System.out.println();}
    public static void printLowerThan (Employee [] employees, double salary){

        System.out.println("Сотрудники с заработной платой ниже - " + decimalFormat().format(salary) + " рублей");
        printStaff(lowerThan(employees, salary));
        System.out.println();}
    private static DecimalFormat decimalFormat (){
        DecimalFormat df = new DecimalFormat("#.##");
        return df;}
}
