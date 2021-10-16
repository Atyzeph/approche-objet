package recensement;

public class Ville {

	private String codeReg;
	private String nomReg;
	private String codeDep;
	private String codeCom;
	private String nomCom;
	private String popTT;
	
	public Ville(String codeReg, String nomReg, String codeDep, String codeCom, String nomCom, String popTT) {
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
	public String getPopTT() {
		return popTT;
	}
	public void setPopTT(String popTT) {
		this.popTT = popTT;
	}
	
	
}
