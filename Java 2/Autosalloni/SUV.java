public class SUV extends Automjeti{
   boolean eshte4x4;

   //constructor
   public SUV(String nrShasise, String prodhuesi, int vitiProdhimit, boolean eshte4x4){
      super(nrShasise, prodhuesi, vitiProdhimit);
      this.eshte4x4 = eshte4x4;
   }

   //get
   public boolean getEshte4x4(){
      return eshte4x4;
   }

   //set
   public void setEshte4x4(boolean eshte4x4){
      this.eshte4x4 = eshte4x4;
   }

   //toString
   @Override
   public String toString(){
      return "SUV " + super.toString() + " : " + (eshte4x4 ? "" : " nuk ") + " eshte 4x4";
   }
}
