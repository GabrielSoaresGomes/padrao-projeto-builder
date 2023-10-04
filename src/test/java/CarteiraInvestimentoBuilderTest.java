import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarteiraInvestimentoBuilderTest {

    @Test
    void deveRetornarExcecaoParaNomeInvestidorInvalido() {
        try {
            CarteiraInvestimentoBuilder carteiraInvestimentoBuilder = new CarteiraInvestimentoBuilder();
            CarteiraInvestimento carteiraInvestimento = carteiraInvestimentoBuilder
                    .setRiscoInvestimento(3.5f)
                    .setCpfInvestidor("123.456.789-10")
                    .setValorInvestido(4567.89f)
                    .setNomeAtivo("Itau S/A")
                    .build();
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("Nome inválido", error.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCPFInvalido() {
        try {
            CarteiraInvestimentoBuilder carteiraInvestimentoBuilder = new CarteiraInvestimentoBuilder();
            CarteiraInvestimento carteiraInvestimento = carteiraInvestimentoBuilder
                    .setNomeInvestidor("Gabriel")
                    .setRiscoInvestimento(3.5f)
                    .setValorInvestido(4567.89f)
                    .setNomeAtivo("Itau S/A")
                    .build();
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("CPF inválido", error.getMessage());
        }
    }

    @Test
    void deveRetornarCarteiraInvestimentoValida() {
        CarteiraInvestimentoBuilder carteiraInvestimentoBuilder = new CarteiraInvestimentoBuilder();
        CarteiraInvestimento carteiraInvestimento = carteiraInvestimentoBuilder
                .setNomeInvestidor("Gabriel Soares")
                .setCpfInvestidor("123.456.789-10")
                .setValorInvestido(12.3f)
                .setRiscoInvestimento(3.2f)
                .build();
        assertNotNull(carteiraInvestimento);
    }

}