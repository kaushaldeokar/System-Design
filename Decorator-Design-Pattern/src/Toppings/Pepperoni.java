package Toppings;

import PizzaTypes.Pizza;

public class Pepperoni implements PizzaTopping{

    Pizza pizza;

    public Pepperoni(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public Double cost() {
        return pizza.cost()+50.0;
    }
}
