package obj;

public class Cliente {
    private String nome_cliente;
    private Telefone telefone;
    private Conta conta;
    private boolean tentativaRecarga;

    public Cliente(String nome_cliente, Telefone telefone, Conta conta){
        this.setNome(nome_cliente);
        this.setLinha(telefone);
        this.setConta(conta);
    }
    public void setNome(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public String getNome() {
        return this.nome_cliente;
    }
    public void setLinha(Telefone telefone) {
        this.telefone = telefone;
    }
    public Telefone getTelefone() {
        return this.telefone;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Conta getConta() {
        return this.conta;
    }

    public boolean recarga(int valor){
        if (this.conta.getSaldo() <= valor){
            return tentativaRecarga = false;
        }else{
            this.conta.setRecarga(valor);
            this.conta.setSaldo(this.conta.getSaldo()-this.conta.getRecarga());
            this.telefone.setSaldo(valor);
            return tentativaRecarga=true;
        }
//        return tentativaRecarga;
    }

}