public class Coffee extends Drink {
    public Coffee( ServeMethod serveMethod ) {
        super(serveMethod);
    }
    @Override
    public void prepare() {
        System.out.println("Coffee prepare");
        serveMethod.serve("Coffee");
    }
}
