
public class SUV extends UtilityVehicle{
    private boolean eshteAllTerrain;

    SUV(String nrShasis, String prodhuesi, int vitiProdhimit, boolean eshteAllTerrain){
        super(nrShasis, prodhuesi, vitiProdhimit);
        this.eshteAllTerrain = eshteAllTerrain;
    }

    public boolean eshte4x4(){
        return true;
    }

    public boolean eshteAutomatik(){
        return false;
    }

    public boolean getEshteAllTerrain(){
        return eshteAllTerrain;
    }

    public void setEshteAllTerrain(boolean eshteAllTerrain) {
        this.eshteAllTerrain = eshteAllTerrain;
    }

    @Override
    public String toString() {
        return "Sport Utility Vehicle " + super.toString() + (eshteAllTerrain ? " " : " nuk ") + " eshte AllTerrain";
    }


}
