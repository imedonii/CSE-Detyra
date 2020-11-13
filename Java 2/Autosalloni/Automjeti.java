public class Automjeti{
   String nrShasise; //read only
   String prodhuesi;
   int vitiProdhimit;

   //constructor
   public Automjeti(String nrShasise, String prodhuesi, int vitiProdhimit){
      this.nrShasise = nrShasise;
      this.prodhuesi = prodhuesi;
      this.vitiProdhimit = vitiProdhimit;
   }

   //get ------------------------
   public String getNrShasis(){
      return nrShasise;
   }

   public String getProdhuesi(){
      return prodhuesi;
   }

   public int getVitiProdhimit(){
      return vitiProdhimit;
   }
   //------------------------------


   // set ------------------------------------------------
   public void setProdhuesi(String prodhuesi){
      this.prodhuesi = prodhuesi;
   }

   public void setVitiProdhimit(int vitiProdhimit){
      this.vitiProdhimit = vitiProdhimit;
   }

   //-----------------------------------------------------

   //toString
   public String toString(){
      return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
   }

   // equals method for Object
   public boolean equals(Object obj){
      if (obj instanceof Automjeti) {
         Automjeti a = (Automjeti) obj;
         return nrShasise == a.getNrShasis();
      }
      return false;
   }
}
