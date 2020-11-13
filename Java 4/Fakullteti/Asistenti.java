public class Asistenti extends Mesimdhenesi{
   private String llojiUshtimreve;

   Asistenti(String emri, int vitiLindjes, boolean iRregullt, String llojiUshtimreve){
      super(emri, vitiLindjes, iRregullt, "Ushtrime");
      this.llojiUshtimreve = llojiUshtimreve;
   }

   public boolean mentoron(){
      return false;
   }

   //get method
   public String getLlojiUshtimreve(){
      return llojiUshtimreve;
   }

   //set method
   public void setLlojiUshtimreve(String llojiUshtimreve){
      this.llojiUshtimreve = llojiUshtimreve;
   }

   public String toString(){
      return "Asistenti " + super.toString() + " " + llojiUshtimreve;
   }
}
