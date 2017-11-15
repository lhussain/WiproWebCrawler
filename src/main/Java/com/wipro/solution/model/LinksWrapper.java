package com.wipro.solution.model;

import java.util.List;

public class LinksWrapper {

    private List<String> links;

    public List<String> getLinks() {
        return links;
    }

    public LinksWrapper withLinks(List<String> links) {
        this.links = links;
        return this;
    }
}