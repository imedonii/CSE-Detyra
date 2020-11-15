public abstract class UtilityVehicle extends Automjeti{

    UtilityVehicle(String nrShasis, String prodhuesi, int vitiProdhimit){
        super(nrShasis, prodhuesi, vitiProdhimit);
    }

    public abstract boolean eshte4x4();

    //----------
    // hapi 2.3a
            // get set
    //----------

    @Override
    public String toString() {
        return "UtilityVehicle " + super.toString() + (eshte4x4() ? " " : " nuk ") + "eshte 4x4";
    }
}