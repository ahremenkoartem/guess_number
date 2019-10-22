package com.jcourse.guess.view;

import com.jcourse.guess.controller.GuessController;

import java.util.Scanner;


public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    GuessController guessController = new GuessController();

    public ConsoleView() {
        while (true){
            System.out.println(guessController.gameDo(scanner.nextLine()));
        }

    }

}
