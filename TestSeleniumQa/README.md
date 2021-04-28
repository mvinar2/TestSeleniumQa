### Running tests
To run all tests:

    mvn clean test
    # or you can simply use bandled execution script
    ./mvnw test

To run GUI tests only(sometimes fails when "random" add window pops up:

    mvn test -Dcucumber.options="--tags @gui"
 
### Test properties
See resources/tests.properties for browser configuration and API authentication settings.
 
 ```
 browser=[Chrome, Firefox]
 driver=<Path to the selenium driver, for example drivers/macos/chromedriver>
 gui_url=<Web UI URL>
 ```

### Test scenarios
Test scenarios are written with Gherkin in feature files, for example: shopping_cart.feature

### Test reports
Reports are saved to reports/ directory, available are:
- HTML - index.html
- JSON - tests.json
- JUNIT - tests.xml

If the GUI test fails, screen shot taken on failure is included.

### Current status
* Test for Datart shop are passing, please feel free to extend list of product categories and subcategories.
* Test for Mall shop is not fully implemented. I have generated all methods from interface definition, but 
   functionality for these methods is not completed. 


### Implementation notes
This simple implementation try to demonstrate how we can use Gherkin and from programing point I'' like to demonstrate 
how we can simply use interface pattern, which helps to extending test implementation for other more test shops 
and re-use same set of test cases. It's only demo what I wrote as demonstration there is still lot of TODOs ;-)

