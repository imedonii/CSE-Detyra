public class Profesori extends Mesimdhenesi{
   private String thirrjaAkademike;

   //constructor
   public Profesori(String emri, int vitiLindjes, String thirrjaAkademike){
      super(emri, vitiLindjes, "Ligjerata");
      this.thirrjaAkademike = thirrjaAkademike;
   }

   // mentoron method
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

   //toString method
   @Override
   public String toString(){
      return "Profesori " + super.toString() + ", ka thirrje akademike: " + thirrjaAkademike;
   }
}
