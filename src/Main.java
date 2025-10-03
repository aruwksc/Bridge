public class Main {
    public static void main(String[] args) {
        Drink hotCoffee = new Coffee(new Hot());
        hotCoffee.prepare();
        System.out.println();

        Drink hotTea = new Tea(new Hot());
        hotTea.prepare();
        System.out.println();

        Drink coldCoffee = new Coffee(new Cold());
        coldCoffee.prepare();
        System.out.println();

        Drink coldTea = new Tea(new Cold());
        coldTea.prepare();
        System.out.println();
    }
}