import java.util.Random;

public class d20 {

	Random random = new Random(20);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 20) + 1;
		currentValue=value;
	}
}