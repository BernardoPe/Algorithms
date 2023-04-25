fun main() {
    val arr = intArrayOf(1,8,15,16,2,3,4)
    arr.shuffle()
    segment(arr, 0, 6, 99 )
    println(arr.toList())
}



fun segment(a: IntArray, left: Int, right: Int, element : Int): Int {
    var i = left - 1
    var j = right
    val pivot = element
    while (true) {
        while (i < right && a[++i] < pivot);
        while (j > left && a[--j] > pivot);
        if (i >= j) break
        exchange(a, i, j)
    }
    exchange(a, i, right)
    return i
}

fun  exchange(a: IntArray, i: Int, j: Int) {
    val x = a[i]
    a[i] = a[j]
    a[j] = x
}

