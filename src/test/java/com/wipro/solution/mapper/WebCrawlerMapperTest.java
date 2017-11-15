package com.wipro.solution.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class WebCrawlerMapperTest {
    private static final String EXPECTED_JSON_OUTPUT = "{\n  " +
            "\"links\" : [\n    " +
            "\"http://wiprodigital.com\",\n    " +
            "\"http://wiprodigital.com/who-we-are\"\n  " +
            "]\n}";

    private WebCrawlerMapper fixture;

    @Before
    public void setUp() {
        fixture = new WebCrawlerMapper();
    }

    @Test
    public void testMaperGivesTwoLinksAsJson() throws Exception {
        // given
        List<String> links = Arrays.asList("http://wiprodigital.com", "http://wiprodigital.com/who-we-are");

        // when
        String jsonResponse = fixture.mapToJson(links);

        // then
        assertThat(jsonResponse, is(EXPECTED_JSON_OUTPUT));
    }
}
