class person {
    public String name;
    person(String n) {
        name = n;
    }
    @Override
    protected void finalize() {
        System.out.println(" garbage collection performed.");
    }
}
