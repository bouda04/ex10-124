package ex124;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rnd = new Random();
		Data d1 = new Data(5,7);
		for (int i =0; i< 5;i++) 
			for (int j =0; j< 7;j++)
				d1.setCell(i, j, rnd.nextDouble(100));
		System.out.println(d1);
		System.out.println(d1.diag(2, 0));

	}

}
