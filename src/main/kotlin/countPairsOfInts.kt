fun main( ) {
    println(countPairsOfInts(intArrayOf(1,2,3,4,5,7,8,9,11,12), 0, 11, 13))
}


fun countPairsOfInts(v: IntArray, l: Int, r: Int, k: Int): Int {
    var left = l
    var right = r - 2
    var count = 0
    while (left < right) {
        val sum = v[left] + v[right]
        if (sum < k) left++
        else if (sum > k) right--
        else {
            count++
            right--
            left++
        }
    }
    return count
}
