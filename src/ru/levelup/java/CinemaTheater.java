package ru.levelup.java;

import ru.levelup.java.cinema.theater.entities.Hall;
import ru.levelup.java.cinema.theater.entities.Movie;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class CinemaTheater {

    private ConsoleHelper consoleHelper;
    private List<Movie> movies ;
    private Hall halls;

    Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        CinemaTheater cinemaTheater = new CinemaTheater();
        cinemaTheater.consoleHelper = new ConsoleHelper();

        cinemaTheater.initMenu();
           }

    private void initMenu() {
        int numberMovie = 0;


        consoleHelper.printlnToConsole("Выберите пункт меню: ");
        consoleHelper.printlnToConsole("1 - Показать информацию о сеансах");
        consoleHelper.printlnToConsole("2 - Покупка билета");
        consoleHelper.printlnToConsole("3 - Заказ еды");
        consoleHelper.printToConsole("Выберите: ");
        int menu = consoleHelper.getIntValueFromConsole();

        switch (menu) {
            case 1://Показать информацию о сеансах
                String AmountOfPlace = in.next();
                halls.getAmountOfPlace();
                System.out.println();
                break;
            case 2: //Покупка билетаs
               // consoleHelper.printlnToConsole(" осталось"+ +"билет (ов)");

                break;

            case 3: //Заказ еды
                break;

        }
    }

    private void sessionInformation() {
        for (Movie movie: movies) {
            consoleHelper.printlnToConsole(movie.toString());
        }
    }
}