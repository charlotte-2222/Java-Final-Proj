package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String loopRes;
        Scanner input = new Scanner(in);
        try {
            do {
                Document doc = Jsoup.connect("http://theoldreader.com/kittens/600/400/js").get();
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
                out.print("Wanna see me do it again? (Y/N): ");
                loopRes = input.next();
                if(loopRes.equalsIgnoreCase("Y"));{
                    out.print("Continuing...");
                }



            }while (loopRes.equalsIgnoreCase("Y"));

        } catch (Exception e) {

            Main.infoBox("Ah crap!\n" + "I messed up...", "");

        }


    }


    // ahhhhhhh don't put stuff here

    private static void infoBox (String s, String s1){

        JOptionPane.showMessageDialog(null, s, "Oops..." +
                s1, JOptionPane.INFORMATION_MESSAGE);

    }
}