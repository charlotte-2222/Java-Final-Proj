package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import static java.lang.System.out;

public class movies {
    public static void top100AT() throws IOException {
        Document doc = Jsoup.connect("https://www.rottentomatoes.com/top/bestofrt/").get();
        String title = doc.title();
        out.print("title: " + title);
        // get all links in page
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            // get the value from the href attribute
            out.println("\nlink: " + link.absUrl("href"));
            out.println("text: " + link.wholeText());
        }
    }

}
