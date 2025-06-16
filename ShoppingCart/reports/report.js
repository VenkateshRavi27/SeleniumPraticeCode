$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Features\\addToCart.feature");
formatter.feature({
  "name": "Shopping Application Demo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CleanUp"
    }
  ]
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the create an login link",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User search the men \"\u003choodie\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User add the hoodie to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "Cart badge should be updated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "hoodie"
      ]
    },
    {
      "cells": [
        "viratanu96@gmail.com",
        "Test@7890",
        "Ajax Full-Zip Sweatshirt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CleanUp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the create an login link",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.userClicksOnTheCreateAnLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"viratanu96@gmail.com\" and \"Test@7890\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.userEntersTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User search the men \"Ajax Full-Zip Sweatshirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.userSearchTheMen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User add the hoodie to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.userAddTheHoodieToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Cart badge should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.cartBadgeShouldBeUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});