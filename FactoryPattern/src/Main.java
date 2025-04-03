import java.util.HashMap;
import java.util.Map;

interface Car{

    default String drive(){
        return "drive";
    }

}

class Bmw implements Car{

    @Override
    public String drive(){
        return "bmw drive";
    }
}

class Tesla implements Car{
    @Override
    public String drive(){
        return "tesla drive";
    }
}


class Factory{

    public static HashMap<String,Car> carFactory = new HashMap<>();

    static {
        carFactory.put("bmw",new Bmw());
        carFactory.put("tesla",new Tesla());

    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(Factory.carFactory.get("tesla").drive());
        System.out.println(Factory.carFactory.get("bmw").drive());
    }
}