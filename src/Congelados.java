public abstract class  Congelados extends Producto {

    private String fechaEnvasado;

    private String paisOrigen;

    private int temperaturaRecomendada;

    public Congelados(String fechaEnvasado, String paisOrigen, int temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
    }

    public String getFechaEnvasado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setFechaEnvasado(String fechaEnvasado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getPaisOrigen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setPaisOrigen(String paisOrigen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTemperaturaRecomendada() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setTemperaturaRecomendada(int temperaturaRecomendada) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
