public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Данилова", "Ксения", "Ивановна", 1, 45957);
        employee[1] = new Employee("Иванов", "Максим", "Сергеевич", 1, 46776);
        employee[2] = new Employee("Маслова", "Ксения", "Данииловна", 2, 37407);
        employee[3] = new Employee("Котова", "Полина", "Александровна", 2, 73207);
        employee[4] = new Employee("Худякова", "Александра", "Глебовна", 3, 72273);
        employee[5] = new Employee("Осипова", "Ксения", "Платоновна", 3, 55851);
        employee[6] = new Employee("Фомин", "Степан", "Артёмович", 4, 43456);
        employee[7] = new Employee("Лебедев", "Владимир", "Дмитриевич", 4, 78843);
        employee[8] = new Employee("Мартынов", "Дмитрий", "Максимович", 5, 69866);
        employee[9] = new Employee("Афанасьева", "Мария", "Данииловна", 5, 62481);

        EmployeeService.printStaff(employee);
        EmployeeService.printExpensesStaff(employee);
        EmployeeService.printNamesStaff(employee);
        EmployeeService.printMinStuffSalary(employee);
        EmployeeService.printMaxStuffSalary(employee);
        EmployeeService.printMiddleStuffSalary(employee);
        EmployeeService.printLowerThan(employee, EmployeeService.middleStuffSalary(employee));
        EmployeeService.printHigherThan(employee, EmployeeService.middleStuffSalary(employee));
        EmployeeService.indexing(employee, 20);
        EmployeeService.printHigherThan(employee, EmployeeService.middleStuffSalary(employee));

        DepartmentService.printDepartmentStaff(employee, 1);
        DepartmentService.printExpensesDepartment(employee, 1);
        DepartmentService.printMinDepartmentSalary(employee, 1);
        DepartmentService.printMaxDepartmentSalary(employee, 1);
        DepartmentService.printMiddleDepartmentSalary(employee, 1);
        DepartmentService.indexDepartment(employee, 1, 20);
        DepartmentService.printDepartmentStaff(employee, 1);

            }





}