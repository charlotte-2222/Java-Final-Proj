package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static java.lang.System.out;
public class nasdaq {
    public static void nasDaq() throws IOException {
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
    }

}
