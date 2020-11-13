public class Asistenti extends Mesimdhenesi{

   String llojiUshtimreve;

   public Asistenti(String emri,int vitiLindjes, String llojiUshtimreve){
      super(emri,vitiLindjes,"Ushtrime");
      this.llojiUshtimreve = llojiUshtimreve;
   }

   //set
   public void setLlojiUshtrimeve(String llojiUshtimreve){
      this.llojiUshtimreve = llojiUshtimreve;
   }

   //get
   public String getLlojiUshtrimeve(){
      return llojiUshtimreve;
   }

   // toString method
   @Override
   public String toString(){
      return "Asistenti" + super.toString() +" "+ llojiUshtimreve;
   }
}
