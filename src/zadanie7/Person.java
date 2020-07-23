package zadanie7;

abstract class Person {

    protected String name;
    protected String surname;
    protected final int age;

    protected Person() {
        this.name = "unknown";
        this.surname = "unknown";
        this.age = 0;
    }

    protected Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

   abstract void selfIntroduction() {
        System.out.println("Cześć, nazywam się " + this.name + " " + this.surname + " mam " + this.age + " lat.");
    }


}
