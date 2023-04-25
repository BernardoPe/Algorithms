import java.util.PriorityQueue

fun main() {
    val arr = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    val k = 3
    println(kMostFrequent(arr, k))
}

fun kMostFrequent(arr: IntArray, k: Int): List<Int> {
    val heap = PriorityQueue<Pair<Int, Int>>(compareBy({ it.first }, { it.second }))
    var count = 1
    var prevNum = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] == prevNum) {
            count++
        } else {
            heap.offer(count to prevNum)
            if (heap.size > k) {
                heap.poll()
            }
            count = 1
            prevNum = arr[i]
        }
    }

    heap.offer(count to prevNum)

    if (heap.size > k) {
        heap.poll()
    }

    val result = mutableListOf<Int>()

    while (heap.isNotEmpty()) {
        result.add(heap.poll().second)
    }

    return result
}