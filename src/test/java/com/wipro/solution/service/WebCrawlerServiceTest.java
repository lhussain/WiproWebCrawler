package com.wipro.solution.service;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Jsoup.class})
public class WebCrawlerServiceTest {
    private Document document;
    private WebCrawlerService fixture;

    @Before
    public void setUp() {
        String html = "<html><head><title>First parse</title></head>"
                + "<body>" +
                "<a href='www.dummy.com/test1.html'>valid dummy link </a>" +
                "<a href='www.facebook.com/test2.html'>invalid dummy</a></body>" +
                "</body></html>";
        document = Jsoup.parse(html);
        fixture = new WebCrawlerService();
    }

    @Test
    public void testDomainHasOneValidLink() throws Exception {
        // given
        String domain = "dummy.com";
        Connection connection = mock(Connection.class);
        mockStatic(Jsoup.class);
        when(Jsoup.connect(Mockito.anyString())).thenReturn(connection);
        when(connection.get()).thenReturn(document);

        // when
        List<String> response = fixture.getPageLinks(domain);

        // then
        assertThat(response.size(), is(1));
        assertFalse(response.get(0).contains("facebook.com"));
        assertTrue(response.get(0).contains("dummy.com"));
    }
}
