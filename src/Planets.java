enum Planets {
    Earth("�����"),
    Moon("����");

    private final String Type;
    Planets(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}
