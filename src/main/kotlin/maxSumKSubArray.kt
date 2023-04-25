


fun maxSumKSubArray(arr: IntArray, k: Int): Int {
    var l = 0
    var r = arr.size
    var cursum = 0
    var maxsum = 0
    while(l < r) {
        if (l > k - 1) {
            cursum -= arr[l-k]
            cursum += arr[l]
        }
        else {
            maxsum += arr[l]
            cursum += arr[l]
        }
        if (cursum > maxsum) maxsum = cursum
        l++
    }
    return cursum
}


