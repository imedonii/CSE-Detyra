public class Autosalloni{
	private String emri;
	private Automjeti[]automjetet;
	private int index=0;
	private static int nrA;
	private boolean kaPrototip = false;

	public Autosalloni(String emri){
		this.emri=emri;
	}


	public class Minibusi extends Automjeti{
		private int nrDoor;
		public Minibusi(int nrSasise,String prodhuesi,short vitiProdhimit,int nrDoor){
			super(nrSasise,prodhuesi,vitiProdhimit);
			this.nrDoor=nrDoor;
		}
		public boolean eshteAutomatik(){
		return true;
	}
	public String toString(){
		return "Minibusi "+super.toString()+":"+nrDoor;
	}
	}


	public static class Coupe extends Automjeti{
		private int nrUlseve;

	public boolean eshteAutomatik(){
		return false;
	}


		public int getNrUlseve(){
			return nrUlseve;
		}
		public void setNrUlseveint (int nrUlseve){
			this.nrUlseve=nrUlseve;
		}


	public Coupe(int nrSasise,String prodhuesi,short vitiProdhimit,int nrUlseve){
		super(nrSasise,prodhuesi,vitiProdhimit);
	}
	public String toString(){
		return "Coupe "+super.toString()+"-me "+nrUlseve+" ulese.";
	}
	}

	public boolean ekziston(Automjeti a){
		for(int i=0;i<index;i++){
			 if(automjetet[i].equals(a)){
				 return true;
			 }
		}
		return false;
	}
	public void shtoAutomjetin(Automjeti a){
		if(index==automjetet.length){
			System.out.println("Nuk ka vend ne varg!");
		}else if(ekziston(a)){
			System.out.println("Ekziston!");
		}else{
			automjetet[index++]=a;
		}

	}

	static{
		nrA=250;
	}

	{
		automjetet=new Automjeti[nrA];
		Coupe c1=new Coupe(34,"BMW",(short)2018,2);
		shtoAutomjetin(c1);
	}




	public Coupe avgNumriUleseve(){

		Coupe min=null;
		double total=0;
		double avg;
		for(int i=0;i<index;i++){
			if(automjetet[i] instanceof Coupe){
				Coupe c=(Coupe)automjetet[i];

			total+=c.getNrUlseve();
			if(min==null || min.getNrUlseve()<total){
						min=c;
					}
			}
		}
		return min;
	}



		public void shtypAutomatik(boolean automatik){
			for(int i=0;i<index;i++){
				if(automjetet[i].eshteAutomatik()==(automatik)){
					System.out.println("Automjetet qe jane automatik: "+automjetet[i]);
				}
			}
		}

		public void shtoNjeAutomjet(int nrShasis, String prodhuesi, short vitiProdhimit ,boolean eshteAutomatik){
			shtoAutomjetin(new Automjeti(nrShasis, prodhuesi, vitiProdhimit){
				public boolean eshteAutomatik(){
					return eshteAutomatik;
				}
			}
			);
		}
		
		public void shtoPrototipin(int nrShasise, String prodhues) {
			class Prototipi extends Automjeti{
				public Prototipi(){
					super(nrShasise, prodhues, (short)2020);
				}

				public boolean eshteAutomatik(){
					return false;
				}

				@Override
				public String toString() {
					return "Prototipi: " + super.toString() + " nuk eshte automatik";
				}
			}

			Prototipi pt = new Prototipi();

			if (kaPrototip) {
				System.out.println("Ka prototip");
				return;
			}
			if (index >= automjetet.length) {
				System.out.println("Nuk ka vend me");
				return;
			}
			if(ekziston(pt)){
				System.out.println("Prototipi ekziston !");
				return;
			}

			automjetet[index++] = pt;
			kaPrototip = true;

		}
		
		public void print(){
		for(int i=0;i<index;i++){
			System.out.println(automjetet[i]);
		}
	}


	public static void main (String[]args){
		Autosalloni a=new Autosalloni("Salloni ABC");

		a.shtoAutomjetin(new Limuzina(25,"Golf",(short)2016,"e zeze"));
		a.shtoAutomjetin(new Limuzina(51,"Golf",(short)2013,"e kuqe"));
		a.shtoAutomjetin(new Limuzina(35,"BMW",(short)2019,"e zeze"));
		a.shtoAutomjetin(new Limuzina(85,"Mercedes-Benz",(short)2020,"gold"));

		a.shtoAutomjetin(new SUV(25,"Golf",(short)2016,true));
		a.shtoAutomjetin(new SUV(5,"Opel",(short)2013,true));
		a.shtoAutomjetin(new SUV(15,"BMW",(short)2019,false));
		a.shtoAutomjetin(new SUV(35,"Mercedes-Benz",(short)2020,true));

		a.shtoAutomjetin(new Coupe(25,"Golf",(short)2016,2));
		a.shtoAutomjetin(new Coupe(5,"Golf",(short)2016,34));
		a.shtoAutomjetin(new Coupe(2,"Opel",(short)2016,66));
		a.shtoAutomjetin(new Coupe(15,"Golf",(short)2016,12));

		a.shtoNjeAutomjet(122, "BMW", (short)2019, true);
		a.shtoPrototipin(1, "Lamborghini");

		System.out.println("------------");

		a.print();

		System.out.println("------------");
		System.out.println("automjetin e fundit me më pak ulese se mesatarja:"+a.avgNumriUleseve());
		a.shtypAutomatik(true);

	}
}
