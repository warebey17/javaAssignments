import java.util.Random;

public class d6 {

	Random random = new Random(6);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 6) + 1;
		currentValue=value;
	}
}