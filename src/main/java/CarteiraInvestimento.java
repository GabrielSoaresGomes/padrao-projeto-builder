import java.util.Date;


public class CarteiraInvestimento {
    private String nomeInvestidor;
    private String cpfInvestidor;

    private String nomeAtivo;
    private float valorInvestido;
    private Date dataInvestida;
    private float riscoInvestimento;

    public CarteiraInvestimento() {
        this.nomeInvestidor = "";
        this.cpfInvestidor = "";
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public String getCpfInvestidor() {
        return cpfInvestidor;
    }

    public void setCpfInvestidor(String cpfInvestidor) {
        this.cpfInvestidor = cpfInvestidor;
    }

    public String getNomeAtivo() {
        return nomeAtivo;
    }

    public void setNomeAtivo(String nomeAtivo) {
        this.nomeAtivo = nomeAtivo;
    }

    public float getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Date getDataInvestida() {
        return dataInvestida;
    }

    public void setDataInvestida(Date dataInvestida) {
        this.dataInvestida = dataInvestida;
    }

    public float getRiscoInvestimento() {
        return riscoInvestimento;
    }

    public void setRiscoInvestimento(float riscoInvestimento) {
        this.riscoInvestimento = riscoInvestimento;
    }
}