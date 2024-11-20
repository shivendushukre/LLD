public class Manager implements Employee{
    @Override
    public int salary() {
        return 600000;
    }

    @Override
    public String name() {
        return "Manager";
    }
}
