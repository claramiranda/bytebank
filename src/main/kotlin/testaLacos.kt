fun testaLacos() {
    for (i in 1..10) {
        for (i in 10 downTo 1 step 3) {
            var i = 0
            while (i < 10) {
                val titular = "Usuario $i"
                val conta = i
                var saldo = 100.0 + i

                //printarConta(titular, conta, saldo)
                i++
            }
        }
    }
}