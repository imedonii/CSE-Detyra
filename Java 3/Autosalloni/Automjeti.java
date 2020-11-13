public abstract class Automjeti{
   private String nrShasise; //readonly
   private String prodhuesi;
   private int vitiProdhimit;

   //constructor
   public Automjeti(String nrShasise, String prodhuesi, int vitiProdhimit){
      this.nrShasise = nrShasise;
      this.prodhuesi = prodhuesi;
      this.vitiProdhimit = vitiProdhimit;
   }

   //get method ----------------------------------------------------
   public String getNrShasise(){
      return nrShasise;
   }

   public String getProdhuesi(){
      return prodhuesi;
   }

   public int getVitiProdhimit(){
      return vitiProdhimit;
   }
   //---------------------------------------------------------------


   //set method-----------------------------------------------------
   public void setProdhuesi(String prodhuesi){
      this.prodhuesi = prodhuesi;
   }

   public void setVitiProdhimit(int vitiProdhimit){
      this.vitiProdhimit = vitiProdhimit;
   }
   //----------------------------------------------------------------

   //eshteAutomatik abstract method
   public abstract boolean eshteAutomatik();

   //toString method
   public String toString(){
      return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
   }

   // equals method for Object
   public boolean equals(Object obj){
      if (obj instanceof Automjeti) {
         Automjeti a = (Automjeti)obj;
         return a.getNrShasise().equals(nrShasise); // return true : false
      }
      return false;
   }
}
