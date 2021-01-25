package com.sky;

public class Rainbow2 {
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int BLUE = 5;
    private static final int INDIGO = 6;
    private static final int VIOLET = 7;


    public void printCollor(int number){
        switch (number){
            case RED:
                System.out.println("Красный");
                break;
            case ORANGE:
                System.out.println("Оранжевый");
                break;
            case YELLOW:
                System.out.println("Жёлтый");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Голубой");
                break;
            case INDIGO:
                System.out.println("Синий");
                break;
            case  VIOLET:
                System.out.println("Филоетовый");
                break;
            case 13:
                System.out.println("Красно - зеленый");
                break;
            case 15:
                System.out.println("Оранжево - Синий");
                break;




        }
    }
}
