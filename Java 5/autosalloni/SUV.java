public class SUV extends Automjeti{
	private boolean eshte4x4;
	 public SUV(int nrSasise,String prodhuesi,short vitiProdhimit,boolean eshte4x4){
		 super(nrSasise,prodhuesi,vitiProdhimit);
		 this.eshte4x4=eshte4x4;
	 }
	 public boolean eshteAutomatik(){
		return false;
	}
	public boolean getEshte4x4(){
		return eshte4x4;
	}
	public void setEshte4x4(boolean eshte4x4){
		 this.eshte4x4=eshte4x4;
	}
	public String toString(){
		return "SUV "+super.toString()+":"+(eshte4x4?"":"nuk")+" eshte4x4";
	}
		
}