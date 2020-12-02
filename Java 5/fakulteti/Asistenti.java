public class Asistenti extends Mesimdhenesi{
	private String llojiUshtrimeve;
	
	public Asistenti(String emri,short vitiLindjes,String angazhimi,String llojiUshtrimeve){
		super(emri,vitiLindjes,"Ushtrime");
		this.llojiUshtrimeve=llojiUshtrimeve;
	}
	public boolean mentoron(){
		return false;
	}
	public String getLlojiUshtrimeve(){
		return llojiUshtrimeve;
	}
	public void getLlojiUshtrimeve(String llojiUshtrimeve){
		this.llojiUshtrimeve=llojiUshtrimeve;
	}
	public String toString(){
		return "Asistenti "+super.toString()+" "+llojiUshtrimeve;
	}
}