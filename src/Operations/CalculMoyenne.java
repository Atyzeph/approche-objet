package Operations;


public class CalculMoyenne {
	

	double[] tab = new double[0];

	
	public void ajout(double a) {
		double[] tabTmp = new double[tab.length+1];
		
		for (int i = 0; i < tab.length; i++) {
			tabTmp[i] = tab[i];
		}
		tabTmp[tabTmp.length-1] = a;
		tab = tabTmp;
	}
	
	
	public double calcul() {
		
		double moyenne = 0.0;
		for (int i = 0; i < tab.length; i++) {
			
			 moyenne += tab[i];
		}
		moyenne = moyenne/tab.length;
		return moyenne;
	}
	
	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
}
