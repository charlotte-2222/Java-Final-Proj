package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static java.lang.System.out;
import java.io.IOException;
public class scc {
    public static void sccClass() throws IOException {
        Document doc = Jsoup.connect("https://www.sccsc.edu/schoolslist/CET-1/computers.php").get();
        String title = doc.title();
        out.println("title: "+title);
        Elements links = doc.select("a[href]");
        for (Element link:links){
            out.println("\nlink: "+link.absUrl("href"));
            out.println("text: "+link.text());
        }
    }
}
