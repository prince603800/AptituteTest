package demo;
import java.util.Random;
public class RandomGenerator {
	static Random ran = new Random();
	public static int rangen(){
		int i = ran.nextInt(5);
		return i;
	}
}
