public class CongeladosNitrogeno extends Congelados {

    private String metodo;

    private int tiempoExposicion;

    public CongeladosNitrogeno(String metodo, int tiempoExposicion, String fechaEnvasado, String paisOrigen, int temperaturaRecomendada) {
    super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaEnvasado, tiempoExposicion);
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
