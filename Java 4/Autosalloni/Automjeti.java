public abstract class Automjeti {
    private String nrShasis; //read only
    private String prodhuesi;
    private int vitiProdhimit;

    Automjeti(String nrShasis, String prodhuesi, int vitiProdhimit){
        this.nrShasis = nrShasis;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = vitiProdhimit;
    }

    //get method ----------------------------------
    public String getNrShasis(){
        return nrShasis;
    }

    public String getProdhuesi(){
        return prodhuesi;
    }

    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    //-------------------------------------------

    //set method----------------------------------
    public void setProdhuesi(String prodhuesi){
        this.prodhuesi = prodhuesi;
    }

    public void setVitiProdhimit(int vitiProdhimit){
        this.vitiProdhimit = vitiProdhimit;
    }
    //---------------------------------------------

    public abstract boolean eshteAutomatik();

    @Override
    public String toString() {
        return nrShasis + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Automjeti) {
            Automjeti a = (Automjeti) obj;
            return a.getNrShasis().equals(nrShasis);
        }
        return false;
    }

}
