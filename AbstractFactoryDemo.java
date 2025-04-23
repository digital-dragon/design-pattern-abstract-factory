public class AbstractFactoryDemo {
    public static void main(String[] args) {

        System.out.println("Make curry meal!");
        MealFactory curryMealFactory = new CurryMealFactory();
        Drink lassi = curryMealFactory.makeDrink();
        MainCourse curryRice = curryMealFactory.makeMainCourse();
        Dessert jelebi =  curryMealFactory.makeDessert();
        lassi.quenchThirst();
        curryRice.satiate();
        jelebi.giveSugarHigh();
        System.out.println("curry meal done!");  
        
        System.out.println("Make Burger meal!");
        MealFactory burgerMealFactory = new BurgerMealFactory();
        Drink cola = burgerMealFactory.makeDrink();
        MainCourse burger = burgerMealFactory.makeMainCourse();
        Dessert pie =  burgerMealFactory.makeDessert();
        cola.quenchThirst();
        burger.satiate();
        pie.giveSugarHigh();
        System.out.println("Burger meal done!"); 

        System.out.println("Make curry wurst meal!");
        MealFactory curryWurstMealFactory = new CurryWurstMealFactory();
        Drink lager = curryWurstMealFactory.makeDrink();
        MainCourse curryWurstMeal = curryWurstMealFactory.makeMainCourse();
        Dessert apfelStrudel =  curryWurstMealFactory.makeDessert();
        lager.quenchThirst();
        curryWurstMeal.satiate();
        apfelStrudel.giveSugarHigh();
        System.out.println("Curry wurst meal done!"); 
    }
}
