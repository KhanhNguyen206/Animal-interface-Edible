package Fruit;

import Edible.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat(){
        return "Could be juice";
    }
}
