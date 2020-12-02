public class Limuzina extends Automjeti{
	private String ngjyra;
	
	public Limuzina(int nrSasise,String prodhuesi,short vitiProdhimit,String ngjyra){
		super(nrSasise,prodhuesi,vitiProdhimit);
		this.ngjyra=ngjyra;
	}
	public String getNgjyra(){
		return ngjyra;
	}
	public void setNgjyra(String ngjyra){
		this.ngjyra=ngjyra;
	}
	public boolean eshteAutomatik(){
		return true;
	}
	public String toString(){
		return super.toString()+":"+ngjyra;
	}
}