fun main() {
    println("######### Null Bank ##########")

    val contaClara = Conta(titular = "Clara Anna Miranda", conta = 182, d = 300.00)
    val contaStella = Conta(titular = "Stella Lourenco Lage", conta = 174, d = 300.00)

    contaClara.depositar(1000.00)
    contaClara.transferencia(contaStella, 200.00)
    contaStella.sacar(30.00)

    contaClara.depositar(300.00)
}

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

//    fun getTitular(): String {
//        return titular
//    }
//
//    fun getConta(): Int {
//        return numero
//    }
//
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setTitular(titular: String) {
//        this.titular = titular
//    }
//
//    fun setConte(conta: Int) {
//        this.numero = conta
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            this.saldo = valor
//        } else {
//            operacaoNegada("saldo negativo")
//        }
//    }


}


//fun verificaSaldo(saldo: Double) {
//    when {
//        (saldo > 0.0) -> println("Saldo positivo")
//        (saldo == 0.0) -> println("Saldo neutro")
//        else -> println("Saldo negativo")
//    }
//
//    //    if (saldo > 0.0) {
//    //        println("Saldo positivo")
//    //    } else if (saldo == 0.0) {
//    //        println("Saldo zerado")
//    //    } else {
//    //        println("Saldo negativo")
//    //    }
//    //
//}



