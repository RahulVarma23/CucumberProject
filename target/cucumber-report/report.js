$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/feature/Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "User verify text GMO Online on home page",
  "description": "",
  "id": "user-verify-text-gmo-online-on-home-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Select value from drop down",
  "description": "User open application \"\u003cappURL\u003e\"\r\nUser select value from dropdown and get all options\r\nUser logout from application\r\n\r\nExamples:\r\n| appURL | \r\n| fbURL  | \r\n\r\nScenario Outline: Drag and drop image",
  "id": "user-verify-text-gmo-online-on-home-page;select-value-from-drop-down",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User open application \"\u003cappURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User drag image from one location to another location",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User logout from application",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "user-verify-text-gmo-online-on-home-page;select-value-from-drop-down;",
  "rows": [
    {
      "cells": [
        "appURL"
      ],
      "line": 19,
      "id": "user-verify-text-gmo-online-on-home-page;select-value-from-drop-down;;1"
    },
    {
      "cells": [
        "dragAndDropURL"
      ],
      "line": 20,
      "id": "user-verify-text-gmo-online-on-home-page;select-value-from-drop-down;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Select value from drop down",
  "description": "User open application \"\u003cappURL\u003e\"\r\nUser select value from dropdown and get all options\r\nUser logout from application\r\n\r\nExamples:\r\n| appURL | \r\n| fbURL  | \r\n\r\nScenario Outline: Drag and drop image",
  "id": "user-verify-text-gmo-online-on-home-page;select-value-from-drop-down;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User open application \"dragAndDropURL\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User drag image from one location to another location",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User logout from application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dragAndDropURL",
      "offset": 23
    }
  ],
  "location": "stepLib.user_open_application(String)"
});
formatter.result({
  "duration": 30872526500,
  "status": "passed"
});
formatter.match({
  "location": "stepLib.user_drag_image_from_one_location_to_another_location()"
});
formatter.result({
  "duration": 6605755000,
  "status": "passed"
});
formatter.match({
  "location": "stepLib.user_logout_from_application()"
});
formatter.result({
  "duration": 882066200,
  "status": "passed"
});
});