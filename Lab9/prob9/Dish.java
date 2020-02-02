package prob9;
import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    // A:  Is there any Vegetarian meal available ( return type boolean)	 
    private static final BooleanSupplier query1 = () -> menu.stream()
    		.anyMatch(d -> d.isVegetarian()); 
    
    //B: Is there any healthy menu have calories less than 1000 ( return type boolean)
    private static final BooleanSupplier query2 = () -> menu.stream()
    		.anyMatch(d -> d.getCalories() < 1000);
    //C: Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    private static final BooleanSupplier query3 = () -> menu.stream()
    		.filter(d -> !d.isVegetarian())
    		.anyMatch(d -> d.getCalories() > 1000);
    
    //D: find and return the first item for the type of MEAT( return type Optional<Dish>)
    private static final StrFunction<Optional<Dish>> query4 = () -> menu.stream()
    		.filter(d -> d.getType().equals(d.type.MEAT))
    		.findFirst();
    //E: calculateTotalCalories() in the menu using reduce. (return int)
    private static final IntSupplier query5 = () -> menu.stream()
    		.map(d -> d.getCalories())
    		.reduce(0, (x,y)->x+y);
    
    //F: calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    private static final IntSupplier query6 = () -> menu.stream()
    		.map(Dish::getCalories)
    		.reduce(0, (x,y)->x+y);
    
   //E:  Implement a main method to test
   public static void main(String[] args) {
	          
	    System.out.println("A: Is there any Vegetarian meal available: " + query1.getAsBoolean());
	    
	    System.out.println("B: Is there any healthy menu have calories less than 1000: " + query2.getAsBoolean());
	    
	    System.out.println("C: Is there any unhealthy menu have calories greater than 1000: " + query3.getAsBoolean());
	    	    
	    System.out.println("D: find and return the first item for the type of MEAT: " + query4.apply());	    
	   
	    System.out.println("E: calculateTotalCalories() in the menu using reduce: " + query5.getAsInt());
	    	    
	    System.out.println("F: calculateTotalCaloriesMethodReference()in the menu using MethodReferences: " + query6.getAsInt());	   
   }
    
}