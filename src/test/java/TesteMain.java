import obj.Cliente;
import obj.Conta;
import obj.Telefone;
import org.junit.Assert;
import org.junit.Test;

public class TesteMain {

    @Test
    public void validaSaldo(){
        Cliente cliente = new Cliente("jordan", new Telefone("123456", 0),new Conta(10));
        int valorRecarga = 10;
        int valorRecargaIncorreto = 2;

        Assert.assertTrue("Saldo insuficiente para recarga." , cliente.recarga(valorRecarga));
        Assert.assertFalse("Saldo suficiente para recarga." , cliente.recarga(valorRecarga));

        Assert.assertEquals(cliente.getTelefone().getSaldo(), valorRecarga);
        Assert.assertNotEquals(cliente.getTelefone().getSaldo(), valorRecargaIncorreto);

    }

}
