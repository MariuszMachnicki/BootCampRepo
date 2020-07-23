package zadanie7;

public class Main {
    public static void main (String[] args ) {

        System.out.println("Teacher");
        Teacher teacherl = new Teacher("Wojtek", "Nowak", "Kapitan", 50, 5000);
        teacherl.selfIntroduction();
        teacherl.calculateBonus();


        System.out.println("Student ");
        Student studentl = new Student("Maciek", "Kowalski", 20, 3, 2, "Statki i inne jednostki pływające");
        studentl.selfIntroduction();

    }

}
