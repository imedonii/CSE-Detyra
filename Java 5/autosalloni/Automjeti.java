public abstract class Automjeti{
	private int nrSasise;//readonly
	private String prodhuesi;
	private short vitiProdhimit;
	
	public Automjeti(int nrSasise,String prodhuesi,short vitiProdhimit){
		this.nrSasise=nrSasise;
		this.prodhuesi=prodhuesi;
		this.vitiProdhimit=vitiProdhimit;
	}
	
	public abstract boolean eshteAutomatik();
	
	public int getNrSasise(){
		return nrSasise;
	}
	public String getProdhuesi(){
		return prodhuesi;
	}
	public void setProdhuesi(String prodhuesi){
		this.prodhuesi=prodhuesi;
	}
	public short getVitiProdhimit(){
		return vitiProdhimit;
	}
	public void setVitiProdhimit(short vitiProdhimit){
		this.vitiProdhimit=vitiProdhimit;
	}
	public String toString(){
		return nrSasise+" : "+prodhuesi+" : "+vitiProdhimit;
	}
	public boolean equals(Object obj){
		if(obj instanceof Automjeti){
			Automjeti a=(Automjeti)obj;
			return a.getNrSasise()==nrSasise;
		}
		return false;
	}
	
	
	
}