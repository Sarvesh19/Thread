import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		// Document doc = Jsoup.connect("http://www.boxofficeindia.com/").get();
		Document doc = Jsoup
				.connect(
						"https://stackoverflow.com/questions/10636611/how-does-access-control-allow-origin-header-work")
				.get();
		
		Document doc1 = Jsoup
				.connect(
						"http://www.indicine.com/boxoffice/india/100-crore-club/")
				.get();
		System.out.println(doc1.title());
		System.out.println(doc1.getElementsByTag("th"));;
		//String[] s = doc1.getElementsByClass("tablepress tablepress-id-165").html().split(" ");
		//System.out.println(s[0]);
		//System.out.println(doc1.getElementsByClass("tablepress tablepress-id-165").html());
		
		// select title of the page
		System.out.println(doc.getElementsByClass("post-text").text());

		//System.out.println(doc.title());
		// select text of whole page
		// System.out.println(doc.text());
		// System.out.println(doc.getAllElements());
		// System.out.println(doc.getElementsByClass("sectionheader"));
		// System.out.println(doc.getElementById("footer-info-lastmod"));
		// select text of body
		//System.out.println(doc.getElementsByTag("body").text());
		// select text of paragraph
		//System.out.println(doc.getElementsByTag("p").text());

		// return this.http.get((window as any).rest +
		// "localcontent/getquicktestJsoup")
		// .map((res: Response) => res.text());
	}
}
