Feature: Shopping cart
    Add, remove items to the cart, check content at various shops and product

@gui
Scenario Outline: Add most expensive or cheap item to the shopping cart
     Given e-shop <shop_name> site is open
     When navigate to product category "<product_category>"
     When navigate to product 1st subcategory "<product_subcategory>"
     When sort products by "<sort_by>"
     And I add one top item from the list to the shopping cart
     And navigate to shop cart
     Then check that cart contains items: "<items_in_cart>"

     Examples:
     | shop_name | product_category | product_subcategory | sort_by | items_in_cart |
     | Datart | Elektromobilita     | Hoverboardy         | PRICE_DESC | 1          |
     | Datart | Elektromobilita     | Hoverboardy         | PRICE_ASC | 1           |
     | Datart | Příslušenství            | Sluchátka           | PRICE_ASC | 1      |
     | Datart | Příslušenství            | Sluchátka           | PRICE_DESC | 1      |
     | Mall | Hobby a zahrada       | Čerpadla            | PRICE     | 1           |
