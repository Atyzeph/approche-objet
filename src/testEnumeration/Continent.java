package testEnumeration;

public enum Continent {

	NORTH_AMERICA(1, "Amérique du nord"),
	EUROPE(2, "Europe"),
	ASIA(3, "Asie"),
	AFRICA(4, "Afrique"),
	SOUTH_AMERICA(5, "Amérique du sud");
	
	private String lib;
	private int order;
	
	private Continent( int order, String lib) {
		this.order = order;
		this.lib = lib;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	
}
