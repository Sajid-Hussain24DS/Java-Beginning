import Comparable_Interface.Car;
import Comparable_Interface.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSort {
     public static  void main(String[] args) {
          List<Integer> list = new ArrayList<>();

          // how to sort collection
          // we can use sort method of collection class to sort
          list.add(30);
          list.add(25);
          list.add(15);
          list.add(5);
          Collections.reverse(list);
          System.out.println("Reverse list: " + list);

          Collections.sort(list);
          System.out.println("Sort Collection: " + list);
          List<String> strings = new ArrayList<>();
          strings.add("Mohammad");
          strings.add("Sajid");
          strings.add("Hasseb");
          strings.add("Ali");
          Collections.sort(strings);
          System.out.println("String Sort" + strings);

          // Object sort
          List<Car> cars = new ArrayList<>();
          Car c1 = new Car();
          c1.setId(133);
          c1.setName("Jeep");

          Car c2 = new Car();
          c2.setId(125);
          c2.setName("Corrola");

          Car c3 = new Car();
          c3.setId(154);
          c3.setName("Mustang");

          cars.add(c1);
          cars.add(c2);
          cars.add(c3);

          System.out.println(cars);
          Collections.sort(cars);
          System.out.println(cars);
          Comparable<Car> sortCar = new Comparable<Car>(){
               @Override
               public int compareTo(Car o){
                    return 0;
               }
          };

          List<Game> games = new ArrayList<>();
          Game game1= new Game();
          game1.setTitle("Pubg");
          game1.setRating(10.0);
          game1.setReleaseDate(2019);

          Game game2= new Game();
          game2.setTitle("The Witcher 3");
          game2.setRating(9.5);
          game2.setReleaseDate(2010);


          Game game3= new Game();
          game3.setTitle("CyberPunk");
          game3.setRating(9.8);
          game3.setReleaseDate(2015);


          games.add(game1);
          games.add(game2);
          games.add(game3);

          System.out.println("Games List>>>>>>>>>>>>>>");
          System.out.println(games);
          Collections.sort(games);
          System.out.println("Sorted Game List");
          System.out.println(games);
          Comparable<Game> sortGame = new Comparable<Game>(){
               @Override
               public int compareTo(Game o) {
                    return 0;
               }


          };

     }
}
