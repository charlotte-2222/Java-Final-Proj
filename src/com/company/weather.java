package com.company;
import static java.lang.System.out;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class weather {
    public static void weathCheck() throws IOException {
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

    }

}
