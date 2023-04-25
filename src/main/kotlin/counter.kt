fun main() {
    println(counter(intArrayOf(1,4,3,2,5), 2, 3 ,3))
}



fun counter(v:IntArray, k:Int, lower:Int, upper:Int): Pair<Int,Int> {
    var lowercount = 0
    var highercount = 0
    var cursum = 0

    for (i in 0..k - 1) {
        cursum  += v[i]
    }

    if (cursum > upper) highercount++
    if (cursum < lower) lowercount++

    for (i in k until v.size) {
        cursum -= v[i - k]
        cursum += v[i]
        if (cursum > upper) highercount++
        if (cursum < lower) lowercount++
    }

    return Pair(lowercount,highercount)
}

