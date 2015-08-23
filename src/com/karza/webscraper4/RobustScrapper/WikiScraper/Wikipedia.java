package com.karza.webscraper4.RobustScrapper.WikiScraper;

import java.io.IOException;
import java.net.MalformedURLException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.karza.webscraper4.RobustScrapper.Tools.IPResolver;
import com.karza.webscraper4.RobustScrapper.Tools.Webpage;

public class Wikipedia {

	/**
	* Crawls both English and German Wikipedia. Finds 10 random
	German Wikipedias by following redirects
	* through the "special:random" page, and returns the country of
	origin for the first IP address
	* (if any) that it finds on the page. After this, does the same
	for English Wikipedia edits.
	* @param args
	*/
	//Crawls both English and German Wikipedias. Returns physicaladdress, and datetime edits were made
	
}
