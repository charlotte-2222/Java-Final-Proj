package com.company;
import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.out;


public class info {
    public static void infoBox(String s, String s1){

        JOptionPane.showMessageDialog(null, s, "Oops..." +
                s1, JOptionPane.INFORMATION_MESSAGE);
    }


    public static int menu() {
        int selection, userChoice;
        Scanner input = new Scanner(System.in);
        //menu stuff
        out.println("In most cases, you will need to scroll 'up' the console to get information\n" +
                "from the webpage. This program scrapes *THE WHOLE* page, except in the second option.\n");
        out.println("What are we scraping today?");
        out.println("-------------------------\n");
        out.println("1 - Cat Picture");
        out.println("2 - Scrape the web");
        out.println("3 - Weather Scrape");
        out.println("4 - NASDAQ Scrape (Market Activity, Stocks)");
        out.println("5 - Scrape SCC's Computer Tech. Page");
        out.println("6 - Scrape Indeed for Software Dev Jobs");
        out.println("7 - Scrape FBI's Most Wanted Cyber Criminals");
        out.println("8 - Scrape World COVID Statistics");
        out.println("9 - Scrape r/WallStreetBets");
        out.print("Enter choice: ");
        selection = input.nextInt();
        return selection;
    }

}
