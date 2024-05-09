class Employee {
    int gross_salary, basic_salary, HRA, allowances, PF, PT, IT, net_salary;
    String name;
    Employee(String name, int basic_salary,int HRA, int allowances, int PF, int PT, int IT){
        this.name = name;
        this.basic_salary = basic_salary;
        this.HRA = HRA;
        this.allowances = allowances;
        this.PF = PF;
        this.PT = PT;
        this.IT = IT;
    }
    void calc_grossSalary(){
        gross_salary = basic_salary + HRA + allowances;
        System.out.println("Gross salary: " +  gross_salary);
        //return gross_salary;
    }
    void calc_netSalary(){
        int deduction = gross_salary - PF - PT - IT;
        net_salary = gross_salary - deduction;
        System.out.println("Net salary: " + net_salary);
        //return net_salary; 
    }
    void displayDetails(){
        System.out.println("\nEmployee Name: " + name);
        calc_grossSalary();
        calc_netSalary();
    }
}
class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amar",35000, 4000, 3000, 1000, 2500, 1500);
        e1.displayDetails();
        Employee e2 = new Employee("Akbar", 44000, 4000, 2000, 1000, 2500, 2500);
        e2.displayDetails();
        Employee e3 = new Employee("Anthony", 30000, 4000, 4000, 1000, 2500, 1000);
        e3.displayDetails();
    }
}
