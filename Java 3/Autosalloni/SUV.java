public class SUV extends Automjeti{
   private boolean eshte4x4;

   //constructor
   public SUV(String nrShasise, String prodhuesi, int vitiProdhimit, boolean eshte4x4){
      super(nrShasise, prodhuesi, vitiProdhimit);
      this.eshte4x4 = eshte4x4;
   }

   // eshteAutomatik method
   public boolean eshteAutomatik(){
      return false;
   }

   //get method
   public boolean getEshte4x4(){
      return eshte4x4;
   }

   //set method
   public void setEshte4x4(boolean eshte4x4){
      this.eshte4x4 = eshte4x4;
   }

   //toString method
   @Override
   public String toString(){
      return "SUV " + super.toString() + " : " + (getEshte4x4() ? " " : " nuk ") + " eshte 4x4.";
   }
}
