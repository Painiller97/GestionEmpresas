public class CongeladosAgua extends Congelados {

    private double salinidad;

    public CongeladosAgua(double salinidad, String fechaEnvasado, String paisOrigen, int temperaturaRecomendada) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaEnvasado, temperaturaRecomendada);
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
