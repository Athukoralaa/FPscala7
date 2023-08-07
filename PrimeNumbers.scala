object Main {
  def isPrime(n: Int) = Range(2, n - 1).filter(i => n % i == 0).length == 0

  def filterPrime(inputList: List[Int]): List[Int] = {
    inputList.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,22,25,29,31)
    val output = filterPrime(input)
    println(output) 
  }
}
