package Classes.Simplest_classes.TaskEight;

import java.util.UUID;

public class Customer {
    private String id;
    private String surname;
    private String name;
    private String patronName;
    private String address;
    private int cardNumber;
    private int bankAccNumber;

    public Customer(String surname, String name, String patronName, String address, int cardNumber, int bankAccNumber) {
        id = UUID.randomUUID().toString();
        this.surname = surname;
        this.name = name;
        this.patronName = patronName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccNumber = bankAccNumber;
        CustomerHolder.add(this);
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronName() {
        return patronName;
    }

    public String getAddress() {
        return address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getBankAccNumber() {
        return bankAccNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccNumber(int bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName() + " " + getPatronName() +
                " Проживающий по адресу " + getAddress() + " имеет карту номер " + getCardNumber() +
                " привязанную к счёту " + getBankAccNumber();

    }
}
