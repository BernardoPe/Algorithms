fun main() {
    println(maxSubArrayWithSumLessThan_K(intArrayOf(10, 7, 6, 1, 7, 1, 2, 3), 7))
}


fun maxSubArrayWithSumLessThan_K( ar:IntArray, k:Int ):Pair<Int,Int> {
    var currsum = 0
    var start = 0
    var i = 0
    var arrsize = 0
    var idxPair = Pair(0, 0)

    while (i < ar.size) {
        if (currsum + ar[i] < k) {
            currsum += ar[i]
            arrsize++
            i++
        }
        else {
            if (idxPair.second - idxPair.first < arrsize - 1) idxPair = Pair(start, start + arrsize - 1)
            i++
            start = i
            arrsize = 0
            currsum = 0
        }
    }
    if (idxPair.second - idxPair.first < arrsize - 1) idxPair = Pair(start, start + arrsize - 1)
    return idxPair
}

