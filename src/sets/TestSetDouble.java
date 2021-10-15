package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Double> test = new HashSet<Double>();
		test.add(1.5);
		test.add(8.25);
		test.add(-7.32);
		test.add(13.3);
		test.add(-12.45);
		test.add(48.5);
		test.add(0.01);
		
		System.out.println(test);
		
		double min = Double.MAX_VALUE;
		double max = 0;
		for (double val : test) {
			if (val > max) {
				max = val;
			}
			if (val < min) {
				min = val;
			}
		}
		
		test.remove(min);
		System.out.println("Le plus grand est : " + max);
		System.out.println(test);
	}
}
