class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        return n > 0 && Math.log10(n.toDouble()) / Math.log10(4.0) % 1.0 == 0.0
    }
}