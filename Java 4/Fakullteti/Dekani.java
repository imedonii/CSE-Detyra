public class Dekani extends StafiAkademik{
   private String gradaAkademike;

   Dekani(String emri, int vitiLindjes, String gradaAkademike){
      super(emri, vitiLindjes, true);
      this.gradaAkademike = gradaAkademike;
   }

   //get method
   public String getGradaAkademike(){
      return gradaAkademike;
   }

   //set method
   public void setGradaAkademike(String gradaAkademike){
      this.gradaAkademike = gradaAkademike;
   }

   @Override
   public String toString(){
      return "Dekani " + gradaAkademike + " " + super.toString();
   }
}
