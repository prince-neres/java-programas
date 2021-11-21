public class Casa extends Imovel{
	private double areaTotal;

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	
	public String toString(){
	    return "Casa" + "\n" + 
		"Tamanho: " + getTamanho() + "m2" + "\n" + 
		"Local: " + getLocal() + "\n" + 
		"Area total: " + getAreaTotal() + " m2";
	    
	}
}
