$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/NHSBSA.feature");
formatter.feature({
  "name": "UK Test Ticket using User Centric BDD",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get help with paying for nhs costs online service if all Negative answers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a citizen of the UK",
  "keyword": "Given "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.validatePageTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into the Checker tool for negative answers",
  "keyword": "When "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.enterDetailsForNoValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not for negative answers",
  "keyword": "Then "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.validateUserEligibleForHelpForNoValue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get help with paying for nhs costs online service if all Positive answers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a citizen of the UK",
  "keyword": "Given "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.validatePageTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into the Checker tool for positive answers",
  "keyword": "When "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.enterDetailsForYesValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not for positive answers",
  "keyword": "Then "
});
formatter.match({
  "location": "com.nhsbsa.steps.NHSBSATestSteps.validateUserEligibleForHelpForYesValue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});