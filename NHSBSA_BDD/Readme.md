## NHSBSA


### Installation (pre-requisites)

1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Eclipse
4. Eclipse Plugins for
    - Maven
    - Cucumber

### Framework set up

Fork / Clone repository from [here]( https://github.com/amiya-pattnaik/selenium-cucumber-java) or download zip and set
it up in your local workspace.

### Test Coverage

The automation tests cover the functional flows with all 'Yes' and 'No' answers,
any functional flow with the combination of Yes and No value is not covered in the automated tests 


### Run Some Sample Tests


- To run features on specific browser use, `mvn test "-Dbrowser=browser_name"`
  browser_name can be one of following but make sure that browser’s driver file are present and specified in system
  variable. -- firefox -- chrome etc.

Please note that browser drivers are not included as part of this framework. The reason for not including is that
selenium browser driver version are varies based on the browser version that you are using and also selenium server
version.

- To run specific feature if you have multiple feature files use,
  `mvn test -Dcucumber.options="classpath:features/my_first.feature"`


### Reporters

Once you ran your tests you can generate the various types of reports. This framework `selenium-cucumber-java` uses
several different types of test reporters to communicate pass/failure.



##### HTML Report:

To generate HTML report use  `mvn test -Dcucumber.options="–plugin html:target/result.html"`

##### JSON Report:

To generate a JSON report Use `mvn test -Dcucumber.options="–plugin json:target/result.json"`



### Develop automation scripts using BDD approach - Cucumber-Java

There are already many predefined StepDefinitions which is packaged under `/steps/NHSBSATestSteps.java` 

Tests are written in the Cucumber framework using the Gherkin Syntax. More about Gherkin & Cucumber can be found
at https://cucumber.io/docs/reference 

### The Page Object Design Pattern

Within your web app's UI there are areas that your tests interact with. A Page Object simply models these as objects
within the test code. This reduces the amount of duplicated code and means that if the UI changes, the fix need only be
applied in one place. In other wards one of the challenges of writing test automation is keeping your [selectors] (
classes, id's, or xpath' etc.) up to date with the latest version of your code. The next challenge is to keep the code
you write nice and `DRY (Don't Repeat Yourself)`. The page object pattern helps us accomplish this in one solution.
Instead of including our selectors in our step definitions(in cucumber) we instead place them in a <pagename>.java file
where we can manage all these selectors and methods together. Your test file should only call the test methods.

You can also place reusable methods or logic inside of these pages and call them from your step java files. The page
object serves as a layer of abstraction between tests and code. When A test fails, it fails on a individual step. That
step may call a selector that is no longer valid, but that selector may be used by many other steps. By having a single
source of truth of what the selector is supposed to be, fixing one selector on the page object could repair a number of
failing tests that were affected by the same selector.

