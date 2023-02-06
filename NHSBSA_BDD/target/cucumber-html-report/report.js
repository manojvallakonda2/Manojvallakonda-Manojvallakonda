$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/NHSBSA.feature");
formatter.feature({
  "name": "UK Test Ticket using User Centric BDD",
  "description": "Test Coverage: The automation tests cover the functional flows with all \u0027Yes\u0027 and \u0027No\u0027 answers,\nany functional flow with the combination of Yes and No value is not covered in the automated tests ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Accessibility Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have started accessibility testing for my web site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.performAccessibilityTesting()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat com.nhsbsa.steps.NHSBSATestSteps.performAccessibilityTesting(NHSBSATestSteps.java:43)\r\n\tat ✽.I have started accessibility testing for my web site(file:///C:/Users/SHUBHANKAR/Desktop/My_Home_Projects/TA_Git/TA/NHSBSA_BDD/src/test/resources/NHSBSA.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});