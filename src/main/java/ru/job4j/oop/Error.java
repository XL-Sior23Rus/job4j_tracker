package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Работает: " + active);
        System.out.println("Ошибка :" + status);
        System.out.println("Сообщение об ошибке : " + message);
    }

    public static void main(String[] args) {
        Error first = new Error(true, 404, "Ошибка стиля");
        first.printInfo();
        Error second = new Error();
        second.printInfo();
    }
}