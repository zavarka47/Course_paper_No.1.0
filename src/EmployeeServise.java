import java.text.DecimalFormat;

public class EmployeeServise {
    //8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
    //    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    //    2. Посчитать сумму затрат на зарплаты в месяц.
    //    3. Найти сотрудника с минимальной зарплатой.
    //    4. Найти сотрудника с максимальной зарплатой.
    //    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    //    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public static void staff (Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static double expensesStaff (Employee [] employee) {
        double expenses = 0;
        for (int i = 0; i < employee.length; i++) {
            expenses = expenses + employee[i].getTotal();
        }
        return expenses;
    }

    public static void printExpensesStaff (Employee [] employee) {
        System.out.println("Расходы компании на заработную плату сотрудникам " + expensesStaff(employee) + " рублей.\n");
    }

    public static void maxTotalOfStaff (Employee [] employee) {
        double maxTotal = employee[0].getTotal();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (maxTotal < employee[i].getTotal()){
                maxTotal = employee[i].getTotal();
                j = i;
            }
        }
        System.out.println("Сотрудник с наибольшим доходом - " + employee[j].getSurname() + " " + employee[j].getFirstName() +" " + employee[j].getSecondName() + "\n");
    }

    public static void minTotalOfStaff (Employee [] employee) {
        double minTotal = employee[0].getTotal();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (minTotal > employee[i].getTotal()){
                minTotal = employee[i].getTotal();
                j = i;
            }
        }
        System.out.println("Сотрудник с наименьшим доходом - " + employee[j].getSurname() + " " + employee[j].getFirstName() +" " + employee[j].getSecondName() + "\n");
    }

    public static void middleTotalOfStaff (Employee [] employees) {
        DecimalFormat df = new DecimalFormat("#.#");
        double middleTotal = expensesStaff(employees) / (employees.length - 1);
        System.out.println("Средний доход сотрудников - " + df.format(middleTotal) + " рублей\n");
    }

    public static void NameStaff (Employee [] employees) {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSurname() + " " + employees[i].getFirstName() + " " + employees[i].getSecondName());
        }
    }


}
