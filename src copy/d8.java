import java.util.Random;

public class d8 {

	Random random = new Random(8);
	int currentValue;
	
	public void total(){
		int value;
		value = (int) Math.floor(Math.random() * 8) + 1;
		currentValue=value;
	}
}
