package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.text.MessageFormat;

import static java.lang.System.out;

public class apTwit {
    public static void apTweet() throws IOException {
        Document doc = Jsoup.connect("https://twitter.com/AP").get();
        // get the page title
        String title = doc.title();
        out.println("title: " + title);
        // get all links in page
        Elements links = doc.select("css");
        for (Element link : links) {
            // get the value from the href attribute
            out.println(MessageFormat.format("\nlink: {0}", link.absUrl("css")));
            out.println("text: " + link.text());
        }
    }


}
