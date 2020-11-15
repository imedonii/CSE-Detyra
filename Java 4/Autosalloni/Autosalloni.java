public class Autosalloni {
    String emri;
    Automjeti[] veturat;
    int index;

    Autosalloni(String emri, int size){
        this.emri = emri;
        veturat = new Automjeti[size];
    }

    public boolean ekziston(Automjeti a){
        for (int i = 0; i < index; i++) {
            if (veturat[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti a){
        if (a == null) {
            System.out.println("ERROR: Automjeti i dhene eshte null !");
            return;
        }

        if (ekziston(a)) {
            System.out.println("ERROR: Automjeti ekziston !");
            return;
        }

        if (index >= veturat.length) {
            System.out.println("ERROR: Nuk ka vend ne varg !");
            return;
        }

        veturat[index++] = a;
    }

    public UtilityVehicle[] utility4x4(boolean eshte4x4){
        int count = 0;

        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof UtilityVehicle) {
                UtilityVehicle uv = (UtilityVehicle)veturat[i];
                if (uv.eshte4x4() == eshte4x4) {
                    count++;
                }
            }
        }

        UtilityVehicle[] util = new UtilityVehicle[count];
        int ind = 0;

        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof UtilityVehicle) {
                UtilityVehicle uv = (UtilityVehicle)veturat[i];
                if (uv.eshte4x4() == eshte4x4) {
                    util[ind++] = uv;
                }
            }
        }

        return util;
    }

    public void shtypLimuzinaNgjyra(String ngjyra){
        if (index == 0) {
            System.out.println("Nuk ka vetura");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof Limuzina) {
                Limuzina l = (Limuzina) veturat[i];
                if (l.getNgjyra().equals(ngjyra)) {
                    System.out.println(l.toString());
                }
            }
        }
    }

    public MUV GPSMeIVjeter(boolean kaGPS){
        MUV meIVjeter = null;

        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof MUV) {
                MUV aktual = (MUV) veturat[i];
                if (aktual.getKaGPS() == kaGPS){
                    if (meIVjeter == null || aktual.getVitiProdhimit() <= meIVjeter.getVitiProdhimit()) {
                        meIVjeter = aktual;
                    }
                }
            }
        }
        return meIVjeter;
    }

    public SUV[] allTerrainProdhuesi(String prodhuesi, boolean eshteAllTerrain) {
        int count = 0;

        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof SUV) {
                SUV aktual = (SUV) veturat[i];
                if (aktual.getProdhuesi().equals(prodhuesi) && aktual.getEshteAllTerrain() == eshteAllTerrain){
                    count++;
                }
            }
        }  

        if (count == 0) {
            return null;
        }

        SUV[] suv = new SUV[count];
        int ind = 0;

        for (int i = 0; i < index; i++) {
            if (veturat[i] instanceof SUV) {
                SUV aktual = (SUV) veturat[i];
                if (aktual.getProdhuesi().equals(prodhuesi) && aktual.getEshteAllTerrain() == eshteAllTerrain){
                    suv[ind++] = aktual;
                }
            }
        }
        return suv;
    }

    public static void main(String[] args) {
        Autosalloni a = new Autosalloni("Salloni ABC", 50);

        a.shtoAutomjetin(new Limuzina("123456", "BMW", 2011, "Kuqe"));
        a.shtoAutomjetin(new Limuzina("126543", "AUDI", 2020, "Bardh"));
        a.shtoAutomjetin(new Limuzina("123454", "BENZ", 2019, "Bardh"));

        a.shtoAutomjetin(new SUV("SUV1234", "AUDI", 2020, true));
        a.shtoAutomjetin(new SUV("SUV4321", "BMW", 2019, false));
        a.shtoAutomjetin(new SUV("SUV1423", "BENZ", 2020, false));
        a.shtoAutomjetin(new SUV("SUV1324", "BENZ", 2019, true));

        a.shtoAutomjetin(new MUV("MUV12345", "AUDI", 2018, true));
        a.shtoAutomjetin(new MUV("MUV12433", "BMW", 2019, true));
        a.shtoAutomjetin(new MUV("MUV14223", "BENZ", 2020, false));
        a.shtoAutomjetin(new MUV("MUV32231", "BENZ", 2020, false));

        System.out.println();
        UtilityVehicle[] u = a.utility4x4(false);
        for(int i = 0; i < u.length; i++){
            System.out.println(u[i].toString());
        }

        System.out.println();
        a.shtypLimuzinaNgjyra("Bardh");

        System.out.println("GPS me i vjeter: ");
        if (a.GPSMeIVjeter(false) == null) {
            System.out.println("Nuk ka !");
        }else{
            System.out.println(a.GPSMeIVjeter(false));
        }

        SUV[] s = a.allTerrainProdhuesi("AUDI", true);
        if (s == null) {
            System.out.println("Nuk ka !");
        }else{
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].toString());
            }
        }
    }
}
