public abstract class Mesimdhenesi{
	private String emri;//readonly
	private short vitiLindjes;
	private String angazhimi;
	
	public Mesimdhenesi(String emri,short vitiLindjes,String angazhimi){
		this.emri=emri;
		this.vitiLindjes=vitiLindjes;
		this.angazhimi=angazhimi;
	}
	public String getEmri(){
		return emri;
	}
	public short getVitiLindjes(){
		return vitiLindjes;
	}
	public String getAngazhimi(){
		return angazhimi;
	}
	public void setVitiLindjes(short vitiLindjes){
		this.vitiLindjes=vitiLindjes;
	}
	public void setAngazhimi(String angazhimi){
		this.angazhimi=angazhimi;
	}
	public abstract boolean mentoron();
	public String toString(){
		return emri+" : "+vitiLindjes+" angazhohet ne "+angazhimi;
	}
	public boolean equals(Object obj){
		if(obj instanceof Mesimdhenesi){
			Mesimdhenesi m=(Mesimdhenesi)obj;
			return m.getEmri().equals(emri) && m.getVitiLindjes()==vitiLindjes;
		}
		return false;
	}
		
	
	
}
