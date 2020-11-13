public class Autosalloni{
   private String emri;
   Automjeti[] veturat;
   int index;

   //constructor
   public Autosalloni(String emri, int size){
      this.emri = emri;
      veturat = new Automjeti[size];
   }

   // ekziston method-----------------------
   public boolean ekziston(Automjeti a){
      for (int i = 0; i < index; i++) {
         if (veturat[i].equals(a)) {
            return true;
         }
      }
      return false;
   }
   //----------------------------------------


   // shtoAutomjetin method ----------------------------------------------
   public void shtoAutomjetin(Automjeti a){
      if (a == null) {
         System.out.println("ERROR: Mesimdhenesi nuk eshte incializuar !");
         return;
      }

      if (ekziston(a)) {
         System.out.println("ERROR: Mesimdhenesi ekziston !");
         return;
      }

      if (index >= veturat.length) {
         System.out.println("ERROR: Nuk ka vend ne varg !");
         return;
      }

      veturat[index++] = a;
   }
   //----------------------------------------------------------------------


   // shtypSUVProdhuesi method --------------------------------------------------
   public void shtypSUVProdhuesi(String prodhuesi){
      for (int i = 0; i < index; i++) {
         if (veturat[i] instanceof SUV) {
            SUV s = (SUV) veturat[i];
            if (s.getProdhuesi().equals(prodhuesi)) {
               System.out.println(s.toString());
            }
         }
      }
   }
   //---------------------------------------------------------------------------

   // shtypLimuzinaViti method --------------------------------------------------
   public void shtypLimuzinaViti(int vitiProdhimit){
      for (int i = 0; i < index; i++) {
         if (veturat[i] instanceof Limuzina) {
            Limuzina l = (Limuzina) veturat[i];
            if (l.getVitiProdhimit() == vitiProdhimit) {
               System.out.println(l.toString());
            }
         }
      }
   }
   //---------------------------------------------------------------------------

   //shtypMentoret method -----------------------------------------------
   public Automjeti automatikuMeIRi(){
      Automjeti a = null;
      for (int i = 0; i < index; i++) {
         if (veturat[i].eshteAutomatik()) {
            if (a == null || a.getVitiProdhimit() < veturat[i].getVitiProdhimit()) {
               a = veturat[i];
            }
         }
      }
      return a;
   }
   //-------------------------------------------------------------------

   //main method
   public static void main(String[] args) {
      Autosalloni a = new Autosalloni("Salloni ABC", 50);

      a.shtoAutomjetin(new SUV("SUV1234", "BMW", 2010, true));
      a.shtoAutomjetin(new SUV("SUV5432", "AUDI", 2013, true));
      a.shtoAutomjetin(new SUV("SUV4567", "BENZ", 2011, false));
      a.shtoAutomjetin(new Limuzina("LMZ12345", "Lambo", 2017, "Bardh"));
      a.shtoAutomjetin(new Limuzina("LMZ81112", "Benz", 2019, "Kuq"));
      a.shtoAutomjetin(new Limuzina("LMZ12344", "BMW", 2020, "Zeze"));

      System.out.println();
      SUV s = new SUV("SUV1234", "BMW", 2010, true);
      if (a.ekziston(s)) {
         System.out.println("Automejti ekziston.");
      }else{
         a.shtoAutomjetin(s);
         System.out.println("Automjeti u shtua ne varg !");
      }

      a.shtypSUVProdhuesi("BMW");
      a.shtypLimuzinaViti(2017);

      System.out.println();
      System.out.println("Automjeti me i ri:");
      System.out.println(a.automatikuMeIRi().toString());

   }
}
