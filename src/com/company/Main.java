package com.company;

public class Main {

    public static void main(String[] args) {
        String palindrom = "потоп";     //идея: создадим строку такую же только задом наперед
        String novaya = "";
        for (int i = 0; i <palindrom.length() ; i++) {
            novaya+=palindrom.charAt(palindrom.length()-1-i);
        }
        System.out.println(novaya);
        System.out.println(palindrom.equals(novaya));
        System.out.println("не тупо___________");
        novaya = "";                //присваиваем к строке Новая пустую строку
                                    //цыкл от индекса последнего символа до 0 включительно
                                    //с шагом еденица

        for (int i = palindrom.length()-1; i >=0; i--) {     //"i-- декримент
                            //лепим к строке новая каждный символ сторки полиндром начиная с конца
            novaya+=palindrom.charAt(i);
        }
        System.out.println(novaya);
    }
}
