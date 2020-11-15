public class Limuzina extends Automjeti{
    private String ngjyra;

    Limuzina(String nrShasis, String prodhuesi, int vitiProdhimit, String ngjyra){
        super(nrShasis, prodhuesi, vitiProdhimit);
        this.ngjyra = ngjyra;
    }

    public boolean eshteAutomatik(){
        return true;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    @Override
    public String toString() {
        return "Limuzina " + super.toString() + " : " + ngjyra;
    }
}
