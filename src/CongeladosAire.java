public class CongeladosAire extends Congelados {

    private double cantNitrogeno;

    private double cantOxigeno;

    private double cantCO;

    private double cantVapor;

    public CongeladosAire(double cantNitrogeno, double cantOxigeno, double cantCO, double cantVapor, String fechaEnvasado, String paisOrigen, int temperaturaRecomendada) {
    super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaEnvasado, temperaturaRecomendada);
    }

    public double getCantNitrogeno() {
        return cantNitrogeno;
    }

    public void setCantNitrogeno(double cantNitrogeno) {
        this.cantNitrogeno = cantNitrogeno;
    }

    public double getCantOxigeno() {
        return cantOxigeno;
    }

    public void setCantOxigeno(double cantOxigeno) {
        this.cantOxigeno = cantOxigeno;
    }

    public double getCantCO() {
        return cantCO;
    }

    public void setCantCO(double cantCO) {
        this.cantCO = cantCO;
    }

    public double getCantVapor() {
        return cantVapor;
    }

    public void setCantVapor(double cantVapor) {
        this.cantVapor = cantVapor;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
