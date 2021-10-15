package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println(liste);
		System.out.println(liste.size());
		
		int minIndex = 0;
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i) > liste.get(i-1)) {
				System.out.println("L\'élément le plus grand est : " + liste.get(i));
			}
			if (liste.get(i) < 0) {
				liste.set(i, Math.abs(i));
			}
			if (liste.get(i) < liste.get(minIndex)) {
				minIndex = i;
			}
		}
		
		liste.remove(minIndex);
		System.out.println(liste);
	}

}
