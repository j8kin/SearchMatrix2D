import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchMatrix1() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertTrue(solution.searchMatrix(matrix, 3))
    }
    @Test
    fun searchMatrix2() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertTrue(solution.searchMatrix(matrix, 11))
    }
    @Test
    fun searchMatrix3() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertTrue(solution.searchMatrix(matrix, 34))
    }
    @Test
    fun searchMatrix4() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertTrue(solution.searchMatrix(matrix, 1))
    }
    @Test
    fun searchMatrix5() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertTrue(solution.searchMatrix(matrix, 60))
    }
    @Test
    fun searchMatrix6() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertFalse(solution.searchMatrix(matrix, 4))
    }
    @Test
    fun searchMatrix7() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertFalse(solution.searchMatrix(matrix, 40))
    }
    @Test
    fun searchMatrix8() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertFalse(solution.searchMatrix(matrix, 0))
    }
    @Test
    fun searchMatrix9() {
        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        assertFalse(solution.searchMatrix(matrix, 70))
    }

    @Test
    fun searchMatrix10() {
        val matrix = emptyArray<IntArray>()
        assertFalse(solution.searchMatrix(matrix, 70))
    }

    @Test
    fun searchMatrix11() {
        val matrix = arrayOf(intArrayOf(-8,-6,-6,-4,-2,-1,-1,-1,0,1,2,4,6,7,7),
            intArrayOf(10,10,12,13,13,14,14,16,17,17,17,17,17,18,19),
            intArrayOf(22,24,26,28,29,31,32,34,34,34,34,36,38,39,39),
            intArrayOf(40,40,41,43,43,44,46,47,49,49,50,52,53,55,55),
            intArrayOf(56,57,59,61,62,64,65,65,66,67,68,68,69,70,71),
            intArrayOf(74,75,77,77,79,79,79,80,81,83,85,87,88,89,89),
            intArrayOf(91,93,94,96,97,98,99,99,100,100,102,104,105,107,107),
            intArrayOf(110,112,114,114,115,117,117,118,118,120,120,121,123,124,124),
            intArrayOf(127,127,129,131,133,134,134,135,137,139,139,140,142,143,144),
            intArrayOf(145,146,147,149,151,151,153,155,156,156,158,160,162,162,163),
        )
        assertTrue(solution.searchMatrix(matrix, 107))
    }
}