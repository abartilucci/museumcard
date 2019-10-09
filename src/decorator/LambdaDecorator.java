package decorator;
import java.util.function.*;

public class LambdaDecorator {

	public static Function <Double, Double> summer =  (cost) -> cost * 0.80;	
	public static ToDoubleBiFunction<Double, Double> perc = (cost, percentage) -> cost * ( 1-percentage);
	public static ToDoubleBiFunction<Double, Double> absolute = (cost, sale) -> cost - sale;



}