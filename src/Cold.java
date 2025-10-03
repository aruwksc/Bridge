public class Cold implements ServeMethod {
    @Override
    public void serve(String drinkName) {
        System.out.println("Cold drink " + drinkName);
    }
}
