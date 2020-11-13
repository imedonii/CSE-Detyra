public class Profesori extends Mesimdhenesi{
   private String thirrjaAkademike;

   Profesori(String emri, int vitiLindjes, boolean iRregullt, String thirrjaAkademike){
      super(emri, vitiLindjes, iRregullt, "Ligjerata");
      this.thirrjaAkademike = thirrjaAkademike;
   }

   public boolean mentoron(){
      return true;
   }

   //get method
   public String getThirrjaAkademike(){
      return thirrjaAkademike;
   }

   //set method
   public void setThirrjaAkademike(String thirrjaAkademike){
      this.thirrjaAkademike = thirrjaAkademike;
   }

   public String toString(){
      return "Profesori" + super.toString() + ", ka thirrje " + thirrjaAkademike;
   }
}
