public class Fakulteti{
	private String drejtimi;
	private Mesimdhenesi [] mesimdhenesit;
	private int index;
	private static int nrM;

	public Fakulteti(String drejtimi){
		this.drejtimi=drejtimi;
	}



	public boolean eksiton(Mesimdhenesi m){
		for(int i=0;i<index;i++){
			if(mesimdhenesit[i].equals(m)){
				return true;
			}
		}
		return false;
	}
	public void shtoMesimdhenesit(Mesimdhenesi m){
		if(index==mesimdhenesit.length){
			System.out.println("Nuk ka vend ne varg!");
		}else if(eksiton(m)){
			System.out.println("Ekziston!");
		}else{
			mesimdhenesit[index++]=m;
		}
	}

	public class Tutori extends Mesimdhenesi{
		private int vitiStudimeve;
		public boolean mentoron(){
			return false;
		}
		public Tutori(String emri,short vitiLindjes,String angazhimi,int vitiStudimeve){
			super(emri,vitiLindjes,"Tutore");
			this.vitiStudimeve=vitiStudimeve;
		}
		public int getVitiStudimeve(){
			return vitiStudimeve;
		}
		public void setVitiStudimeve(int vitiStudimeve){
			this.vitiStudimeve=vitiStudimeve;
		}
		public String toString(){
		return "Tutori i viti "+vitiStudimeve+" "+super.toString();
	}
	}

	public static class Vizituesi extends Mesimdhenesi{
	private int nrOreve;
	public Vizituesi(String emri,short vitiLindjes,String angazhimi,int nrOreve){
			super(emri,vitiLindjes,angazhimi);
			this.nrOreve=nrOreve;
	}
	public boolean mentoron(){
		return true;
	}
	public String toString(){
		return "Mesidhmenesi vizitues  "+super.toString()+"me "+nrOreve;
	}
	public int getNrOreve(){
		return nrOreve;
	}
	public void setNrOreve(int nrOreve){
		this.nrOreve=nrOreve;
	}
}
public void print(){
	for(int i=0;i<index;i++){
		System.out.println(mesimdhenesit[i]);
	}


}
static{
	nrM=25;
}

{
	mesimdhenesit=new Mesimdhenesi[nrM];
	Vizituesi v1=new Vizituesi("Mejreme Halilaj",(short)1999,"Ligjerata",10);
	shtoMesimdhenesit(v1);
}

public void shtypMesimdhenesit(String kushti){
	for(int i=0;i<index;i++){
		if(mesimdhenesit[i].getEmri().endsWith(kushti)){
			System.out.println(mesimdhenesit[i]);
		}
	}
}

public Mesimdhenesi avgVitiLindjes(){
	Mesimdhenesi meIVjeter=null;
	double total=0;
	double avg;
	for(int i=0;i<index;i++){
		total+=mesimdhenesit[i].getVitiLindjes();
		avg=total/mesimdhenesit[i].getVitiLindjes();
	}
	//avg=total/mesimdhenesit[i].getVitiLindjes();


	for(int i=0;i<index;i++){
	if(meIVjeter==null || mesimdhenesit[i].getVitiLindjes()<meIVjeter.getVitiLindjes()){
		meIVjeter=mesimdhenesit[i];
	}
	}
	return meIVjeter;
}

	public static void main(String[]args){
		Fakulteti f1=new Fakulteti("“Shkenca Kompjuterike");
		f1.print();
		System.out.println("--------");
		Fakulteti.Tutori t1=f1.new Tutori("Mejreme Halilajj",(short)1999,"Tutor",2);
		Fakulteti.Vizituesi v1=new Vizituesi("Mejremee Halilajj",(short)1999,"Vizitues",12);

		f1.shtoMesimdhenesit(new Profesori("Mejreme Haalilaj",(short)1999,"Profesor","Profesor i rregullt"));
		f1.shtoMesimdhenesit(new Asistenti("Mejreme Haaliilaj",(short)1999,"Asistent","Numerike"));
		f1.shtoMesimdhenesit(t1);
		f1.shtoMesimdhenesit(v1);

		f1.print();
		System.out.println("--------");
		f1.shtypMesimdhenesit("aj");
		System.out.println("--------");
		System.out.println("Mesimdhensin e fundit me vit të lindjes me te hershem se mesatarja e viteve të lindjes se te gjithe mesimdhenesve: "+f1.avgVitiLindjes());

	}
}
