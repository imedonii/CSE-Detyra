public class Fakulteti{

   String drejtimi;
   Mesimdhenesi[] mesimdhenesit;
   int index;

   //constructor
   public Fakulteti(String drejtimi, int size){
      this.drejtimi = drejtimi;
      mesimdhenesit = new Mesimdhenesi[size];
   }

   // metoda ekziston
   public boolean ekziston(Mesimdhenesi m){
      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i].equals(m)) {
            return true;
         }
      }
      return false;
   }

   // metoda per shtimin e mesimdhenesit
   public void shtoMesimdhenesin(Mesimdhenesi m){
      if (m == null) {
         System.out.println("Nuk ka mesimdhenes ne parameter !");
         return;
      }

      if (index >= mesimdhenesit.length) {
         System.out.println("Nuk ka vend !");
         return;
      }

      if (ekziston(m)) {
         System.out.println("Ekziston !");
         return;
      }

      mesimdhenesit[index++] = m;
   }

   // metoda per profesorin me te ri
   public Profesori profesoriMeIRi(){
      Profesori p = null;
      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i] instanceof Profesori) {
            Profesori p1 = (Profesori)mesimdhenesit[i];
            if (p == null || p1.getVitiLindjes() > p.getVitiLindjes()) {
               p = p1;
            }
         }
      }
      return p;
   }

   // metoda per llojin e ushtrimit
   public void shtypLlojinEUshtrimeve(String ushtrime){

      for (int i = 0; i < index; i++) {
         if (mesimdhenesit[i] instanceof Asistenti) {
            Asistenti a = (Asistenti) mesimdhenesit[i];
            if (a.getLlojiUshtrimeve().equals(ushtrime)) {
               System.out.println(a.toString());
            }
         }
      }
   }

        public static void main(String [] args){
                Fakulteti f = new Fakulteti("“Shkenca Kompjuterike", 15);

                // mesimdhenesit e shtuar
                f.shtoMesimdhenesin(new Mesimdhenesi("Filan1 Fisteku1", 1989, "Ligjerata"));
                f.shtoMesimdhenesin(new Mesimdhenesi("Filan2 Fisteku2", 1988, "Ushtrime"));
                f.shtoMesimdhenesin(new Asistenti("Filan3 Fisteku3", 1990, "Matematik"));
                f.shtoMesimdhenesin(new Asistenti("Filan4 Fisteku4", 1999, "Programim"));
                f.shtoMesimdhenesin(new Profesori("Filan5 Fisteku5", 1990, "Rregullt"));
                f.shtoMesimdhenesin(new Profesori("Filan6 Fisteku6", 1992, "Jo i rregullt"));

                Mesimdhenesi m1 = new Mesimdhenesi("Filan6 Fisteku6", 1992, "Jo i rregullt");

                System.out.println();
                if (f.ekziston(m1)) {
                   System.out.println("Mesimdhenesi ekziston !");
                }else{
                   f.shtoMesimdhenesin(m1);
                   System.out.println("Mesimdhenesi u shtua me sukses !");
                }

                System.out.println();
                System.out.println("Profesori me i ri: " + f.profesoriMeIRi());

                System.out.println();
                f.shtypLlojinEUshtrimeve("Matematik");

        }
}
