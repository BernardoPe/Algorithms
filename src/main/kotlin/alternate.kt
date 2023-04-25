fun main() {
    println(isShuffle("dabaecf", "abac", "def"))
}


fun isShuffle(isShuffle:String , str1:String , str2:String):Boolean {
    if (isShuffle.length != str1.length + str2.length) return false

    var str1point = 0
    var str2point = 0

    for (i in isShuffle){
        if (str1point < str1.length && i == str1[str1point]) str1point++
        else if (str2point < str2.length && i == str2[str2point]) str2point++
        else return false
    }

    return str1point == str1.length && str2point == str2.length
}