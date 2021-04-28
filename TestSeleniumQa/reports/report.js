$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cz/shop/qa/features/shopping_cart.feature");
formatter.feature({
  "name": "Shopping cart",
  "description": "    Add, remove items to the cart, check content at various shops and product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.step({
  "name": "e-shop \u003cshop_name\u003e site is open",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate to product category \"\u003cproduct_category\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "navigate to product 1st subcategory \"\u003cproduct_subcategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "sort products by \"\u003csort_by\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.step({
  "name": "check that cart contains items: \"\u003citems_in_cart\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "shop_name",
        "product_category",
        "product_subcategory",
        "sort_by",
        "items_in_cart"
      ]
    },
    {
      "cells": [
        "Datart",
        "Elektromobilita",
        "Hoverboardy",
        "PRICE_DESC",
        "1"
      ]
    },
    {
      "cells": [
        "Datart",
        "Elektromobilita",
        "Hoverboardy",
        "PRICE_ASC",
        "1"
      ]
    },
    {
      "cells": [
        "Datart",
        "Příslušenství",
        "Sluchátka",
        "PRICE_ASC",
        "1"
      ]
    },
    {
      "cells": [
        "Datart",
        "Příslušenství",
        "Sluchátka",
        "PRICE_DESC",
        "1"
      ]
    },
    {
      "cells": [
        "Mall",
        "Hobby a zahrada",
        "Čerpadla",
        "PRICE",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "e-shop Datart site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Verifications.e_shop_site_is_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product category \"Elektromobilita\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProductCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product 1st subcategory \"Hoverboardy\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProduct1stSubCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sort products by \"PRICE_DESC\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.sortProductBy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.add1stTopProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.navigateToShopCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check that cart contains items: \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verifications.checkCartContainsNumberItem(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "e-shop Datart site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Verifications.e_shop_site_is_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product category \"Elektromobilita\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProductCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product 1st subcategory \"Hoverboardy\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProduct1stSubCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sort products by \"PRICE_ASC\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.sortProductBy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.add1stTopProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.navigateToShopCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check that cart contains items: \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verifications.checkCartContainsNumberItem(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "e-shop Datart site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Verifications.e_shop_site_is_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product category \"Příslušenství\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProductCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product 1st subcategory \"Sluchátka\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProduct1stSubCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sort products by \"PRICE_ASC\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.sortProductBy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.add1stTopProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.navigateToShopCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check that cart contains items: \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verifications.checkCartContainsNumberItem(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "e-shop Datart site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Verifications.e_shop_site_is_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product category \"Příslušenství\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProductCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product 1st subcategory \"Sluchátka\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProduct1stSubCategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sort products by \"PRICE_DESC\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.sortProductBy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.add1stTopProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.navigateToShopCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check that cart contains items: \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verifications.checkCartContainsNumberItem(long)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add most expensive or cheap item to the shopping cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "e-shop Mall site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Verifications.e_shop_site_is_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to product category \"Hobby a zahrada\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProductCategory(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Chek if we are at proper product category\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat cz.shop.qa.steps.gui.Actions.navigateToProductCategory(Actions.java:24)\n\tat ✽.navigate to product category \"Hobby a zahrada\"(classpath:cz/shop/qa/features/shopping_cart.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "navigate to product 1st subcategory \"Čerpadla\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.navigateToProduct1stSubCategory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sort products by \"PRICE\"",
  "keyword": "When "
});
formatter.match({
  "location": "Actions.sortProductBy(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add one top item from the list to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.add1stTopProductToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "navigate to shop cart",
  "keyword": "And "
});
formatter.match({
  "location": "Actions.navigateToShopCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check that cart contains items: \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verifications.checkCartContainsNumberItem(long)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});