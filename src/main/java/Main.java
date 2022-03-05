import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "http://mdl.chpt.edu.ua/"; // "https://www.ukr.net/"
        Connection connection = Jsoup.connect(url);
        Document document = connection.get(); // Jsoup.connect(url).get();
        //System.out.println(document);

        Elements element = document.select("meta");
        //System.out.println(element);

        String name = element.attr("name");
        System.out.println(name);

//        System.out.println(document.title());
    }
}
