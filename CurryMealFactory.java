public class CurryMealFactory implements MealFactory{

    @Override
    public Drink makeDrink() {
        return new Lassi();
    }

    @Override
    public MainCourse makeMainCourse() {
        return new CurryRice();
    }

    @Override
    public Dessert makeDessert() {
        return new Jelebi();
    }
}
