public class CurryWurstMealFactory implements MealFactory {
    @Override
    public Drink makeDrink() {
        return new LagerBeer();
    }

    @Override
    public MainCourse makeMainCourse() {
        return new CurryWurst();
    }

    @Override
    public Dessert makeDessert() {
        return new ApfelStrudel();
    }
}
