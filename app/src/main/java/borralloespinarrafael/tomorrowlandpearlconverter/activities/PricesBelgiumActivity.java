package borralloespinarrafael.tomorrowlandpearlconverter.activities;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import borralloespinarrafael.tomorrowlandpearlconverter.R;
import borralloespinarrafael.tomorrowlandpearlconverter.adapter.ExpandableListAdapterBelgium;

public class PricesBelgiumActivity extends AppCompatActivity {

    ExpandableListAdapterBelgium listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prices_belgium);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        expListView = findViewById(R.id.expandableListView);

        prepareListData();

        listAdapter = new ExpandableListAdapterBelgium(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataHeader.add("Drinks");
        List<String> drinks =  createListDrinks();
        listDataChild.put(listDataHeader.get(0), drinks);

        listDataHeader.add("Cocktails");
        List<String> cocktails = createListCocktails();
        listDataChild.put(listDataHeader.get(1), cocktails);

        listDataHeader.add("Belgian Fries TML");
        List<String> belgianFries = createListBelgianFries();
        listDataChild.put(listDataHeader.get(2), belgianFries);

        listDataHeader.add("Belgian Fries Dreamville");
        List<String> belgianFriesDreamville = createListBelgianFriesDreamville();
        listDataChild.put(listDataHeader.get(3), belgianFriesDreamville);

        listDataHeader.add("Ice cream & sweets");
        List<String> iceCreamAndSweets = createListIceCreamAndSweets();
        listDataChild.put(listDataHeader.get(4), iceCreamAndSweets);

        listDataHeader.add("Chicken Hamburger");
        List<String> chickenHamburger = createListChickenHamburger();
        listDataChild.put(listDataHeader.get(5), chickenHamburger);

        listDataHeader.add("Vietnamese street food");
        List<String> vietnameseFood = createListVietnameseFood();
        listDataChild.put(listDataHeader.get(6), vietnameseFood);

        listDataHeader.add("Love tomorrow kebab");
        List<String> kebab = createListKebab();
        listDataChild.put(listDataHeader.get(7), kebab);

        listDataHeader.add("Balls & Glory");
        List<String> ballsAndGlory = createListBallsAndGlory();
        listDataChild.put(listDataHeader.get(8), ballsAndGlory);

        listDataHeader.add("Black Angus Burgers");
        List<String> blackAngusBurgers = createListBlackAngusBurger();
        listDataChild.put(listDataHeader.get(9), blackAngusBurgers);

        listDataHeader.add("Nachos");
        List<String> nachos = createListNachos();
        listDataChild.put(listDataHeader.get(10), nachos);

        listDataHeader.add("Pasta");
        List<String> pasta = createListPasta();
        listDataChild.put(listDataHeader.get(11), pasta);

        listDataHeader.add("Sushi");
        List<String> sushi = createListSushi();
        listDataChild.put(listDataHeader.get(12), sushi);

        listDataHeader.add("Grilled chicken Burgers");
        List<String> grilledChickenBurger = createListGrilledChickenBurger();
        listDataChild.put(listDataHeader.get(13), grilledChickenBurger);

        listDataHeader.add("Paella");
        List<String> paella = createListPaella();
        listDataChild.put(listDataHeader.get(14), paella);

        listDataHeader.add("Tapas");
        List<String> tapas = createListTapas();
        listDataChild.put(listDataHeader.get(15), tapas);

        listDataHeader.add("Asian Food");
        List<String> asianFood = createListAsianFood();
        listDataChild.put(listDataHeader.get(16), asianFood);

        listDataHeader.add("Authentic pizza");
        List<String> pizzas = createListPizza();
        listDataChild.put(listDataHeader.get(17), pizzas);

        listDataHeader.add("Italian sandwiches");
        List<String> italianSandwiches = createListItalianSandwiches();
        listDataChild.put(listDataHeader.get(18), italianSandwiches);

        listDataHeader.add("Waffles");
        List<String> waffles = createListWaffles();
        listDataChild.put(listDataHeader.get(19), waffles);

        listDataHeader.add("Hamburgers Dreamville");
        List<String> hamburgerDreamville = createListHamburgerDreamville();
        listDataChild.put(listDataHeader.get(20), hamburgerDreamville);

        listDataHeader.add("Wrap & Roll");
        List<String> wrap = createListWrap();
        listDataChild.put(listDataHeader.get(21), wrap);

        listDataHeader.add("Noodle burger");
        List<String> noodleBurger = createListNoodleBurger();
        listDataChild.put(listDataHeader.get(22), noodleBurger);

        listDataHeader.add("Sandwiches");
        List<String> sandwiches = createListSandwiches();
        listDataChild.put(listDataHeader.get(23), sandwiches);

        listDataHeader.add("Vegan food");
        List<String> veganFood = new ArrayList<String>();
        veganFood.add("-Veggie Burger           8.5");
        listDataChild.put(listDataHeader.get(24), veganFood);

        listDataHeader.add("Frozen yogurt");
        List<String> frozenYogurt = createListFrozenYogurt();
        listDataChild.put(listDataHeader.get(25), frozenYogurt);

        listDataHeader.add("Smoothies & Healthy Food");
        List<String> smoothies = createListSmoothies();
        listDataChild.put(listDataHeader.get(26), smoothies);

        listDataHeader.add("Ice cream & pancakes");
        List<String> iceCreamAndPancakes = createListIceCreamAndPancakes();
        listDataChild.put(listDataHeader.get(27), iceCreamAndPancakes);

        listDataHeader.add("Bakery");
        List<String> bakery = createListBakery();
        listDataChild.put(listDataHeader.get(28), bakery);

        listDataHeader.add("Donuteria");
        List<String> donuteria = createListDonuteria();
        listDataChild.put(listDataHeader.get(29), donuteria);

        listDataHeader.add("Carrefour Dreamville");
        List<String> carrefour = createListCarrefour();
        listDataChild.put(listDataHeader.get(30), carrefour);

        listDataHeader.add("Charge your phone");
        List<String> chargePhone = createListChargePhone();
        listDataChild.put(listDataHeader.get(31), chargePhone);

        listDataHeader.add("Dreamville Market");
        List<String> dreamvilleMarket = createListDreamvilleMarket();
        listDataChild.put(listDataHeader.get(32), dreamvilleMarket);

    }

    private List<String> createListChargePhone() {
        List<String> chargePhone = new ArrayList<String>();
        chargePhone.add("Unlimited phone charging");
        chargePhone.add("-6 Pearls service fee");
        chargePhone.add("-10 Pearls deposit");
        chargePhone.add("TOTAL = 16 Pearls");
        chargePhone.add("");
        chargePhone.add("BUY a cable:");
        chargePhone.add("-IPhone          3");
        chargePhone.add("-Android         2");
        chargePhone.add("-USB - C         3");


        return chargePhone;
    }

    private List<String> createListCarrefour() {
        List<String> carrefour = new ArrayList<String>();
        carrefour.add("-1 Bottle of water       1.6 (€!!)");
        carrefour.add("-6 Bottles of water     9.6 (€!!)");

        return carrefour;
    }

    private List<String> createListDonuteria() {
        List<String> donuteria = new ArrayList<String>();
        donuteria.add("-Donut toffee                           3.5");
        donuteria.add("-Donut pistache                       3.5");
        donuteria.add("-Donut strawberry                   3.5");
        donuteria.add("-Donut zusto sugar free         3.5");

        return donuteria;
    }

    private List<String> createListBakery() {
        List<String> bakery = new ArrayList<String>();
        bakery.add("-Croissant                         1.5");
        bakery.add("-Pain au chocolat            1.5");
        bakery.add("-Croissant Cheese            2");
        return bakery;
    }

    private List<String> createListIceCreamAndPancakes() {
        List<String> iceCreamAndPancakes = new ArrayList<String>();
        iceCreamAndPancakes.add("--Home made ice cream" + "\n"
                +"Flavour : Vanilla - chocolate");
        iceCreamAndPancakes.add("-1 Scoop         2");
        iceCreamAndPancakes.add("-2 Scoop         2.75");
        iceCreamAndPancakes.add("-3 Scoop         3.5");
        iceCreamAndPancakes.add("-Topping         0.75");
        iceCreamAndPancakes.add("");
        iceCreamAndPancakes.add("-Roket                                 1.5");
        iceCreamAndPancakes.add("-Calippo cola                     1.75");
        iceCreamAndPancakes.add("-Calippo ice tea green      1.75");
        iceCreamAndPancakes.add("-Calippo orange                 1.75");
        iceCreamAndPancakes.add("");
        iceCreamAndPancakes.add("-Pancake banana & nutella             4.5");
        iceCreamAndPancakes.add("-Pancake classic (sugar/sirop)     2.75");
        iceCreamAndPancakes.add("-Pancake nutella                              3.75");
        iceCreamAndPancakes.add("-Pancake icecream                           5");
        iceCreamAndPancakes.add("-Tomorrowland pancakes               5.5");
        iceCreamAndPancakes.add("*Pancakes are always served as 2 pcs on a plate ");

        return iceCreamAndPancakes;

    }

    private List<String> createListSmoothies() {
        List<String> smoothies = new ArrayList<String>();
        smoothies.add("-Super smoothie                                    4.5" + "\n"
        +"Ingredients: strawberry, banana & orange");

        smoothies.add("-Tropical smoothie                                4.5" + "\n"
                +"Ingredients: pineapple, mango & passion fruit");

        smoothies.add("-Refresher                                               4.5" + "\n"
                +"Ingredients: apple, cucumber, lime & mint");

        smoothies.add("-Orange juice                                          4.5");

        smoothies.add("-Protein smoothie red                           4.5" + "\n"
                +"Ingredients: Whey, soy milk, strawberry & raspberry");

        smoothies.add("-Protein smoothie banana                    4.5" + "\n"
                +"Ingredients: Whey, soy milk, banana & pure chocolate");

        smoothies.add("-Tropical breakfast bowl                        6" + "\n"
                +"Ingredients: Mango, pineapple, passion fruit, nuts & granola");

        smoothies.add("-Breakfast bowl red fruit                        6" + "\n"
                +"Ingredients: strawberry, raspberry, blueberry, nuts & granola");

        smoothies.add("-Fruit salad                                                5");

        smoothies.add("-Strawberries                                            5");
        smoothies.add("-Watermelon                                             3");

        smoothies.add("-Breakfast combo (bowl+smoothie)    9.75");
        smoothies.add("-Extra topping                                            1");
        smoothies.add("-Extra protein                                             1.5");


        return smoothies;
    }

    private List<String> createListSandwiches() {
        List<String> sandwiches = new ArrayList<String>();
        sandwiches.add("-Hummus sandwich          4.5");
        sandwiches.add("-Croque classic                  3");
        sandwiches.add("-Club sandwich                  4");

        return sandwiches;
    }

    private List<String> createListFrozenYogurt() {
        List<String> frozenYogurt = new ArrayList<String>();
        frozenYogurt.add("-Frozen yogurt normal           4.75");
        frozenYogurt.add("-Frozen yogurt big                  5.75");
        frozenYogurt.add("-Breakfast cup TML                7");
        frozenYogurt.add("-Extra topping                          0.75");

        return frozenYogurt;
    }

    private List<String> createListNoodleBurger() {
        List<String> noodleBurger = new ArrayList<String>();
        noodleBurger.add("-Feeling veggie           6.5");
        noodleBurger.add("-Classic beef               6.75");
        noodleBurger.add("-Big chicken                 7");

        return noodleBurger;
    }

    private List<String> createListWrap() {
        List<String> wrap = new ArrayList<String>();
        wrap.add("-Wrap                 7" + "\n"
                +"Ingredients: Bacon, chicken, cream cheese and sweet chilli jam");

        return wrap;
    }

    private List<String> createListHamburgerDreamville() {
        List<String> hamburgerDreamville = new ArrayList<String>();
        hamburgerDreamville.add("-Breakfast burger                                  6");
        hamburgerDreamville.add("-Black aberdeen burger                        7");
        hamburgerDreamville.add("-Black aberdeen cheese burger          8");
        hamburgerDreamville.add("-Double cheese burger                         9");

        return hamburgerDreamville;
    }

    private List<String> createListWaffles() {
        List<String> waffles = new ArrayList<String>();
        waffles.add("-Plain waffle                            2.75");
        waffles.add("-Waffle with caramel              4");
        waffles.add("-Waffle with cream                 4.25");
        waffles.add("-Waffle with chocolate           4.5");
        waffles.add("-Waffle with nutella                4.5");
        waffles.add("-Ice ice baby                            6");
        waffles.add("-Caramel delight                     5.5");
        waffles.add("-Banana twist                           6");
        waffles.add("-Strawberry sensation            6");
        waffles.add("-Topping fruit/ice                    2");
        waffles.add("-Topping non fruit                   1.5");


        return waffles;
    }

    private List<String> createListItalianSandwiches() {
        List<String> italianSandwiches = new ArrayList<String>();
        italianSandwiches.add("-Sandwich mozarella        5.25");
        italianSandwiches.add("-Sandwich parma               6.5");
        italianSandwiches.add("-Sandwich tuna                  6.5");

        return italianSandwiches;
    }

    private List<String> createListPizza() {
        List<String> pizzas = new ArrayList<String>();
        pizzas.add("-Pizza Margheritta         4.5");
        pizzas.add("-Pizza Carpaccio            5.5");

        return pizzas;
    }

    private List<String> createListAsianFood() {
        List<String> asianFood = new ArrayList<String>();
        asianFood.add("-Spring rolls                                     4");
        asianFood.add("-Chicken karaage                            5");
        asianFood.add("-Wok noodles                                   8");
        asianFood.add("-Wok noodles + Spring rolls          9");


        return asianFood;
    }

    private List<String> createListTapas() {
        List<String> tapas = new ArrayList<String>();
        tapas.add("-Tapas shrimps           7.5");
        tapas.add("-Tapas España            6.5");
        tapas.add("-Patatas bravas           3.5");

        return tapas;
    }

    private List<String> createListPaella() {
        List<String> paella = new ArrayList<String>();
        paella.add("-Paella                  7");
        paella.add("-Calamaris           4.75");

        return paella;
    }

    private List<String> createListGrilledChickenBurger() {
        List<String> grilledChickenBurger = new ArrayList<String>();
        grilledChickenBurger.add("-Breakfast burger                                    6.5");
        grilledChickenBurger.add("-Bacon/Black pepper burger                 6.5");
        grilledChickenBurger.add("-Homemade crispy chicken sticks       5.5");

        return grilledChickenBurger;
    }

    private List<String> createListSushi() {
        List<String> sushi = new ArrayList<String>();
        sushi.add("-6pcs Sushi                                   11");
        sushi.add("-6pcs Sushi + TML cocktail       15");

        return sushi;
    }

    private List<String> createListBelgianFriesDreamville() {
        List<String> belgianFries = new ArrayList<String>();
        belgianFries.add("-Belgian fries                                   4");
        belgianFries.add("-Belgian fries + Sauce                    4.5");
        belgianFries.add("-Flemish beefstew                          3");
        belgianFries.add("-Real beef croquette                      3.5");
        belgianFries.add("-Cheesy cheese croquette           3.5");
        belgianFries.add("-Chicken skewer                            3.5");
        belgianFries.add("-Special curry sausage                 3.5");

        return belgianFries;
    }

    private List<String> createListPasta() {
        List<String> pasta = new ArrayList<String>();
        pasta.add("-Pasta bolognaise             5.25");
        pasta.add("-Pasta pesto                       5.25");
        pasta.add("-Ravioli                                 5.5" + "\n" +
                "(Mascarpone tomato sauce parmesan)");

        return pasta;
    }

    private List<String> createListDreamvilleMarket() {
        List<String> dreamvilleMarket = new ArrayList<String>();
        dreamvilleMarket.add("-Band aid                                4");
        dreamvilleMarket.add("-Chewing gum                       1");
        dreamvilleMarket.add("-Condoms                               3");
        dreamvilleMarket.add("-Deodorant                             5");
        dreamvilleMarket.add("-Freshmint                              1");
        dreamvilleMarket.add("-Handkerchief                        1");
        dreamvilleMarket.add("-Lighter                                    1");
        dreamvilleMarket.add("-Lip balm                                 4");
        dreamvilleMarket.add("-Lolly (2)                                  1");
        dreamvilleMarket.add("-Mosquito afterbite               5");
        dreamvilleMarket.add("-Mosquito milk                       9");
        dreamvilleMarket.add("-Sunscreen Factor 30            6");
        dreamvilleMarket.add("-Sanitary pad (2)                     1");
        dreamvilleMarket.add("-Tampons (2)                          1");



        return dreamvilleMarket;
    }

    private List<String> createListNachos() {
        List<String> nachos = new ArrayList<String>();
        nachos.add("-Willy nacho classic                           4.5");
        nachos.add("-Willy nacho mexican taste              5.5");
        nachos.add("-Add fresh cilantro                              1");
        nachos.add("-Add cheese sauce                             1");
        nachos.add("-Add guacomole                                  2");

        return nachos;
    }

    private List<String> createListBlackAngusBurger() {
        List<String> blackAngusBurgers = new ArrayList<String>();
        blackAngusBurgers.add("-Woeste burger                                  6.5");
        blackAngusBurgers.add("-Woeste burger hot                            7");

        return blackAngusBurgers;
    }

    private List<String> createListBallsAndGlory() {
        List<String> ballsAndGlory = new ArrayList<String>();
        ballsAndGlory.add("-Just the ball                                       6");
        ballsAndGlory.add("-Ball with salad                                   9.5");
        ballsAndGlory.add("-Ball with mashed potatoes             9.5");

        return ballsAndGlory;
    }

    private List<String> createListKebab() {
        List<String> kebab = new ArrayList<String>();
        kebab.add("-Love tomorrow kebab             6.5");
        return kebab;
    }

    private List<String> createListVietnameseFood() {
        List<String> vietnameseFood = new ArrayList<String>();
        vietnameseFood.add("-Beef stew with rice             8.75");
        vietnameseFood.add("-Curry tofu with rice             8.25");

        return vietnameseFood;
    }

    private List<String> createListChickenHamburger() {
        List<String> chickenHamburger = new ArrayList<String>();
        chickenHamburger.add("-Hamburger kukelecurrie             6");
        chickenHamburger.add("-Hamburger classico                    6");

        return chickenHamburger;
    }

    private List<String> createListIceCreamAndSweets() {
        List<String> iceCreamAndSweets = new ArrayList<String>();
        iceCreamAndSweets.add("-Pancake                               3");
        iceCreamAndSweets.add("-Leonidas balotin                2.5");
        iceCreamAndSweets.add("-Ice cream 1 scoop             2");
        iceCreamAndSweets.add("-Ice cream 2 scoop             2.75");
        iceCreamAndSweets.add("-Ice cream 3 scoop             3.5");
        iceCreamAndSweets.add("-Add topping                         1");
        iceCreamAndSweets.add("-Waffle Liegois                      3");
        iceCreamAndSweets.add("-Brussel Waffle                      3");

        return iceCreamAndSweets;
    }

    private List<String> createListBelgianFries() {
        List<String> belgianFries = new ArrayList<String>();
        belgianFries.add("-Belgian fries                                 3.5");
        belgianFries.add("-Belgian fries + Sauce                 3.75");
        belgianFries.add("-Chicken on a stick                      2.25");
        belgianFries.add("-Beef stew                                     2.75");
        belgianFries.add("-Frikandel                                       2");
        belgianFries.add("-Frikandel special                         2.5");
        belgianFries.add("-Cervela                                          2");
        belgianFries.add("-Boulet/Meatball                           2");
        belgianFries.add("-Meatball special                          2.5");

        return belgianFries;
    }

    private List<String> createListCocktails() {

        List<String> cocktails = new ArrayList<String>();
        cocktails.add("--Tomorrowland cocktail Absolut vodka");
        cocktails.add("-Cucumber           7.5");
        cocktails.add("-Lime                     7.5");
        cocktails.add("-Honey                  7.5");
        cocktails.add("-Lavender             7.5");
        cocktails.add("--Tomorrowland cocktail (non alcoholic) ");
        cocktails.add("-Cucumber           4.5");
        cocktails.add("-Lime                     4.5");
        cocktails.add("-Honey                  4.5");
        cocktails.add("-Lavender             4.5");
        cocktails.add("");
        cocktails.add("--Mojito Havana 3Y");
        cocktails.add("-Lime                 7");
        cocktails.add("-Mint                  7");
        cocktails.add("");
        cocktails.add("--Mai Tai Havana Especial");
        cocktails.add("-Pineapple          7.25");
        cocktails.add("-Almond              7.25");
        cocktails.add("-Triple sec          7.25");
        cocktails.add("");
        cocktails.add("--Sparkling Raspberry Absolut Vodka");
        cocktails.add("-Raspberry                              7.75");
        cocktails.add("-Lime                                       7.75");
        cocktails.add("-Eldeflower                             7.75");
        cocktails.add("-Vallformosa bubbles           7.75");
        cocktails.add("");
        cocktails.add("--2L Cocktails");
        cocktails.add("-Tomorrowland cocktail 2L          40");
        cocktails.add("-Mojito 2L                                        39");
        cocktails.add("-Mai Tai 2L                                      40");

        return cocktails;
    }

    private List<String> createListDrinks() {
        // Adding child data
        List<String> drinks = new ArrayList<String>();
        drinks.add("-Jupiler                                                              2");
        drinks.add("-Jupiler XL                                                        3.75");
        drinks.add("-Hoegaarden Rosee                                        2");
        drinks.add("-Cubanisto                                                        3.5");
        drinks.add("-Pepsi                                                                 2");
        drinks.add("-Pepsi Max                                                        2");
        drinks.add("-7 Up                                                                   2");
        drinks.add("-7 Up sugarfree                                                 2");
        drinks.add("-Mirinda (Orange)                                             2");
        drinks.add("-Looza  (Orange)                                               2.5");
        drinks.add("-Organics Tonic                                                 2");
        drinks.add("-Spa reine 0.33L                                                2");
        drinks.add("-Spa sparkling 0.33L                                        2.5");
        drinks.add("-Spa 0.33 touch of grapefruit                         2.5");
        drinks.add("-Lipton iced tea sparkling                               2");
        drinks.add("-Lipton iced tea green                                     2");
        drinks.add("-Lipton iced tea peach                                    2");
        drinks.add("-Red bull                                                             2");
        drinks.add("-Red bull sugarfree lime                                  2");
        drinks.add("-Red bull green                                                  2");
        drinks.add("-Red bull orange                                                2");
        drinks.add("-Rose wine                                                         3.75");
        drinks.add("-White wine                                                        3.75");
        drinks.add("-Coupe Cava Vallformosa                               4.25");
        drinks.add("-Havana Limon                                                   6.5");
        drinks.add("-Absolut vodka + soft                                       6.5");
        drinks.add("-Havana Club Especial Rum  + soft               6.5");
        drinks.add("-Havana Club 3Y Rum + soft                           6.5");
        drinks.add("-Jameson Whisky + soft                                  6.5");
        drinks.add("-Beefeater gin + soft                                        6.75");
        drinks.add("");
        drinks.add("-Friendship cup holder                                     1");

//        drinks.add("-Jupiler (Alluminium bottle)          3");
//        drinks.add("-Leffe Blond             4");
//        drinks.add("-Goose Island IPA        4");
//        drinks.add("-Coca cola                2");
//        drinks.add("-Coca cola light          2");
//        drinks.add("-Coca zero                2");
//        drinks.add("-Fanta orange             2");
//        drinks.add("-Sprite zero              2");
//        drinks.add("-Minute maid orange       2.5");
//        drinks.add("-Nordic mist tonic        2");

        return drinks;

    }
}