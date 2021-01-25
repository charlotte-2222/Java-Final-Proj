package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int loop = 0;
        int userChoice;
        String loopRes, searchParam, usrOpt;
        Scanner input = new Scanner(in);
        try {
            do {
                userChoice = menu();
                if(userChoice == 1){
                    Document doc = Jsoup.connect("http://theoldreader.com/kittens/600/400/js").get();
                    Elements links = doc.select("a[href]");
                    for (Element link : links) {
                        // get the value from the href attribute
                        out.println("\nlink: " + link.attr("href"));
                    }
                } else {
                    if(userChoice==2){
                        out.print("what are we looking for: ");
                        searchParam=input.next();
                        Document doc = Jsoup.connect("https://www.google.com/search?q="+searchParam).get();
                        // get the page title
                        String title = doc.title();
                        out.println("title: " + title);

                        // get all links in page
                        Elements links = doc.select("a[href]");
                        for (Element link : links) {
                            // get the value from the href attribute
                            out.println("\nlink: " + link.attr("href"));
                            out.println("text: " + link.text());
                        }

                    }else{
                        if(userChoice==3){
                            Document doc = Jsoup.connect("https://weather.com/weather/tenday/l/Spartanburg+SC?canonicalCityId=8b77caf9f6ae0ffbed40f5745635a09fafbf137ec2e9fcd56ff70f0d077f259d").get();
                            // get the page title
                            String title = doc.title();
                            out.println("title: " + title);

                            // get all links in page
                            Elements links = doc.select("a[href]");
                            for (Element link : links) {
                                // get the value from the href attribute
                                out.println("\nlink: " + link.attr("href"));
                                out.println("text: " + link.text());
                            }


                        } else{
                            if (userChoice==4){
                                Document doc =Jsoup.connect("https://www.nasdaq.com/market-activity/stocks").get();
                                String title = doc.title();
                                out.println("title: " + title);

                                // get all links in page
                                Elements links = doc.select("a[href]");
                                for (Element link : links) {
                                    // get the value from the href attribute
                                    out.println("\nlink: " + link.attr("href"));
                                    out.println("text: " + link.text());
                                }
                            }
                        }
                    }
                }
                out.print("Wanna see me do it again? (Y/N): ");
                loopRes = input.next();
                if(loopRes.equalsIgnoreCase("n")) {
                    if (JOptionPane.showConfirmDialog(null,
                            "Are you sure?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    } else {
                        continue;
                    }

                }
                else{
                    out.print("Continuing...\n");
                    continue;
                }

            }while (loop == 0);

        } catch (Exception e) {

            Main.infoBox("Ah crap!\n" + "I messed up...", "");

        }

    }

    // ahhhhhhh don't put stuff here

    private static void infoBox (String s, String s1){

        JOptionPane.showMessageDialog(null, s, "Oops..." +
                s1, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        out.println("What are we scraping today?");
        out.println("-------------------------\n");
        out.println("1 - Cat Picture");
        out.println("2 - Scrape the web");
        out.println("3 - Weather Scrape");
        out.println("4 - NASDAQ Scrape (Market Activity, Stocks)");
        out.print("Enter choice: ");
        selection = input.nextInt();
        return selection;
    }


}