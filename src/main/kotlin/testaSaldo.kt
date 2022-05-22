fun testaSaldo(saldo: Double) {
    when {
        (saldo > 0.0) -> println("Saldo positivo")
        (saldo == 0.0) -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo zerado")
    } else {
        println("Saldo negativo")
    }

}