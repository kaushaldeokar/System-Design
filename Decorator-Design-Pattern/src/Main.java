import PizzaTypes.GreekPizza;
import PizzaTypes.Pizza;
import Toppings.ExtraCheese;
import Toppings.Pepperoni;

public class Main {
    public static void main(String[] args) {

        //Decorator Design Pattern Implementation//
        Pizza pizza = new GreekPizza();

        //add on
        pizza = new ExtraCheese(pizza);
        pizza = new Pepperoni(pizza);

        System.out.println("Your Pizza Cart total is : "+pizza.cost());

    }
}