public  abstract class Drink {
    protected ServeMethod serveMethod;

    public Drink(ServeMethod serveMethod) {
        this.serveMethod = serveMethod;
    }
    public abstract void prepare();
}
