package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("please enter the game score ex. home:visitor | 0:0 ");
        String userInput = myScanner.nextLine();

        String [] teamsAndScores = userInput.split("\\|");


        String teams [] = teamsAndScores[0].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams [1];

        String scores[] = teamsAndScores[1].split(":");

        int homeTeamScore = Integer.parseInt(scores[0]);
        int visitorTeamScore = Integer.parseInt(scores[1]);

        if (homeTeamScore > visitorTeamScore) {
            System.out.println("winner is: " + homeTeam);
        } else if (homeTeamScore < visitorTeamScore) {
            System.out.println("winner is: " + visitorTeam);
        } else {
            System.out.println("winner is: tie!");
        }




    }
}
