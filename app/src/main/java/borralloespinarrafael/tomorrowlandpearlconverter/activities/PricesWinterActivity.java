package borralloespinarrafael.tomorrowlandpearlconverter.activities;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import borralloespinarrafael.tomorrowlandpearlconverter.R;
import borralloespinarrafael.tomorrowlandpearlconverter.adapter.ExpandableListAdapterWinter;

public class PricesWinterActivity extends AppCompatActivity {

    ExpandableListAdapterWinter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_prices_winter);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        expListView = findViewById(R.id.expandableListView);
        prepareListData();
        listAdapter = new ExpandableListAdapterWinter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataHeader.add("Beers");
        List<String> beers = createListBeers();
        listDataChild.put(listDataHeader.get(0), beers);

        listDataHeader.add("Soft drinks");
        List<String> softDrinks = createListSoftDrinks();
        listDataChild.put(listDataHeader.get(1), softDrinks);

        listDataHeader.add("Cocktails");
        List<String> cocktails = createListCocktails();
        listDataChild.put(listDataHeader.get(2), cocktails);

        listDataHeader.add("Liquors");
        List<String> liquors = createListLiquors();
        listDataChild.put(listDataHeader.get(3), liquors);

        listDataHeader.add("Champagne");
        List<String> champagne = createListChampagne();
        listDataChild.put(listDataHeader.get(4), champagne);

        listDataHeader.add("Wine");
        List<String> wine = createListWine();
        listDataChild.put(listDataHeader.get(5), wine);


        listDataHeader.add("Hot drinks");
        List<String> hotDrinks = createListHotDrinks();
        listDataChild.put(listDataHeader.get(6), hotDrinks);


        listDataHeader.add("Belgian Fries");
        List<String> belgianFries = createListBelgianFries();
        listDataChild.put(listDataHeader.get(7), belgianFries);

        listDataHeader.add("Raclette");
        List<String> raclette = createListRaclette();
        listDataChild.put(listDataHeader.get(8), raclette);

        listDataHeader.add("Nachos");
        List<String> nachos = createListNachos();
        listDataChild.put(listDataHeader.get(9), nachos);

        listDataHeader.add("Amicorum Stage Buffet");
        List<String> amicorumStageBuffet = createListAmicorumStageBuffet();
        listDataChild.put(listDataHeader.get(10), amicorumStageBuffet);

        listDataHeader.add("Belgian Beers");
        List<String> belgianBeers = createListBelgianBeers();
        listDataChild.put(listDataHeader.get(11), belgianBeers);

        listDataHeader.add("Curry");
        List<String> curry = createListCurry();
        listDataChild.put(listDataHeader.get(12), curry);

        listDataHeader.add("Chicken Burgers");
        List<String> chickenBurgers = createListChickenBurgers();
        listDataChild.put(listDataHeader.get(13), chickenBurgers);

        listDataHeader.add("Burgers");
        List<String> burgers = createListBurgers();
        listDataChild.put(listDataHeader.get(14), burgers);

        listDataHeader.add("Italian food");
        List<String> italianFood = createListItalianFood();
        listDataChild.put(listDataHeader.get(15), italianFood);

        listDataHeader.add("Cheese");
        List<String> cheese = createListCheese();
        listDataChild.put(listDataHeader.get(16), cheese);

        listDataHeader.add("Asian food");
        List<String> asianFood = createListAsianFood();
        listDataChild.put(listDataHeader.get(17), asianFood);

        listDataHeader.add("Waffles");
        List<String> waffles = createListWaffles();
        listDataChild.put(listDataHeader.get(18), waffles);

        listDataHeader.add("Balls & Glory");
        List<String> ballsAndGlory = createListBallsAndGlory();
        listDataChild.put(listDataHeader.get(19), ballsAndGlory);

        listDataHeader.add("Soup");
        List<String> soup = createListSoup();
        listDataChild.put(listDataHeader.get(20), soup);

        listDataHeader.add("Hot Sandwiches");
        List<String> hotSandwiches = createListHotSandwiches();
        listDataChild.put(listDataHeader.get(21), hotSandwiches);
    }

    private List<String> createListWine() {
        List<String> wine = new ArrayList<>();
        wine.add("--White wine Apremont, Cuvée Nicolas");
        wine.add("-Glass 15cl                                                     3");
        wine.add("-Bottle 75cl                                                    18");
        wine.add("");
        wine.add("--Rose wine Peyrassol Cuvée commanderie");
        wine.add("-Glass 15cl                                                     3");
        wine.add("-Bottle 75cl                                                    18");
        wine.add("-Bottle 150cl                                                  36");
        wine.add("--Rose wine Minuty Rosé OR");
        wine.add("-Bottle 150cl                                                   72");
        wine.add("");
        wine.add("--Red wine Chapitre 2016");
        wine.add("-Glass 15cl                                                      3");
        wine.add("-Bottle 75cl                                                     18");
        wine.add("--Red wine Terrasses du Larzac-Lambrusques AOP");
        wine.add("-Bottle 75cl                                                     24");
        wine.add("-Red wine Crozes Hermitage");
        wine.add("-Bottle 75cl                                                      30");

        return wine;
    }

    private List<String> createListChampagne() {
        List<String> champagne = new ArrayList<>();
        champagne.add("-Champagne G.H. Mumm 75cl                           48");
        champagne.add("-Champagne G.H. Mumm 1.5l Magnum           96");
        champagne.add("-Champagne Moët & Chandon 75cl                  52");
        champagne.add("-Champagne Moët & Chandon 1,5l Magnum  104");
        return champagne;
    }

    private List<String> createListLiquors() {
        List<String> liquors = new ArrayList<>();
        liquors.add("-Absolut Vodka 4cl                                             5");
        liquors.add("-Havana Club Especial Rum 4cl                       5");
        liquors.add("-Ballantine's Whisky 4cl                                     5");
        liquors.add("-Beefeater gin                                                      5");
        liquors.add("(All the previews liquors include soft or energy)");
        liquors.add("");
        liquors.add("-Ricard 3cl                                                             3");

        return liquors;
    }

    private List<String> createListHotDrinks() {
        List<String> hotDrinks = new ArrayList<>();
        hotDrinks.add("-Capuccino                                                      2.5");
        hotDrinks.add("-Coffee                                                             1.75");
        hotDrinks.add("-Coffee milk                                                     2");
        hotDrinks.add("-Espresso                                                         1.25");
        hotDrinks.add("-Hot chocolate                                                1.75");
        hotDrinks.add("-Hot chocolate with cream                           2.25");
        hotDrinks.add("-Tea                                                                   2");
        hotDrinks.add("-Hot wine                                                         2.75");

        return hotDrinks;
    }

    private List<String> createListSoftDrinks() {
        List<String> softDrinks = new ArrayList<>();
        softDrinks.add("-Still water 33cl                                              1.5");
        softDrinks.add("-Pepsi / Pepsi Max 33cl                               1.75");
        softDrinks.add("-7UP / 7UP Free 33cl                                    1.75");
        softDrinks.add("-Mirinda 33cl                                                  1.75");
        softDrinks.add("-Liptonic 33cl                                                 1.75");
        softDrinks.add("-Lipton Ice Tea Peach 33cl                         1.75");
        softDrinks.add("-Lipton Ice Tea Green Lime & Mint 33cl   1.75");
        softDrinks.add("-Organic tonic by Red Bull 25cl                  1.75");
        softDrinks.add("-Tropicana Orange Juice 30cl                    1.75");
        softDrinks.add("-Red Bull Energy drink                                  1.75");
        softDrinks.add("-Red Bull Sugarfree                                       1.75");
        softDrinks.add("-Red Bull Tropical 25cl                                 1.75");

        return softDrinks;
    }

    private List<String> createListHotSandwiches() {
        List<String> hotSandwiches = new ArrayList<>();
        hotSandwiches.add("-Panciotti                                                         3\n(with speck ham and italian cheese)");
        hotSandwiches.add("-Panciotti                                                         3\n(with ham and italian cheese)");
        hotSandwiches.add("-Focaccia                                                         4\n(ham and mozzarella)");
        hotSandwiches.add("-Vegetarian toastie                                        4\n(mozzarella and marinated tomatoes)");

        return hotSandwiches;
    }

    private List<String> createListSoup() {
        List<String> ballsAndGlory = new ArrayList<>();
        ballsAndGlory.add("-Organic coral lentils and curry soup 33cl    3");
        ballsAndGlory.add("-Organic green soup 33cl                                3");
        ballsAndGlory.add("-Organic squash soup 33cl                             3");
        return ballsAndGlory;
    }

    private List<String> createListBallsAndGlory() {
        List<String> ballsAndGlory = new ArrayList<>();
        ballsAndGlory.add("-Meatball pork                                                5\n(with raclette)");
        ballsAndGlory.add("-Meatball chicken                                          5\n(with mushrooms)");
        ballsAndGlory.add("-Meatball veggie                                            5\n(with arancini tomato mozzarella)");
        ballsAndGlory.add("-Mashed potatoes                                        2.5");

        return ballsAndGlory;
    }

    private List<String> createListWaffles() {
        List<String> waffles = new ArrayList<>();
        waffles.add("-Waffle with sugar                                           3");
        waffles.add("-Waffle with nutella                                        3.5");
        waffles.add("-Waffle whipped cream                                 3.25");
        return waffles;
    }

    private List<String> createListAsianFood() {
        List<String> asianFood = new ArrayList<>();
        asianFood.add("-Noodle soup                                                     5");
        return asianFood;
    }

    private List<String> createListCheese() {
        List<String> cheese = new ArrayList<>();
        cheese.add("-Tartiflette Traditional                                   6\n(French roblochon cheese, gnocchi, ham, cream and onions)");
        cheese.add("-Tartiflette Vegetarian                                   6\n(French roblochon cheese, gnocchi, cream and onions)");
        cheese.add("-Big cheese platter                                        6");
        cheese.add("-Small cheese platter                                    4");
        return cheese;
    }

    private List<String> createListItalianFood() {
        List<String> italianFood = new ArrayList<>();
        italianFood.add("-Pasta bolognaise                                      4.5");
        italianFood.add("-Mac'n Cheese                                            4.5");
        return italianFood;
    }

    private List<String> createListBurgers() {
        List<String> burgers = new ArrayList<>();
        burgers.add("-Traditional burger                                         6\n(Beef burger with blue cheese, BBQ sauce and bacon)");
        burgers.add("-Mountain burger                                           6\n(Beef burger with raclette cheese and BBQ sauce)");

        return burgers;
    }

    private List<String> createListChickenBurgers() {
        List<String> chickenBurgers = new ArrayList<>();
        chickenBurgers.add("-Classic burger                                              5.5");
        chickenBurgers.add("-Bacon black pepper burger                       5.5");
        chickenBurgers.add("-Savoyard burger                                          5.5");

        return chickenBurgers;
    }

    private List<String> createListCurry() {
        List<String> curry = new ArrayList<>();
        curry.add("-Green Curry (with Vegetables)                    5");
        curry.add("-Curry Massaman (with Chicken)                 6");
        curry.add("-Curry Panag (with Shrimps)                         6.5");
        curry.add("-Spring rolls (with Chicken)                           4.5");

        return curry;
    }

    private List<String> createListBelgianBeers() {
        List<String> belgianBeers = new ArrayList<>();
        belgianBeers.add("-Leffe Blond 33cl                                                3");
        belgianBeers.add("-Leffe Ruby 33cl                                                 3");
        belgianBeers.add("-Hoegaardden White 33cl                                3");
        belgianBeers.add("-Triple Karmeliet 33cl                                        3");
        belgianBeers.add("-Stella Artois 33cl                                              2.75");

        return belgianBeers;
    }

    private List<String> createListAmicorumStageBuffet() {
        List<String> amicorumStageBuffet = new ArrayList<>();
        amicorumStageBuffet.add("-Lasagna (with beef)                                      10");
        amicorumStageBuffet.add("-Crozyflette                                                       9");
        amicorumStageBuffet.add("-Chicken (with mushrooms)                          8");
        amicorumStageBuffet.add("-Pot-au-feu (veggie)                                         8");
        amicorumStageBuffet.add("-Hot-Pot with Diot (French sausage)            9");
        amicorumStageBuffet.add("-Pannacotta                                                       3");
        amicorumStageBuffet.add("-Chocolate Pie                                                   3");
        amicorumStageBuffet.add("-Chocolate cake                                                3");
        amicorumStageBuffet.add("-Coockie                                                             2");

        return amicorumStageBuffet;
    }

    private List<String> createListNachos() {
        List<String> nachos = new ArrayList<>();
        nachos.add("-Normal nachos                                4.75");
        nachos.add("-Chilly nachos                                   6.75");
        nachos.add("-Chicken wings                                 4.75");

        return nachos;
    }

    private List<String> createListRaclette() {
        List<String> raclette = new ArrayList<>();
        raclette.add("-Raclette Traditional                        6");
        raclette.add("-Raclette Vegetarian                        6");
        return raclette;
    }

    private List<String> createListBelgianFries() {
        List<String> belgianFries = new ArrayList<>();
        belgianFries.add("-Belgian fries                                                  3");
        belgianFries.add("-Belgian fries + Sauce                                  3.5");
        belgianFries.add("-Fricadelle                                                       2");
        belgianFries.add("-Meatball                                                         2");
        belgianFries.add("-Fries + Steak + Sauce                                 6");
        belgianFries.add("-Fries + Beef stew                                         5");

        return belgianFries;
    }

    private List<String> createListCocktails() {

        List<String> cocktails = new ArrayList<>();
        cocktails.add("--Mojito - Havana Club 3 Years 4cl");
        cocktails.add("-Lime                                                                   5.5");
        cocktails.add("-Mint                                                                    5.5");
        cocktails.add("");
        cocktails.add("--Cancha - Havana Club 7 Years 4cl");
        cocktails.add("-Honey                                                                5.5");
        cocktails.add("-Lime                                                                   5.5");
        cocktails.add("");
        cocktails.add("--Basil Smash - Beefeater Gin 4cl");
        cocktails.add("-Fresh Basil                                                       5.5");
        cocktails.add("-Fresh Lime                                                       5.5");
        cocktails.add("-Sugarcane                                                        5.5");
        cocktails.add("-Tonic                                                                 5.5");


        return cocktails;
    }

    private List<String> createListBeers() {
        List<String> beers = new ArrayList<>();
        beers.add("-Budweiser 33cl                                               2");
        beers.add("-Cubanisto 33cl                                               3");
        beers.add("-Corona 33.5cl                                                 3.25");
        beers.add("-Corona Ice Bucket 6*33.5cl                        16.25");

        return beers;
    }
}