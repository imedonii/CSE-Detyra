public class Asistenti extends Mesimdhenesi{
   private String llojiUshtrimeve;

   //constructor
   public Asistenti(String emri, int vitiLindjes, String llojiUshtrimeve){
      super(emri, vitiLindjes, "Ushtrime");
      this.llojiUshtrimeve = llojiUshtrimeve;
   }
   
   // mentoron method
   public boolean mentoron(){
      return false;
   }

   //get method
   public String getLlojiUshtrimeve(){
      return llojiUshtrimeve;
   }

   //set method
   public void setLlojiUshtrimeve(String llojiUshtrimeve){
      this.llojiUshtrimeve = llojiUshtrimeve;
   }

   //toString method
   @Override
   public String toString(){
      return "Asistenti " + super.toString() + " " + llojiUshtrimeve;
   }
}
