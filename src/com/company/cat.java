package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import static java.lang.System.out;

public class cat {

    public static void catSearch() throws IOException {
        Document doc = Jsoup.connect("http://theoldreader.com/kittens/600/400/js").get();
        Elements links = doc.select("a[href]");
        for (
                Element link : links) {
            // get the value from the href attribute
            out.println("\nlink: " + link.absUrl("href"));
        }
    }
}
