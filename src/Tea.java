public class Tea extends Drink {
    public Tea(ServeMethod serveMethod) {
        super(serveMethod);
    }
    @Override
    public void prepare() {
        System.out.println("Tea prepare");
        serveMethod.serve("Tea");
    }
}
