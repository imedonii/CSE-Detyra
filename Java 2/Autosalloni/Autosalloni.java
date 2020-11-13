public class Autosalloni{
   String emri;
   Automjeti[] veturat;
   int index;

   //constructor
   public Autosalloni(String emri, int size){
      this.emri = emri;
      veturat = new Automjeti[size];
   }

   // metoda ekziston
   public boolean ekziston(Automjeti m){
      for (int i = 0; i < index; i++) {
         if (veturat[i].equals(m)) {
            return true;
         }
      }
      return false;
   }

   // metoda per shtimin e automjetit
   public void shtoAutomjetin(Automjeti m){
      if (m == null) {
         System.out.println("Nuk ka mesimdhenes ne parameter !");
         return;
      }

      if (index >= veturat.length) {
         System.out.println("Nuk ka vend !");
         return;
      }

      if (ekziston(m)) {
         System.out.println("Ekziston !");
         return;
      }

      veturat[index++] = m;
   }

   // metoda per llojin e ngjyres
   public void shtypNgjyren(String ngjyra){

      for (int i = 0; i < index; i++) {
         if (veturat[i] instanceof Limuzina) {
            Limuzina a = (Limuzina) veturat[i];
            if (a.getNgjyra().equals(ngjyra)) {
               System.out.println(a.toString());
            }
         }
      }
   }

   // metoda per SUV me te ri
   public SUV SUVmeIVjeter(){
      SUV p = null;
      for (int i = 0; i < index; i++) {
         if (veturat[i] instanceof SUV) {
            SUV p1 = (SUV) veturat[i];
            if (p == null || p1.getVitiProdhimit() < p.getVitiProdhimit()) {
               p = p1;
            }
         }
      }
      return p;
   }

   public static void main(String[] args) {
      Autosalloni a = new Autosalloni("Salloni ABC", 50);

      a.shtoAutomjetin(new Automjeti("A12DDEE4S", "Audi", 2009));
      a.shtoAutomjetin(new Automjeti("A12DDD44S", "BMW", 2016));
      a.shtoAutomjetin(new Limuzina("A1A0DD4DS", "BENZ", 2017, "Bardh"));
      a.shtoAutomjetin(new Limuzina("PPASQW4DS", "Audi", 2019, "Kuq"));
      a.shtoAutomjetin(new SUV("PPALLA4DS", "Ferrari", 2019, false));
      a.shtoAutomjetin(new SUV("LQQPQW4DS", "Lambo", 2020, true));

      Automjeti a1 = new Automjeti("A12DDEE4S", "Audi", 2009);

      System.out.println();
      if (a.ekziston(a1)) {
         System.out.println("Vetura ekziston !");
      }else{
         a.shtoAutomjetin(a1);
         System.out.println("Vetura u shtua me sukses !");
      }

      System.out.println();
      System.out.println("SUV me i vjeter: " + a.SUVmeIVjeter());

      System.out.println();
      a.shtypNgjyren("Kuq");
   }
}
