package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import java.util.Scanner;
import static com.company.info.menu;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int shit =0;
        int userChoice = menu();
        Scanner input = new Scanner(in);
        try {
            do {

                if (userChoice == 1) {
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
                }

                out.println("Run again?");
                out.print("Y/N: ");
                String loopRes = input.next();
                if(loopRes.equalsIgnoreCase("n")){
                    if(JOptionPane.showConfirmDialog(null,
                            "Sure?",
                            "Warning",
                            JOptionPane.YES_NO_OPTION) ==
                            JOptionPane.YES_OPTION)
                    {
                        exit(0);
                    } else if(JOptionPane.YES_NO_OPTION==
                            JOptionPane.NO_OPTION)
                    {
                        continue;
                    }
                }

            }while(shit==0);

        } catch (Exception e) {

            info.infoBox("Ah crap!\n" + "I messed up...", "");

        }
    }

    // ahhhhhhh don't put stuff here

}


