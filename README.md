# WiproWebCrawler
Basic web crawler using Java and gradle wrapper

1) To execute tests run the command from root directory as: 
    
    ./gradlew clean test -Pdomain
    
2) To execute the main programme with a domain name (e.g wiprodigital.com) run:
    
    ./gradlew clean runMain -Pdomain='wiprodigital.com'
    
Note:  This will create a json file under the root project called domainLinks.json after it has web crawled the sight.

Assumptions:  the exercise is relatively simple therefore deliberately chose not to use enterprise patterns or frameworks and over complicate it.

Possible improvements: could perhaps write more tests to see that the external links have not been included.

Output from wiprodigital.com:

{
  "links" : [
    "http://wiprodigital.com",
    "http://wiprodigital.com/who-we-are",
    "http://wiprodigital.com/who-we-are",
    "http://wiprodigital.com/who-we-are/#wdteam-vid",
    "http://wiprodigital.com/who-we-are#wdteam_meetus",
    "http://wiprodigital.com/who-we-are#wdteam_leaders",
    "http://wiprodigital.com/what-we-do",
    "http://wiprodigital.com/what-we-do#work-three-circles-row",
    "http://wiprodigital.com/what-we-do#wdwork_cases",
    "http://wiprodigital.com/what-we-do#wdwork_partners",
    "http://wiprodigital.com/what-we-think",
    "http://wiprodigital.com/?s=&post_type[]=post",
    "http://wiprodigital.com/?s=&post_type[]=cases",
    "http://wiprodigital.com/?s=&post_type[]=events",
    "http://wiprodigital.com/?s=&post_type[]=news",
    "http://wiprodigital.com/join-our-team",
    "http://wiprodigital.com/join-our-team",
    "http://wiprodigital.com/join-our-team#wdwork-vid",
    "http://wiprodigital.com/join-our-team#wdcareers_team",
    "http://wiprodigital.com/join-our-team#wdcareers_jobs",
    "http://wiprodigital.com/get-in-touch",
    "http://wiprodigital.com/get-in-touch#wddi-locations",
    "http://wiprodigital.com/get-in-touch#wddi-contact",
    "http://wiprodigital.com/news/report-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption/",
    "http://wiprodigital.com/news/wipro-digital-acquire-cooper-leader-ux-interaction-design-expand-designits-capabilities/",
    "http://wiprodigital.com/news/wipro-named-global-leader-digital-transformation-strategy-consulting/",
    "http://wiprodigital.com/2017/10/17/time-reinvent-marketing-agency/",
    "http://wiprodigital.com/2017/09/21/digital-transformation-means-changing-entire-enterprise/",
    "http://wiprodigital.com/2017/11/14/how-holiday-shopping-can-help-retailers-reshape-their-personalization-strategies/",
    "http://wiprodigital.com/2017/11/15/iot-sustainability-report-vision-2030-connected-future/",
    "http://wiprodigital.com/2017/11/14/how-holiday-shopping-can-help-retailers-reshape-their-personalization-strategies/",
    "http://wiprodigital.com/2017/08/24/applying-agile-methodology-to-marketing-what-cmos-should-know/",
    "http://wiprodigital.com/2017/09/27/reducing-vehicle-recalls-machine-learning-artificial-intelligence/",
    "http://wiprodigital.com/2017/09/21/digital-transformation-means-changing-entire-enterprise/",
    "http://wiprodigital.com/2017/10/17/time-reinvent-marketing-agency/",
    "http://wiprodigital.com/cases/progressive-metering-a-utilitys-strategic-move-into-predictive-planning/",
    "http://wiprodigital.com/cases/increasing-customer-value-through-iot-for-jcb-india/",
    "http://wiprodigital.com/cases/case-study-esab/",
    "http://wiprodigital.com/case-study-redefining-newborn-care-for-volusense/",
    "http://wiprodigital.com/cases/case-study-speaking-from-the-heart/",
    "http://wiprodigital.com/cases/in24/",
    "http://wiprodigital.com/2017/02/07/nrfs-retails-big-show-digital/",
    "http://wiprodigital.com/events/wipro-digital-sap-hybris-global-summit-2017/",
    "http://wiprodigital.com/events/wipro-digital-at-intersection-conference-for-strategic-enterprise-design-2017/",
    "http://wiprodigital.com/events/hannover-messe-2017-adding-value-industry-4-0/",
    "http://wiprodigital.com/2017/10/13/videos-reflections-three-years-iot-solutions-world-congress-2017-year-iot-roi/",
    "http://wiprodigital.com/events/wipro-digital-iot-solutions-world-congress-2017/",
    "http://wiprodigital.com/news/report-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption/",
    "http://wiprodigital.com/news/ai-design-can-make-artificial-intelligence-less-artificial-intelligent/",
    "http://wiprodigital.com/news/wipro-digital-acquire-cooper-leader-ux-interaction-design-expand-designits-capabilities/",
    "http://wiprodigital.com/news/wipro-named-global-leader-digital-transformation-strategy-consulting/",
    "http://wiprodigital.com/news/new-survey-highlights-leadership-crisis-digital-transformation/",
    "http://wiprodigital.com/news/digital-transformation-idc-report-future-services-wipro-digital/",
    "http://wiprodigital.com/designit-approach/",
    "http://wiprodigital.com/designit-approach",
    "http://wiprodigital.com/designit-approach",
    "http://wiprodigital.com/designit-approach",
    "http://wiprodigital.com/designit-approach",
    "http://iot.wiprodigital.com/",
    "http://wiprodigital.com/who-we-are",
    "http://wiprodigital.com/who-we-are",
    "http://wiprodigital.com/who-we-are#wdteam_meetus",
    "http://wiprodigital.com/who-we-are#wdteam_leaders",
    "http://wiprodigital.com/what-we-do#work-three-circles-row",
    "http://wiprodigital.com/what-we-do#wdwork_cases",
    "http://wiprodigital.com/what-we-do#wdwork_partners",
    "http://wiprodigital.com/?s=&post_type[]=post",
    "http://wiprodigital.com/?s=&post_type[]=news",
    "http://wiprodigital.com/?s=&post_type[]=events",
    "http://wiprodigital.com/join-our-team",
    "http://wiprodigital.com/join-our-team#wdcareers_team",
    "http://wiprodigital.com/join-our-team#wdcareers_jobs",
    "http://wiprodigital.com/privacy-policy"
  ]
}