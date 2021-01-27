package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class google {
    public static void googleSearch() throws IOException {
        String searchParam;
        Scanner input = new Scanner(in);
        out.print("what are we looking for: ");
        searchParam = input.next();
        Document doc = Jsoup.connect("https://www.google.com/search?q=" + searchParam).get();
        // get the page title
        String title = doc.title();
        out.println("title: " + title);

        // get all links in page
        Elements links = doc.select("a[href]");
        for (
                Element link : links) {
            // get the value from the href attribute
            out.println("\nlink: " + link.absUrl("href"));
            out.println("text: " + link.text());
        }
    }
}
