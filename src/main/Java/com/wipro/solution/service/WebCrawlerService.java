package com.wipro.solution.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class WebCrawlerService {
    private static final Logger LOGGER = Logger.getLogger(WebCrawlerService.class.getName());
    private static final String URL_PREFIX = "http://www.";
    private static final String DEFAULT_DOMAIN = "wiprodigital.com";


    public List<String> crawlPageLinks(String domain) {
        List<String> linksList = new ArrayList<>();
        try {
            String url = URL_PREFIX + domain;
            Document document = Jsoup.connect(url).get();
            Elements linksOnPage = document.select("a");

            for (Element page : linksOnPage) {
                String link = page.attr("href");
                if (link.contains(domain)) { // only add the links relating the domain (skip external links)
                    linksList.add(link);
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "an error occurred for domain: " + domain, e);
        }
        return linksList;
    }

    public static void main(String[] args) {
        String localDomain = DEFAULT_DOMAIN;
        if (args != null && args.length > 0) {
            localDomain = args[0];
        }
        List<String> linksList = new WebCrawlerService().crawlPageLinks(localDomain);
        linksList.forEach(link ->  System.out.println(link));
    }
}