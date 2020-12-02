public abstract class Automjeti{
	private int nrShasise;//readonly
	private String prodhuesi;
	private short vitiProdhimit;
	
	public Automjeti(int nrShasise,String prodhuesi,short vitiProdhimit){
		this.nrShasise=nrShasise;
		this.prodhuesi=prodhuesi;
		this.vitiProdhimit=vitiProdhimit;
	}
	
	public abstract boolean eshteAutomatik();
	
	public int getNrShasise(){
		return nrShasise;
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
		return nrShasise+" : "+prodhuesi+" : "+vitiProdhimit;
	}
	public boolean equals(Object obj){
		if(obj instanceof Automjeti){
			Automjeti a=(Automjeti)obj;
			return a.getNrShasise()==nrShasise;
		}
		return false;
	}
	
	
	
}