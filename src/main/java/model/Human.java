package model;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private String sex;
    private String birthDate;
    private String numberPhone;
    private String[] arr;

    public String getSurname() {
        return this.surname;
    }

    public Human(String[] arr) {
        this.surname = arr[0];
        this.name = arr[1];
        this.patronymic = arr[2];
        this.birthDate = arr[3];
        this.numberPhone = arr[4];
        this.sex = arr[5];
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", surname, name, patronymic, birthDate, numberPhone, sex);
    }
}