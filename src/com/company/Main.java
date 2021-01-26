package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.*;
import java.util.Scanner;
import static com.company.info.menu;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int loop = 0;
        int selection = menu();
        int userChoice = menu();
        String loopRes;
        Scanner input = new Scanner(in);
        try {
            do {

                if(userChoice==1){
                    cat.catSearch();
                }
                else if(userChoice==2)
                {
                    google.googleSearch();
                }
                else if(userChoice==3)
                {

                }








                out.print("Wanna see me do it again? (Y/N): ");
                loopRes = input.next();
                if (loopRes.equalsIgnoreCase("n")) {
                    if (JOptionPane.showConfirmDialog(null,
                            "Are you sure?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        exit(0);
                    } else {
                        continue;
                    }

                } else {
                    out.print("Continuing...\n");
                    continue;
                }

            } while (loop == 0);

        } catch (Exception e) {

            info.infoBox("Ah crap!\n" + "I messed up...", "");

        }

    }


    // ahhhhhhh don't put stuff here

}


