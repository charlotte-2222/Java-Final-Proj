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
        String loopRes, searchParam;
        Scanner input = new Scanner(in);
        try {
            do {
                if (userChoice == 1) {
                    Document doc = Jsoup.connect("http://theoldreader.com/kittens/600/400/js").get();
                    Elements links = doc.select("a[href]");
                    for (Element link : links) {
                        // get the value from the href attribute
                        out.println("\nlink: " + link.absUrl("href"));
                    }
                } else {
                    if (userChoice == 2) {
                        out.print("what are we looking for: ");
                        searchParam = input.next();
                        Document doc = Jsoup.connect("https://www.google.com/search?q=" + searchParam).get();
                        // get the page title
                        String title = doc.title();
                        out.println("title: " + title);

                        // get all links in page
                        Elements links = doc.select("a[href]");
                        for (Element link : links) {
                            // get the value from the href attribute
                            out.println("\nlink: " + link.absUrl("href"));
                            out.println("text: " + link.text());
                        }

                    } else {
                        if (userChoice == 3) {
                            Document doc = Jsoup.connect("https://weather.com/weather/tenday/l/Spartanburg+SC?canonicalCityId=8b77caf9f6ae0ffbed40f5745635a09fafbf137ec2e9fcd56ff70f0d077f259d").get();
                            // get the page title
                            String title = doc.title();
                            out.println("title: " + title);

                            // get all links in page
                            Elements links = doc.select("a[href]");
                            for (Element link : links) {
                                // get the value from the href attribute
                                out.println("\nlink: " + link.absUrl("href"));
                                out.println("text: " + link.text());
                            }


                        } else {
                            if (userChoice == 4) {
                                Document doc = Jsoup.connect("https://www.nasdaq.com/market-activity/stocks").get();
                                String title = doc.title();
                                out.println("title: " + title);

                                // get all links in page
                                Elements links = doc.select("a[href]");
                                for (Element link : links) {
                                    // get the value from the href attribute
                                    out.println("\nlink: " + link.absUrl("href"));
                                    out.println("text: " + link.text());
                                }
                            } else {
                                if (userChoice == 5) {
                                    Document doc = Jsoup.connect("https://www.sccsc.edu/schoolslist/CET-1/computers.php").get();
                                    String title = doc.title();
                                    out.println("title: " + title);

                                    Elements links = doc.select("a[href]");
                                    for (Element link : links) {
                                        out.println("\nlink: " + link.absUrl("href"));
                                        out.println("text: " + link.text());
                                    }
                                } else {
                                    if (userChoice == 6) {
                                        Document doc = Jsoup.connect("https://www.indeed.com/jobs?q=software+developer&l=Spartanburg%2C+SC").get();
                                        String title = doc.title();
                                        out.println("title: " + title);

                                        Elements links = doc.select("a[href]");
                                        for (Element link : links) {
                                            out.println("\nlink: " + link.absUrl("href"));
                                            out.println("text: " + link.text());
                                        }
                                    } else {
                                        if (userChoice == 7) {
                                            Document doc = Jsoup.connect("https://www.fbi.gov/wanted/cyber").get();
                                            String title = doc.title();
                                            out.println("title: " + title);
                                            Elements links = doc.select("a[href]");
                                            for (Element link : links) {
                                                out.println("\nlink: " + link.absUrl("href"));
                                                out.println("text: " + link.text());
                                            }

                                        } else {
                                            if (userChoice == 8) {
                                                Document doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
                                                String title = doc.title();
                                                out.println("title: " + title);
                                                Elements links = doc.select("a[href]");
                                                for (Element link : links) {
                                                    out.println("\nlink: " + link.absUrl("href"));
                                                    out.println("text: " + link.text());
                                                }
                                            }
                                        }
                                    }

                                }

                            }
                        }
                    }
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


