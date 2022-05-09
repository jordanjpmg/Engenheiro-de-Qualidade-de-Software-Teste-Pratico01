import obj.Cliente;
import obj.Conta;
import obj.Telefone;
import org.junit.Assert;
import org.junit.Test;

public class TesteMain {

    private int valorRecarga = 20;
    private int valorIncorreto = 25;

    @Test
    public void recargaComSucesso(){
        Cliente cliente = new Cliente("teste01", new Telefone("123456", 0),new Conta(20));
        Assert.assertTrue("Saldo insuficiente para recarga." , cliente.recarga(valorRecarga));
    }

    @Test
    public void recargaComSaldoInsuficiente(){
        Cliente cliente = new Cliente("teste02", new Telefone("654321", 0),new Conta(20));
        Assert.assertFalse("Saldo suficiente para recarga." , cliente.recarga(valorIncorreto));
    }

    @Test
    public void verificaSaldoComSucesso(){
        Cliente cliente = new Cliente("teste03", new Telefone("223314", 0),new Conta(20));
        cliente.recarga(valorRecarga);
        Assert.assertEquals(cliente.getTelefone().getSaldo(), valorRecarga);
    }

    @Test
    public void verificaSaldoComFalha(){
        Cliente cliente = new Cliente("teste04", new Telefone("113355", 0),new Conta(20));
        Assert.assertNotEquals(cliente.getTelefone().getSaldo(), valorIncorreto);

    }
}
