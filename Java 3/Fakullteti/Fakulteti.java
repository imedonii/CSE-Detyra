public class Fakulteti{
   private String drejtimi;
   Mesimdhenesi[] mesimdhenesit;
   int index;

   //constructor
   public Fakulteti(String drejtimi, int size){
      this.drejtimi = drejtimi;
      mesimdhenesit = new Mesimdhenesi[size];
   }

   // ekziston method-----------------------
   public boolean ekziston(Mesimdhenesi m){
      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i].equals(m)) {
            return true;
         }
      }
      return false;
   }
   //----------------------------------------


   // shtoMesimdhenesin method ----------------------------------------------
   public void shtoMesimdhenesin(Mesimdhenesi m){
      if (m == null) {
         System.out.println("ERROR: Mesimdhenesi nuk eshte incializuar !");
         return;
      }

      if (ekziston(m)) {
         System.out.println("ERROR: Mesimdhenesi ekziston !");
         return;
      }

      if (index >= mesimdhenesit.length) {
         System.out.println("ERROR: Nuk ka vend ne varg !");
         return;
      }

      mesimdhenesit[index++] = m;
   }
   //----------------------------------------------------------------------


   // thirrjaMeEVjeter method --------------------------------------------------
   public Profesori thirrjaMeEVjeter(String thirrjaAkademike){

      Profesori meIVjeter = null;
      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i] instanceof Profesori) {
            Profesori aktual = (Profesori) mesimdhenesit[i];
            if (aktual.getThirrjaAkademike().equals(thirrjaAkademike)) {
               if (meIVjeter == null || aktual.getVitiLindjes() < meIVjeter.getVitiLindjes()) {
                  meIVjeter = aktual;
               }
            }
         }
      }

      return meIVjeter;
   }
   //---------------------------------------------------------------------------


   //shtypMentoret method -----------------------------------------------
   public void shtypMentoret(boolean b){
      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i].mentoron() == b) {
            System.out.println(mesimdhenesit[i].toString());
         }
      }
   }
   //-------------------------------------------------------------------

   //main method
   public static void main(String[] args) {
      Fakulteti f = new Fakulteti("Shkenca Kompjuterike", 15);

      f.shtoMesimdhenesin(new Profesori("Edon Abdullahu", 1990, "Rregullt"));
      f.shtoMesimdhenesin(new Profesori("Lorent Kosumi", 1987, "Asistent"));
      f.shtoMesimdhenesin(new Profesori("Samir Vllaqko", 1994, "Asocuar"));
      f.shtoMesimdhenesin(new Asistenti("Filan1 Fisteku1", 1998, "Laboratoriket"));
      f.shtoMesimdhenesin(new Asistenti("Filan2 Fisteku2", 1999, "Numerike"));
      f.shtoMesimdhenesin(new Asistenti("Filan3 Fisteku3", 2000, "Kompjutera"));

      System.out.println();
      Profesori m = new Profesori("Edon Abdullahu", 1990, "Rregullt");
      if (f.ekziston(m)) {
         System.out.println("Profesori ekziston.");
      }else{
         f.shtoMesimdhenesin(m);
         System.out.println("Mesimdhenesi u shtua ne varg !");
      }

      System.out.println();
      System.out.println("Profesori me i vjeter:");
      System.out.println(f.thirrjaMeEVjeter("Rregullt"));

      System.out.println();
      f.shtypMentoret(true);

   }
}
