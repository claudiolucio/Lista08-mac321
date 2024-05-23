package br.usp.ime.mac321.lista08.ex2;

import br.usp.ime.mac321.lista08.ex1.FatorialView;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

// para melhor ver o resultado do testeCalculo fatorial, observe em widescreen
public class FatorialViewTeste {
    private FrameFixture janela;
    private Robot robo;

    @Before
    public void config() {
        robo = BasicRobot.robotWithNewAwtHierarchy();
        FatorialView frame = new FatorialView();
        janela = new FrameFixture(robo, frame);
        janela.show(); 
    }

    @After
    public void fechar() {
        janela.cleanUp();
    }

    @Test
    public void testeCalculoFatorial() {
        janela.textBox("numeroField").enterText("5");
        janela.button("calcularButton").click();
        aguardar(5000);

        String resultado = janela.label("resultadoLabel").text();
        assertThat(resultado).isEqualTo("Resultado: 120");
        
        // Usuario deve verificar se a interface esta visualmente correta apos a operação
    }

    @Test
    public void testeEntradaInvalida() {
        janela.textBox("numeroField").enterText("abc");
        janela.button("calcularButton").click();
        aguardar(5000); 
        String resultado = janela.label("resultadoLabel").text();
        assertThat(resultado).isEqualTo("Por favor, insira um número válido.");
        
    }

    @Test
    public void testeEntradaNegativa() {
        janela.textBox("numeroField").enterText("-5");
        janela.button("calcularButton").click();
        aguardar(5000);
        String resultado = janela.label("resultadoLabel").text();
        assertThat(resultado).isEqualTo("Por favor, insira um número válido.");
        
        // Usuario deve verificar manualmente se a mensagem de erro é clara e visível
    }

    private void aguardar(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
