package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import static java.lang.System.out;
public class covid {
    public static void covidFacts() throws IOException {
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
