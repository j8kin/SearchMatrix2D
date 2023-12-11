class Solution {

    private fun searchArr(arr: IntArray, target: Int): Int {
        var left = 0
        var right = arr.size - 1
        while (right - left > 1) {
            when {
                arr[left + (right - left) / 2] == target -> return left + (right - left) / 2
                (arr[left + (right - left) / 2] < target) -> left += (right - left) / 2
                else -> right = left + (right - left) / 2
            }
        }

        return if (arr[right] <= target) right else left
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty()) return false

        val firstCol = IntArray(matrix.size) { matrix[it][0] }
        val line = searchArr(firstCol, target)
        return when {
            line == 0 && matrix[0][0] > target -> false
            line == matrix.size - 1 && matrix[line][matrix[line].size-1]  < target -> false
            else -> target == matrix[line][searchArr(matrix[line], target)]
        }
    }
}