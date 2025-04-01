package Toppings;

import PizzaTypes.Pizza;

public class ExtraCheese implements PizzaTopping{

    Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public Double cost() {
        return pizza.cost()+30.0;
    }
}
