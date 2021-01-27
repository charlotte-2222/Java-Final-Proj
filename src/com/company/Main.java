package com.company;
import javax.swing.*;
import java.util.Scanner;
import static com.company.info.menu;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
      /*
         Webscraper - this is my Project for Java class
         Have not determined if this will be bigger in scale
         than the submitted assignment; I will keep this proj. running.
        */
        Scanner input = new Scanner(in);
        try {
            do {
                int userChoice = menu();
                switch (userChoice) {
                    case 1 -> cat.catSearch();
                    case 2 -> google.googleSearch();
                    case 3 -> weather.weathCheck();
                    case 4 -> nasdaq.nasDaq();
                    case 5 -> scc.sccClass();
                    case 6 -> indeed.jobSearch();
                    case 7 -> fbi.fedScrap();
                    case 8 -> covid.covidFacts();
                    case 9 -> movies.top100AT();
                    //case 10 -> apTwit.apTweet();
                    }
                out.println("Run again?");
                out.print("Y/N: ");
                String loopRes = input.next();
                if(loopRes.equalsIgnoreCase("n")){
                    if(JOptionPane.showConfirmDialog(null,
                            "Sure?",
                            "Warning",
                            JOptionPane.YES_NO_OPTION) ==
                            JOptionPane.YES_OPTION) {
                        exit(0); }}
            }while(true);}catch (Exception e)
        {info.infoBox("Ah crap!\n" + "I messed up...", "");}
    }/* oof don't put stuff here */
}