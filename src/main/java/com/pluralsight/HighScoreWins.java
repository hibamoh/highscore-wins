package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("please enter the game score ex. home:visitor | 0:0");
        String [] teamsAndScores = myScanner.nextLine().split("\\|");


        System.out.println(teamsAndScores.length);

    }
}
