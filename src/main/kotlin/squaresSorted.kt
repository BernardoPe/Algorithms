
fun main() {
    println(squaresSorted(intArrayOf(-12,-4,-1,3,4,6,7,12)).toList())
}

fun squaresSorted(v: IntArray): IntArray {
    var l = 0
    var r = v.size - 1
    var pointer = v.size - 1
    val resultarr = IntArray(pointer + 1)
    while (l < r) {
        val sqr1 = v[l] * v[l]
        val sqr2 = v[r] * v[r]
        if (sqr1 > sqr2) {
            resultarr[pointer--] = sqr1
            l++
        }
        else if(sqr2 > sqr1) {
            resultarr[pointer--] = sqr2
            r--
        }
        else {
            resultarr[pointer--] = sqr1
            resultarr[pointer--] = sqr2
            l++
            r--
        }
    }
    return resultarr
}