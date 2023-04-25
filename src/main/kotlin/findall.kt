fun main() {
    findAll(intArrayOf(10, 4, 6, 3, 5))
}


fun findAll( ar:IntArray ) {
    var max = ar[ar.size-1]
    println(max)

    for (i in ar.size - 2 downTo 0){
        if (ar[i] > max) {
            println(ar[i])
            max = ar[i]
        }
    }
}