public class Limuzina extends Automjeti{
   String ngjyra;

   //constructor
   public Limuzina(String nrShasise, String prodhuesi, int vitiProdhimit, String ngjyra){
      super(nrShasise, prodhuesi, vitiProdhimit);
      this.ngjyra = ngjyra;
   }

   //get
   public String getNgjyra(){
      return ngjyra;
   }

   //set
   public void setNgjyra(String ngjyra){
      this.ngjyra = ngjyra;
   }

   //toString
   @Override
   public String toString(){
      return "Limunzina " + super.toString() + " : " + ngjyra;
   }
}
