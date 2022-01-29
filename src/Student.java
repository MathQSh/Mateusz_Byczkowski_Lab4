public class Student implements StudentI {
    private String class_group;
    private int term;
    private int index;
    private String name;
    private String surname;
    private Integer age;

    public Student() {
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public String getClass_group() {
        return class_group;
    }

    public int getTerm() {
        return term;
    }

    public int getIndex() {
        return index;
    }




    @Override
    public String toString() {
        return "Student " +
                "Imie: " + name + " Nazwisko: " + surname +
                " wiek: " + age +
                " grupa studencka " + class_group +
                " semestr = " + term +
                " numer albumu = " + index;

    }

    @Override
    public void setClass_group(String value) {
        this.class_group=value;
    }

    @Override
    public void setTerm(int value) {
        this.term=value;
    }

    @Override
    public void setIndex(int value) {
        this.index=value;
    }

    @Override
    public void setName_surname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void setAge(int value) {
        this.age=value;
    }
}