import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

object x1431A {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val inputStream = System.`in`
        val `in` = InputReader(inputStream)

        // Read the number of test case.
        var T = `in`.nextInt()
        while (T-- > 0) {
            var ans: Long? = 0L
            val n = `in`.nextInt()
            val arr = `in`.readArrList2(n)
            Collections.sort(arr)
            for (i in 0 until n) {
                val min = arr[i]
                val temp = arr[i] * (n - i)
                ans = if (temp >= Collections.max(arr)) {
                    Math.max(temp, ans!!)
                } else {
                    Collections.max(arr)
                }
            }
            println(ans)
        }
    }

    internal class InputReader(stream: InputStream?) {
        var reader: BufferedReader
        var tokenizer: StringTokenizer?

        init {
            reader = BufferedReader(InputStreamReader(stream), 32768)
            tokenizer = null
        }

        operator fun next(): String {
            while (tokenizer == null || !tokenizer!!.hasMoreTokens()) {
                tokenizer = try {
                    StringTokenizer(reader.readLine())
                } catch (e: IOException) {
                    throw RuntimeException(e)
                }
            }
            return tokenizer!!.nextToken()
        }

        fun nextInt(): Int {
            return next().toInt()
        }

        fun nextLong(): Long {
            return next().toLong()
        }

        fun nextDouble(): Double {
            return next().toDouble()
        }

        fun nextLine(): String {
            var str = ""
            try {
                str = if (tokenizer!!.hasMoreTokens()) {
                    tokenizer!!.nextToken("\n")
                } else {
                    reader.readLine()
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return str
        }

        @Throws(Exception::class)
        fun readArrList(N: Int): ArrayList<Int> {
            val arr = ArrayList<Int>()
            for (i in 0 until N) arr.add(next().toInt())
            return arr
        }

        @Throws(Exception::class)
        fun readArrList2(N: Int): ArrayList<Long> {
            val arr = ArrayList<Long>()
            for (i in 0 until N) arr.add(next().toLong())
            return arr
        }
    }
}
