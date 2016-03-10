import java.util.Random;

public class d4 {

	Random random = new Random(4);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 4) + 1;
		currentValue=value;
	}
}
