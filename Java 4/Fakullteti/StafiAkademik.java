public abstract class StafiAkademik{
   private String emri; //readonly
   private int vitiLindjes;
   private boolean iRregullt;

   StafiAkademik(String emri, int vitiLindjes, boolean iRregullt){
      this.emri = emri;
      this.vitiLindjes = vitiLindjes;
      this.iRregullt = iRregullt;
   }

   //get method
   public String getEmri(){
      return emri;
   }

   public int getVitiLindjes(){
      return vitiLindjes;
   }

   public boolean getIRregullt(){
      return iRregullt;
   }

   //set method
   public void setVitiLindjes(int vitiLindjes){
      this.vitiLindjes = vitiLindjes;
   }

   public void setIRregullt(boolean iRregullt){
      this.iRregullt = iRregullt;
   }

   public String toString(){
      return emri + " : " + vitiLindjes + " staf " + (iRregullt ? " " : " jo ") + " rregullt";
   }

   public boolean equals(Object obj){
      if (obj instanceof StafiAkademik) {
         StafiAkademik s = (StafiAkademik) obj;
         return emri.equals(s.getEmri()) && vitiLindjes == s.getVitiLindjes();
      }
      return false;
   }

}
