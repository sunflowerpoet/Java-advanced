package Es_15;

public record Punto (int x, int y) {
    @Override
    public String toString() {
        return "Punto { " +
                "x = " + x +
                ", y = " + y +
                " } ";
    }
}
