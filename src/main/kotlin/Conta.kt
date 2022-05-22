class Conta(val titular: String, val conta: Int, d: Double) {
    var saldo = 0.00
        private set

    init {
        imprimirExtrato("inicializacao")
    }
    
    private fun imprimirExtrato(operacao: String) {
        println("#### Operacao $operacao na conta $conta ####")
        println("       Titular: $titular")
        println("       Saldo: $saldo")
        println("############################################")
        println()
    }

    private fun operacaoNegada(motivo: String) {
        println("#### Operacao Negada na conta $conta #######")
        println("               Motivo: $motivo")
        println("               Saldo: $saldo")
        println("############################################")
        println()
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            imprimirExtrato("deposito")
        } else {
            operacaoNegada("saldo nao pode ser negativo")
        }

    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            imprimirExtrato("saque")
        } else {
            operacaoNegada("saldo insuficiente")
        }
    }

    fun transferencia(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor

            destino.depositar(valor)

            imprimirExtrato("trasferencia")
            destino.imprimirExtrato("deposito")

            return true
        }
        operacaoNegada("saldo insuficiente para transferencia")
        return false
    }

}
