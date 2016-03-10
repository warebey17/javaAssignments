import java.util.Random;

public class d10 {

	Random random = new Random(10);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 10) + 1;
		currentValue=value;
	}
}