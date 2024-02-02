
import java.util.Date;
import java.util.Timer;


public class Demandamensal {
    
    private Float demanda;
    private Date data;
    private Timer horario;
    private String tipo;
    private Float ultrapassagem;

    public Float getDemanda() {
        return demanda;
    }

    public void setDemanda(Float demanda) {
        this.demanda = demanda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Timer getHorario() {
        return horario;
    }

    public void setHorario(Timer horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getUltrapassagem() {
        return ultrapassagem;
    }

    public void setUltrapassagem(Float ultrapassagem) {
        this.ultrapassagem = ultrapassagem;
    }
}
