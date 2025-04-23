public class BurgerMealFactory implements MealFactory{
    @Override
    public Drink makeDrink() {
        return new Cola();
    }

    @Override
    public MainCourse makeMainCourse() {
        return new Burger();
    }

    @Override
    public Dessert makeDessert() {
        return new Pie();
    }
    
}
