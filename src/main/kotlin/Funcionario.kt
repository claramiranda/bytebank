class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val bonificacao: Double = 0.0
){
  fun calcularBonificacao (): Double {
      return salario * 0.1
  }
}