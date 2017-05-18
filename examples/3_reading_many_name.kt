/**
 * 繰り返し処理の例。
 * argsに格納されている要素を一つずつ取り出し、実行する。
 * See http://kotlinlang.org/docs/reference/basic-syntax.html#using-a-for-loop
 */

fun main(args: Array<String>) {
    for (name in args)
        println("Hello, $name!")
}
