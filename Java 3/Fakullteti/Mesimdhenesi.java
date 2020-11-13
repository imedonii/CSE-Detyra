public abstract class Mesimdhenesi{
   private String emri; //readonly
   private int vitiLindjes;
   private String angazhimi;

   //constructor
   public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi){
      this.emri = emri;
      this.vitiLindjes = vitiLindjes;
      this.angazhimi = angazhimi;
   }

   //get method ----------------------------------------------------
   public String getEmri(){
      return emri;
   }

   public int getVitiLindjes(){
      return vitiLindjes;
   }

   public String getAngazhimi(){
      return angazhimi;
   }
   //---------------------------------------------------------------


   //set method-----------------------------------------------------
   public void setVitiLindejs(int vitiLindjes){
      this.vitiLindjes = vitiLindjes;
   }

   public void setAngazhimi(String angazhimi){
      this.angazhimi = angazhimi;
   }
   //----------------------------------------------------------------

   //mentoron abstract method
   public abstract boolean mentoron();

   //toString method
   public String toString(){
      return emri + " : " + vitiLindjes + " mban " + angazhimi;
   }

   // equals method for Object
   public boolean equals(Object obj){
      if (obj instanceof Mesimdhenesi) {
         Mesimdhenesi m = (Mesimdhenesi)obj;
         return m.getEmri().equals(emri) && m.getVitiLindjes() == vitiLindjes; // return true : false
      }
      return false;
   }
}
