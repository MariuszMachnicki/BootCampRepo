package zadanie7;

public class Teacher extends Person{
   private String degree;
   private double salary;
   private double annualSalary;
   private double annualBonus;


    public Teacher(String name, String surname, String degree, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;

    }
    public void calculateBonus() {
        this.annualSalary = this.salary * 12;
        this.annualBonus = annualSalary * 0.1;
        System.out.println("Mam tytuł " + this.degree + " zarabiam " + this.salary + " , co daje rocznie " + this.annualSalary + ". A roczna premia to " + this.annualBonus);
    }


    public void selfIntroduction() {
        System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");

    }
}
