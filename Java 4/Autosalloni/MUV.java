public class MUV extends UtilityVehicle {
    private boolean kaGPS;

    MUV(String nrShasis, String prodhuesi, int vitiProdhimit, boolean kaGPS){
        super(nrShasis, prodhuesi, vitiProdhimit);
        this.kaGPS = kaGPS;
    }

    public boolean eshte4x4(){
        return false;
    }

    public boolean eshteAutomatik(){
        return true;
    }

    public boolean getKaGPS(){
        return kaGPS;
    }

    public void setKaGPS(boolean kaGPS) {
        this.kaGPS = kaGPS;
    }

    @Override
    public String toString() {
        return "Multi Utility Vehicle " + super.toString() + (kaGPS ? " me " : " pa ") + "GPS";
    }
}
