package com.wipro.solution.mapper;

import com.wipro.solution.model.LinksWrapper;
import com.wipro.solution.service.WebCrawlerService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebCrawlerMapper {
    private static final Logger LOGGER = Logger.getLogger(WebCrawlerService.class.getName());

    private ObjectMapper mapper;
    private DefaultPrettyPrinter pp;

    public WebCrawlerMapper() {
        this.mapper = new ObjectMapper();
        this.pp = new DefaultPrettyPrinter();
        this.pp.indentArraysWith(new DefaultPrettyPrinter.Lf2SpacesIndenter());
    }

    public String mapToJson(List<String> links) {
        try {
            return mapper.writer(pp).writeValueAsString(new LinksWrapper().withLinks(links));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "mapping error occurred", e);
            return null;
        }
    }
}