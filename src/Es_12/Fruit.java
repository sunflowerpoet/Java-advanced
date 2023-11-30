package Es_12;

public class Fruit {
    String fruitName;

    public Fruit (String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                '}';
    }
}
