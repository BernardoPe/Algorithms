fun main() {
    println(largestPalindromeSize("anagrama", 3))
}



fun largestPalindromeSize( sequence:String, pos:Int ): Int {
    var count = 1
    val size = sequence.length -1
    var left = pos
    var right = pos
    if (pos !in 0..size) return 0
    else {
        while (++right in 0..size && --left in 0..size) {
            if (sequence[right] == sequence[left]) count += 2
            else break
        }
    }
    return count
}
