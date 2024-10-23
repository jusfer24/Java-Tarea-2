package capanegocio;

public class HistoriaClinica {
    private Fecha fecha;
    private String tiposangre;
    private boolean diabetes;
    private boolean hipertencion;
    private Cita citas[];

   public HistoriaClinica(){
       citas=new Cita[100];
   }
    public HistoriaClinica(Fecha fecha, String tiposangre, boolean diabetes, boolean hipertencion) {
        this.fecha = fecha;
        this.tiposangre = tiposangre;
        this.diabetes = diabetes;
        this.hipertencion = hipertencion;
        citas=new Cita[100];
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHipertencion() {
        return hipertencion;
    }

    public void setHipertencion(boolean hipertencion) {
        this.hipertencion = hipertencion;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }
}
