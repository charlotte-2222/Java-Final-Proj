package com.company;
import javax.swing.*;
import java.util.Scanner;
import static com.company.info.menu;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(in);
        try {
            do {
                int userChoice = menu();
                switch (userChoice){
                    case 1:
                        cat.catSearch();
                        break;
                    case 2:
                        google.googleSearch();
                        break;
                    case 3:
                        weather.weathCheck();
                        break;
                    case 4:
                        nasdaq.nasDaq();
                        break;
                    case 5:
                        scc.sccClass();
                        break;
                    case 6:
                        indeed.jobSearch();
                        break;
                    case 7:
                        fbi.fedScrap();
                        break;
                    case 8:
                        covid.covidFacts();
                        break;
                    case 9:
                        movies.top100AT();
                        break;
                }
               /* if (userChoice == 1) {
                    cat.catSearch();
                } else if (userChoice == 2) {
                    google.googleSearch();
                } else if (userChoice == 3) {
                    weather.weathCheck();
                } else if (userChoice == 4) {
                    nasdaq.nasDaq();
                } else if (userChoice == 5) {
                    scc.sccClass();
                } else if (userChoice == 6) {
                    indeed.jobSearch();
                } else if (userChoice == 7) {
                    fbi.fedScrap();
                } else if (userChoice == 8) {
                    covid.covidFacts();
                } else if (userChoice == 9) {
                    movies.top100AT();
                */
                out.println("Run again?");
                out.print("Y/N: ");
                String loopRes = input.next();
                if(loopRes.equalsIgnoreCase("n")){
                    if(JOptionPane.showConfirmDialog(null,
                            "Sure?",
                            "Warning",
                            JOptionPane.YES_NO_OPTION) ==
                            JOptionPane.YES_OPTION) {
                        exit(0);
                    }
                }
            }while(true);

        } catch (Exception e) {

            info.infoBox("Ah crap!\n" + "I messed up...", "");

        }
    }

    // ahhhhhhh don't put stuff here

}


