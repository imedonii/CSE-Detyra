public class Asistenti extends Mesimdhenesi{
	private String llojiUshtrimeve;
 
	//constructor
	public Asistenti(String emri, int vitiLindjes, String llojiUshtrimeve){
	   super(emri, vitiLindjes, "Ushtrime");
	   this.llojiUshtrimeve = llojiUshtrimeve;
	}
 
	//get method
	public String getLlojiUshtrimeve(){
	   return llojiUshtrimeve;
	}
 
	//set method
	public void setLlojiUshtrimeve(String llojiUshtrimeve){
	   this.llojiUshtrimeve = llojiUshtrimeve;
	}
 
	//mentoron punime diplome
	@Override
	public boolean mentoron(){
	   return false;
	}
 
	//toString()
	@Override
	public String toString(){
	   return "Asistent: " + super.toString() + " " + llojiUshtrimeve;
	}
 }
 