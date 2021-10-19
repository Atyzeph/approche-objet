package testEnumeration;

public enum Season {

	PRINTEMPS(1, "Printemps"),
	ETE(2, "Été"),
	AUTOMNE(3, "Automne"),
	HIVER(4, "Hiver");
	
	private String name;
	private int order;

	private Season(int order, String name) {
		this.name = name;
		this.order = order;
	}

	public Season libelle(String a) {
		
		Season[] seasons = Season.values();
		
		for (Season i : seasons) {
			
			if (i.getName().equals(a)) {
				System.out.println(i.getName());
				return i;
			}
		}
		return null;
	}
	
	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
