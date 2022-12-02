public class Employee {
    private String firstName;
    private String secondName;
    private String surname;
    private int department;
    private double total;
    private static int content = 1;
    private final int id = content;

    public Employee(String surname, String firstName, String secondName, int department, double total) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        if (department > 5 || department < 1) { throw new IllegalArgumentException("Указан не верный номер отдела");}
        this.department = department;
        this.total = total;
        content++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String toString() {
        return "id: " + id + "; ФИО: " + surname + " " + firstName + " " + secondName + "; отдел: " + department + "; зарплата: " + total + " рублей.";
    }



}


