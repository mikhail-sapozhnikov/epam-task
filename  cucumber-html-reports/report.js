$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "First feature",
  "description": "",
  "id": "first-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "First scenario",
  "description": "",
  "id": "first-feature;first-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "epam main page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I hover over the button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});