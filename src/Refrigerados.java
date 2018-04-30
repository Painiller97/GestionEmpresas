public class Refrigerados extends Producto {

    private String codOrganismo;

    private String fechaEnvasado;

    private int temperaturaRecomendada;

    private String paisOrigen;

    public Refrigerados(String codOrganismo, String fechaEnvasado, int temperaturaRecomendada, String paisOrigen, String fechaCaducidad, int numeroLote) {
    super(fechaCaducidad, numeroLote);
    }

    public String getCodOrganismo() {
        return codOrganismo;
    }

    public void setCodOrganismo(String codOrganismo) {
        this.codOrganismo = codOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
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


