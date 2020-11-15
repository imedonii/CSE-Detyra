public class Fakulteti{
   String drejtimi;
   private StafiAkademik[] stafi;
   private int index;

   Fakulteti(String drejtimi, int size){
      this.drejtimi = drejtimi;
      stafi = new StafiAkademik[size];
   }

   public boolean ekziston(StafiAkademik s){
      for (int i = 0; i < index; i++) {
         if (stafi[i].equals(s)) {
            return true;
         }
      }
      return false;
   }

   //-----------------------------------------------------------
   public void shtoStafin(StafiAkademik s){                   //
      if (s == null) {                                        //
         System.out.println("ERROR: Stafi eshte null !");     //
         return;                                              //
      }                                                       //
                                                              //
      if (ekziston(s)) {                                      //
         System.out.println("ERROR: Stafi ekziston !!");      //
         return;                                              //
      }                                                       //
                                                              //
      if (index >= stafi.length) {                            //
         System.out.println("ERROR: Nuk ka vend !!");         //
         return;                                              //
      }                                                       //
                                                              //
      stafi[index++] = s;                                     //
   }                                                          //
   //-----------------------------------------------------------

   public StafiAkademik stafiIRregulltMeIRi(boolean iRregullt){
      StafiAkademik s = null;

      for (int i = 0; i < index; i++) {
         if (stafi[i].getIRregullt() == iRregullt) {
            if (s == null || stafi[i].getVitiLindjes() > s.getVitiLindjes()) {
               s = stafi[i];
            }
         }
      }
      return s;
   }

   public Mesimdhenesi[] mentoretEVitit(boolean mentoron, int vitiLindjes){
      int count = 0;

      for (int i = 0; i < index; i++) {
         if (stafi[i] instanceof Mesimdhenesi) {
            Mesimdhenesi m = (Mesimdhenesi) stafi[i];
            if (m.mentoron() == mentoron) {
               if (m.getVitiLindjes() == vitiLindjes) {
                  count++;
               }
            }
         }
      }

      if (count == 0) {
         System.out.println("Nuk ka asnje mesimdhenes me keto parametra !");
         return null;
      }

      Mesimdhenesi[] mesimdhenesit = new Mesimdhenesi[count];
      int ind = 0;

      for (int i = 0; i < index; i++) {
         if (stafi[i] instanceof Mesimdhenesi) {
            Mesimdhenesi m = (Mesimdhenesi) stafi[i];
            if (m.mentoron() == mentoron) {
               if (m.getVitiLindjes() == vitiLindjes) {
                  mesimdhenesit[ind++] = m;
               }
            }
         }
      }

      return mesimdhenesit;
   }

   public static void main(String[] args) {
      Fakulteti f = new Fakulteti("Shkenca Kompjuterike", 15);

      f.shtoStafin(new Asistenti("Edon Abdullahu", 2001, true, "Laboratorike"));
      f.shtoStafin(new Asistenti("Samir Vllaqko", 2002, true, "Numerike"));
      f.shtoStafin(new Asistenti("Lorent Kosumi", 2000, false, "Laboratorike"));
      f.shtoStafin(new Asistenti("Ramiz Ismaili", 1999, false, "Numerike"));

      f.shtoStafin(new Profesori("Fjolla Ismaili", 1990, false, "Profesor i rregullt"));
      f.shtoStafin(new Profesori("Ermire Demaj", 1991, true, ",Profesor i asocuar"));
      f.shtoStafin(new Profesori("Gresa Ahmeti", 1992, false, ",Profesor asistent"));
      f.shtoStafin(new Profesori("Erza Kollqaku", 1993, true, ",Profesor asistent"));
      f.shtoStafin(new Profesori("Mejreme Halilaj", 1994, true, "Profesor i rregullt"));
      System.out.println();

      System.out.println("Stafi I Rregullt Me I Ri: ");
      System.out.println(f.stafiIRregulltMeIRi(true));
      System.out.println();

      Mesimdhenesi[] m = f.mentoretEVitit(false, 2001);
      if (m == null) {
         System.out.println("sen");
      }else{
         for (Mesimdhenesi me : m) {
            System.out.println(me);
         }
      }

   }


}
