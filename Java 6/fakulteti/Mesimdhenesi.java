public abstract class Mesimdhenesi{

	private String emri; //read only
	private int vitiLindjes;
	private String angazhimi;
 
	public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi){
	   this.emri = emri;
	   this.vitiLindjes = vitiLindjes;
	   this.angazhimi = angazhimi;
	}
 
	//get method
	public String getEmri(){
	   return emri;
	}
 
	public int getVitiLindjes(){
	   return vitiLindjes;
	}
 
	public String getAngazhimin(){
	   return angazhimi;
	}
 
	//set method
	public void setVitiLindjes(int vitiLindjes){
	   this.vitiLindjes = vitiLindjes;
	}
 
	public void setAngazhimi(String angazhimi){
	   this.angazhimi = angazhimi;
	}
 
	//abstract
	public abstract boolean mentoron();
 
 
	//toString()
	public String toString(){
	   return emri + " : " + vitiLindjes + " angazhohet ne " + angazhimi;
	}
 
	//equals
	public boolean equals(Object obj){
	   if (obj instanceof Mesimdhenesi) {
		  Mesimdhenesi m = (Mesimdhenesi)obj;
		  return emri.equals(m.getEmri()) && vitiLindjes == m.getVitiLindjes();
	   }
	   return false;
	}
 }
 