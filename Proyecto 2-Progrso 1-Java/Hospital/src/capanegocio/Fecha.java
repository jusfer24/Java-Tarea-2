package capanegocio;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d",  dia,mes,anio);
    }
}
