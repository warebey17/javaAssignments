import java.util.Random;

public class field {
	static d4 four = new d4();
	static d6 six = new d6();
	static d8 eight = new d8();
	static d10 ten = new d10();
	static d12 twelve = new d12();
	static d20 twenty = new d20();
	
	public int diceTotal(){
		int value;
		four.total();
		six.total();
		eight.total();
		ten.total();
		twelve.total();
		twenty.total();
		value = four.currentValue + six.currentValue + eight.currentValue + ten.currentValue + twelve.currentValue + twenty.currentValue;
		System.out.println("You did" + value + "damage!");
		return value;
	}
}
