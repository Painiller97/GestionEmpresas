public class Fresco extends Producto {

    private String fechaEnvasado;

    private String paisOrigen;

    public Fresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
         super(fechaCaducidad, numeroLote);
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
