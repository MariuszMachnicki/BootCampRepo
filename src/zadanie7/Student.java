package zadanie7;


public class Student extends Person {
    private String fieldOfStudy;
    private int year;
    private int semestr;



        public Student(String name, String surname, int age, int semestr, int year, String fieldOfStudy) {
            super(name, surname, age);
            this.fieldOfStudy = fieldOfStudy;
            this.semestr = semestr;
            this.year = year;
        }

       public void selfIntroduction() {
            System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");
            System.out.println( "Jestem na kierunku " + this.fieldOfStudy + ", " + this.semestr + " semetrze " + this.year + "roku");

        }

}
