public abstract class Conta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("❌ Saldo insuficiente para saque. Operação cancelada.");
            return;
        }
        saldo -= valor;
        System.out.println("✅ Saque de R$" + valor + " realizado com sucesso.");
    }


    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("❌ Saldo insuficiente para transferência. Operação cancelada.");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("✅ Transferência de R$" + valor + " realizada com sucesso.");
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }

    public abstract void imprimirExtrato();
}
