package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
    }

    public static void main(String[] args) {
        Jukebox vladimir = new Jukebox();
        int position = 3;
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            case 3:
                System.out.println("Песня не найдена");
                break;
            default:
                System.out.println("Ни одно из условий не подошло");
        }
    }
}