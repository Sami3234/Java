public class person {
        String name
    Person(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() {
        System.out.println(name + " is being garbage collected.");
    }

}
