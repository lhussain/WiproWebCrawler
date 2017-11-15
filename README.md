# WiproWebCrawler
Basic web crawler using Java and gradle wrapper

1) To execute tests run the command from root directory as: 
    
    ./gradlew clean test -Pdomain
    
2) To execute the main programme with a domain name (e.g wiprodigital.com) run:
    
    ./gradlew clean runMain -Pdomain='wiprodigital.com'
    
Note:  This will create a json file under the root project called domainLinks.json after it has web crawled the sight.

Assumptions:  the exercise is relatively simple therefore deliberately chose not to use enterprise patterns or frameworks and over complicate it.

Possible improvements: could perhaps write more tests to see that the external links have not been included.

