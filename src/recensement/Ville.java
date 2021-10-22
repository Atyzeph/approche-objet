package recensement;

public class Ville implements Comparable<Ville>{

	private String codeReg;
	private String nomReg;
	private String codeDep;
	private String codeCom;
	private String nomCom;
	private int popTT;
	
	public Ville(String codeReg, String nomReg, String codeDep, String codeCom, String nomCom, int popTT) {
		super();
		this.codeReg = codeReg;
		this.nomReg = nomReg;
		this.codeDep = codeDep;
		this.codeCom = codeCom;
		this.nomCom = nomCom;
		this.popTT = popTT;
	}
	
	@Override
	public String toString() {
		return "Code de région : " + codeReg + "\n" + "Nom de région : " + nomReg + "\n" + "Code départemental : " + codeDep + "\n" +"Code de commune : " + codeCom
				+ "\n" + "Nom de la commune : " + nomCom + "\n" + "Population totale : " + popTT + "\n";
	}
	
	public int compareTo(Ville obj) {
		if (getPopTT() > obj.getPopTT()) {
			return 1;
		}
		if (getPopTT() < obj.getPopTT()) {
			return -1;
		}
		
		return 0;
	}

	public String getCodeReg() {
		return codeReg;
	}
	public void setCodeReg(String codeReg) {
		this.codeReg = codeReg;
	}
	public String getNomReg() {
		return nomReg;
	}
	public void setNomReg(String nomReg) {
		this.nomReg = nomReg;
	}
	public String getCodeDep() {
		return codeDep;
	}
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}
	public String getCodeCom() {
		return codeCom;
	}
	public void setCodeCom(String codeCom) {
		this.codeCom = codeCom;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public int getPopTT() {
		return popTT;
	}
	public void setPopTT(int popTT) {
		this.popTT = popTT;
	}
	
	
}
