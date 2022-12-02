import java.text.DecimalFormat;

public class Employee {
    private String firstName;
    private String secondName;
    private String surname;
    private int department;
    private double salary;
    private static int content = 1;
    private final int id = content;

    //Конструктор
    public Employee(String surname, String firstName, String secondName, int department, double salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        checkDepartment(department);
        this.department = department;
        this.salary = salary;
        content++;}


    //Методы Get
    public String getFirstName() {
        return this.firstName;}
    public String getSecondName() {
        return this.secondName;}
    public String getSurname() {
        return this.surname;}
    public int getDepartment() {
        return this.department;}
    public double getSalary() {
        return this.salary;}
    public double getId() {
        return this.id;}


    //Методы Set
    public void setFirstName(String firstName) {
        this.firstName = firstName;}
    public void setSecondName(String secondName) {
        this.secondName = secondName;}
    public void setSurname(String surname) {
        this.surname = surname;}
    public void setDepartment(int department) {
        this.department = department;}
    public void setSalary(double salary) {
        this.salary = salary;}


    //Методы String
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#");
        return "id: " + id + "; ФИО: " + surname + " " + firstName + " " + secondName + "; отдел: " + department + "; зарплата: " + df.format(salary) + " рублей.";}
    public String fullName () {
        return this.surname + " " + this.firstName + " " + this.secondName;}

    // Методы Check
    private void checkDepartment (int department){
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Указан не верный номер отдела");}

    }

}


