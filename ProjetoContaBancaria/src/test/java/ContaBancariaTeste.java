
import br.unipar.ContaCorrente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContaBancariaTeste {

    @Test
    public void testDepositoContaCorrente() {

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000);

    }
    @Test
    public void testDepositoContaPoupanca() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(1500, conta.obterSaldo());

    }

    @Test
    public void testDepositoMaiorSaqueContaPoupanca() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);
        assertEquals(3000, conta.obterSaldo());

    }

}
