public class Mesimdhenesi{
   String emri;
   int vitiLindjes;
   String angazhimi;

   //constructor
   public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi){
      this.emri = emri;
      this.vitiLindjes = vitiLindjes;
      this.angazhimi = angazhimi;
   }

   //get -----------------------
   public String getEmri(){
      return emri;
   }

   public int getVitiLindjes(){
      return vitiLindjes;
   }

   public String getAngazhimi(){
      return angazhimi;
   }
   //-------------------------------

   //set -------------------------------------
   public void setVitilindejs(int vitiLindjes){
      this.vitiLindjes = vitiLindjes;
   }

   public void setAngazhimi(String angazhimi){
      this.angazhimi = angazhimi;
   }
   //--------------------------------------------

   // toString method
   public String toString(){
      return emri + " : " + vitiLindjes + " mban " + angazhimi;
   }

   // equals Object
   public boolean equals(Object obj){
      if (obj instanceof Mesimdhenesi) {
         Mesimdhenesi m = (Mesimdhenesi)obj;
         if (emri.equals(m.getEmri()) && vitiLindjes == m.getVitiLindjes()) {
            return true;
         }
      }
      return false;
   }
}
