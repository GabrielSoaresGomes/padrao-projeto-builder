import java.util.Date;


public class CarteiraInvestimentoBuilder {
    private CarteiraInvestimento carteiraInvestimento;

    public CarteiraInvestimentoBuilder() {
        carteiraInvestimento = new CarteiraInvestimento();
    }

    public CarteiraInvestimento build() {
        if (carteiraInvestimento.getNomeInvestidor().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (carteiraInvestimento.getCpfInvestidor().isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return carteiraInvestimento;
    }

    public CarteiraInvestimentoBuilder setNomeInvestidor(String nomeInvestidor) {
        carteiraInvestimento.setNomeInvestidor(nomeInvestidor);
        return this;
    }

    public CarteiraInvestimentoBuilder setCpfInvestidor(String cpfInvestidor) {
        carteiraInvestimento.setCpfInvestidor(cpfInvestidor);
        return this;
    }

    public CarteiraInvestimentoBuilder setNomeAtivo(String nomeAtivo) {
        carteiraInvestimento.setNomeAtivo(nomeAtivo);
        return this;
    }

    public CarteiraInvestimentoBuilder setValorInvestido(float valorInvestido) {
        carteiraInvestimento.setValorInvestido(valorInvestido);
        return this;
    }

    public CarteiraInvestimentoBuilder setDataInvestida(Date dataInvestida) {
        carteiraInvestimento.setDataInvestida(dataInvestida);
        return this;
    }

    public CarteiraInvestimentoBuilder setRiscoInvestimento(float riscoInvestimento) {
        carteiraInvestimento.setRiscoInvestimento(riscoInvestimento);
        return this;
    }
}