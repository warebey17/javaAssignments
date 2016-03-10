import java.util.Random;

public class d12 {

	Random random = new Random(12);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 12) + 1;
		currentValue=value;
	}
}
