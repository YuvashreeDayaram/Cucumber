$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/kids.feature");
formatter.feature({
  "name": "Ajio",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Ajio launching function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Ajio website \"https://www.ajio.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "KidsClothing.launch_the_Ajio_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the broken link \"https://www.ajio.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "KidsClothing.to_check_the_broken_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Kids and click the clothing",
  "keyword": "And "
});
formatter.match({
  "location": "KidsClothing.navigate_to_Kids_and_click_the_clothing()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "kids clothing sorthing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Kids"
    }
  ]
});
formatter.step({
  "name": "user click sort dropdown and select option in a dropdown with one dim map",
  "rows": [
    {
      "cells": [
        "sort1",
        "highest"
      ]
    },
    {
      "cells": [
        "sort2",
        "Discount"
      ]
    },
    {
      "cells": [
        "sort3",
        "lowest"
      ]
    },
    {
      "cells": [
        "sort4",
        "What"
      ]
    },
    {
      "cells": [
        "sort5",
        "Ratings"
      ]
    },
    {
      "cells": [
        "sort6",
        "Relevance"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "KidsClothing.user_click_sort_dropdown_and_select_option_in_a_dropdown_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "KidsClothing.validate_the_outcome()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/mens.feature");
formatter.feature({
  "name": "Ajio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "mens",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mens"
    },
    {
      "name": "@Clothing"
    }
  ]
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the Ajio \"https://www.ajio.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MensClothing.launch_the_Ajio(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check broken link \"https://www.ajio.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MensClothing.to_check_broken_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate To Mens clothing",
  "keyword": "And "
});
formatter.match({
  "location": "MensClothing.navigate_To_Mens_clothing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click sort dropdown and select a value",
  "keyword": "When "
});
formatter.match({
  "location": "MensClothing.user_Click_sort_dropdown_and_select_a_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "MensClothing.validate_outcome()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});