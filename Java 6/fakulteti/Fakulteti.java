public class Fakulteti{

	private String drejtimi;
	private Mesimdhenesi[] mesimdhenesit;
	private int index = 0;
	private static int nrMesimdhenesve;
	private boolean kaDekan = false;
 
	//constructor
	public Fakulteti(String drejtimi){
	   this.drejtimi = drejtimi;
	}
 
	//inner class
	public class Tutori extends Mesimdhenesi{
	   private int vitiStudimeve;
 
	   //mentoron punime diplome
	   @Override
	   public boolean mentoron(){
		  return false;
	   }
 
	   //constructor inner class
	   Tutori(String emri, int vitiLindjes, int vitiStudimeve){
		  super(emri, vitiLindjes, "Tutorime");
		  this.vitiStudimeve = vitiStudimeve;
	   }
 
	   //get method
	   public int getVitiStudimeve(){
		  return vitiStudimeve;
	   }
 
	   //set method
	   public void setVitiStudimeve(int vitiStudimeve){
		  this.vitiStudimeve = vitiStudimeve;
	   }
 
	   //toString()
	   @Override
	   public String toString(){
		  return "Tutori i vitit: " + vitiStudimeve + " : " + super.toString();
	   }
	}
 
	//static nested class
	public static class Vizituesi extends Mesimdhenesi{
	   private int nrOreve;
 
	   //mentoron
	   @Override
	   public boolean mentoron(){
		  return true;
	   }
 
	   //constructor
	   Vizituesi(String emri, int vitiLindjes, String angazhimi, int nrOreve){
		  super(emri, vitiLindjes, angazhimi);
		  this.nrOreve = nrOreve;
	   }
 
	   // get method
	   public int getNrOreve(){
		  return nrOreve;
	   }
 
	   // set method
	   public void setNrOreve(int nrOreve){
		  this.nrOreve = nrOreve;
	   }
 
	   //toString()
	   @Override
	   public String toString(){
		  return "Mesimdhenesi vizitues: " + super.toString() + " me "
				   + nrOreve + " ore.";
	   }
	}
 
	public boolean ekziston(Mesimdhenesi m){
	   for (int i = 0; i < index; i++) {
		  if (mesimdhenesit[i].equals(m)) {
			 return true;
		  }
	   }
	   return false;
	}
 
	public void shtoMesimdhenesin(Mesimdhenesi m){
	   if (m == null) {
		  System.out.println("Mesimdhenesi eshte null !");
		  return;
	   }
 
	   if (ekziston(m)) {
		  System.out.println("Ekziston !");
		  return;
	   }
 
	   if (index == mesimdhenesit.length) {
		  System.out.println("Nuk ka vend !");
		  return;
	   }
 
	   mesimdhenesit[index++] = m;
	}
 
	public void shtoNjeMesimdhenes(String emri, int vitiLindjes, String angazhimi, boolean men){
		  // Mesimdhenesi m = new Mesimdhenesi(emri, vitiLindjes, angazhimi){
		  //    public boolean mentoron(){
		  //       return men;
		  //    }
		  // };
		  // shtoMesimdhenesin(m);
 
		  shtoMesimdhenesin(
			 new Mesimdhenesi(emri, vitiLindjes, angazhimi){
				public boolean mentoron(){
				   return men;
				}
			 }
		  );
	}
 
	public void shtypSipasEmrit(String e){
	   if (index == 0) {
		  System.out.println("Nuk ka mesimdhenes.");
		  return;
	   }
 
	   for (int i = 0; i < index; i++) {
		  if (mesimdhenesit[i].getEmri().endsWith(e)) {
			 System.out.println(mesimdhenesit[i].toString());
		  }
	   }
	}
 
	public Mesimdhenesi avgVititLindjes(){
 
	   if (index == 0) {
		  System.out.println("Nuk ka asnje mesimdhenes !");
		  return null;
	   }
 
	   double count = 0;
 
	   for (int i = 0; i < index; i++) {
		  count += mesimdhenesit[i].getVitiLindjes();
	   }
 
	   double avg = count / index;
 
	   Mesimdhenesi m = null;
 
	   for (int i = 0; i < index; i++) {
		  if (mesimdhenesit[i].getVitiLindjes() < avg) {
			 m = mesimdhenesit[i];
		  }
	   }
 
	   return m;
	}
 
	public void shtoDekanin(String emri, int vitiLindjes){
	   class Dekani extends Mesimdhenesi{
		  Dekani(){
			 super(emri, vitiLindjes, "Menaxhim");
		  }
 
		  public boolean mentoron(){
			 return true;
		  }
 
		  public String toString(){
			 return "Dekani " + getEmri() + " i lindur me " + getVitiLindjes()
					  + " menaxhon Fakulltetin " + drejtimi;
		  }
	   }
 
	   Dekani d = new Dekani();
 
	   if (kaDekan) {
		  System.out.println("Fakullteti ka nje dekan");
		  return;
	   }
 
	   if (index == mesimdhenesit.length) {
		  System.out.println("Nuk ka vend");
		  return;
	   }
 
	   if (ekziston(d)) {
		  System.out.println("Ekziston si mesimdhenes");
		  return;
	   }
 
	   mesimdhenesit[index++] = d;
	   kaDekan = true;
	}
 
	public Profesori profesoriMeIRi(){
 
	   if (index == 0) {
		  System.out.println("Nuk ka mesimdhenes!");
		  return null;
	   }
	   Profesori meIRiu = null;
 
	   for (int i = 0; i < index; i++) {
		  if (mesimdhenesit[i] instanceof Profesori) {
			 Profesori p = (Profesori)mesimdhenesit[i];
			 if (meIRiu == null || p.getVitiLindjes() >= meIRiu.getVitiLindjes()) {
				meIRiu = p;
			 }
		  }
	   }
	   if (meIRiu == null) {
		  System.out.println("Nuk ka profesor");
		  return null;
	   }
	   return meIRiu;
	}
 
	static{
	   System.out.println("Blloku static");
	   nrMesimdhenesve = 25;
	}
 
	{
	   System.out.println("Blloku incializues");
	   mesimdhenesit = new Mesimdhenesi[nrMesimdhenesve];
	   mesimdhenesit[index++] = new Fakulteti.Vizituesi("Filan Vizituesi", 1985, "Ushtrime", 10);
	}
 
	public static void main(String[] args) {
	   Fakulteti f = new Fakulteti("Shkenca Kompjuterike");
		 f.shtoMesimdhenesin(new Asistenti("Besart Pllana", 1982, "Laboratorike"));
		 f.shtoMesimdhenesin(new Asistenti("Fistek Filani", 1978, "Numerike"));
		 f.shtoMesimdhenesin(new Profesori("Fatos Maxhuni", 1970, "Profesor i rregullt", "Profesor"));
		 f.shtoMesimdhenesin(new Profesori("Filan Fisteku", 1980, "Profesor asistent", "Profesor"));
		 f.shtoNjeMesimdhenes("Filane Fisteku", 1980, "Ligjerata", false);
		 f.shtoNjeMesimdhenes("Fisteke Filani", 1985, "Ushtrime", true);
		 f.shtoDekanin("Besart Pllana", 1982);
		 f.shtoDekanin("Bertan Karahoda", 1982);
		 f.shtoDekanin("Bertan Karahoda", 1985);
		 f.shtoMesimdhenesin(f.new Tutori("Gent Krasniqi", 1997, 3));
		 Mesimdhenesi m = new Asistenti("Besart Pllana", 1990, "Laboratorike");
		 System.out.println();
		 System.out.println("Mesimdhenesi: " + m + (f.ekziston(m) ? " " : " nuk ") + "ekziston.");
		 System.out.println();
		 Profesori meIRiu = f.profesoriMeIRi();
		 if (meIRiu != null)
			 System.out.println("Profesori me i ri:\n" + meIRiu);
		 System.out.println();
	}
 
 }//end class
 