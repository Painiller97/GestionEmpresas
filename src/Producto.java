public abstract class Producto {

    private String fechaCaducidad;

    private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    
    
    @Override
    public abstract String toString();
}
