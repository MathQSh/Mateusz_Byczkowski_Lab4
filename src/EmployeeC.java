public class EmployeeC implements IEmployee {
    private Type_internship type_internship;
    private Type_position type_position;
    private int length_internship;
    private String name;
    private String surname;
    private Integer age;

    public EmployeeC() {
    }

    public void setType_internship(Type_internship type_internship) {
        this.type_internship = type_internship;
    }

    public String toString() {
        return "Pracownik " +
                " Imie: " + name + " Nazwisko: " + surname +
                " wiek: " + age +
                " rodzaj stażu = " + type_internship +
                " stanowisko = " + type_position +
                " przepracowany czas " + length_internship + " lat"
                ;
    }

    public Type_internship getType_internship() {
        return type_internship;
    }
    public Type_position getType_position() {
        return type_position;
    }
    public int getLength_internship() {
        return length_internship;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public void setPosition(Type_position type_position) {
        this.type_position = type_position;
    }

    @Override
    public void setLength_internship(int value) {
        this.length_internship = value;
    }

    @Override
    public void setName_surname(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    @Override
    public void setAge(int value) {
        this.age=value;

    }
}