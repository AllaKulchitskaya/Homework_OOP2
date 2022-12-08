public class Bouquet {
    private final Flower[] bouquet;

    public Bouquet(Flower[] bouquet) {
        this.bouquet = bouquet;
    }

    public void calculateBouquetCost() {
        double bouquetCost = 0;
        for (Flower flower:bouquet) {
            bouquetCost += flower.getCost();
        }
        bouquetCost = bouquetCost * 1.1;
        System.out.printf("Стоимость букета - %.2f рублей%n", bouquetCost);
    }

    public int findBouquetLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower:bouquet) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
}
