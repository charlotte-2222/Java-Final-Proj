package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static java.lang.System.out;
public class indeed {
    public static void jobSearch() throws IOException {
        Document doc = Jsoup.connect("https://www.indeed.com/jobs?q=software+developer&l=Spartanburg%2C+SC").get();
        String title = doc.title();
        out.println("title: "+title);

        Elements links = doc.select("a[href]");
        for (Element link:links){
            out.println("\nlink: "+link.absUrl("href"));
            out.println("text: "+link.text());
        }

    }

}
