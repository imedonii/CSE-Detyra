public class Limuzina extends Automjeti{
   private String ngjyra;

   //constructor
   public Limuzina(String nrShasise, String prodhuesi, int vitiProdhimit, String ngjyra){
      super(nrShasise, prodhuesi, vitiProdhimit);
      this.ngjyra = ngjyra;
   }

   // eshteAutomatik method
   public boolean eshteAutomatik(){
      return true;
   }

   //get method
   public String getNgjyra(){
      return ngjyra;
   }

   //set method
   public void setNgjyra(String ngjyra){
      this.ngjyra = ngjyra;
   }

   //toString method
   @Override
   public String toString(){
      return "Limuzina " + super.toString() + " : " + ngjyra;
   }
}
