
fun main(){
    sumGivesN(13)
}


fun sumGivesN(n: Int) {
    var currSeq = mutableListOf<Int>()
    var sum = 0
    var r = (n + 1) / 2
    var l = 1

   while (l <= r) {
       sum += l
       currSeq += l
       while (sum > n) {
           sum -= currSeq.removeFirst()
       }
       if (sum == n)
           println(currSeq)
       l++
   }
    println(n)
}