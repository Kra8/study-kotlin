/**
 * 15行目は、文字列のテンプレート式の例と、配列のアクセスを表している。
 * テンプレート式は$記号ではじまり、単純な名前で構成される。
 * カーリーブレイス(中括弧)は必ず必要ではなく、カーリーブレイスで囲むと、囲まれている任意の式を実行してから表すことができる。
 * 参考:
 * http://kotlinlang.org/docs/reference/basic-types.html#strings
 * http://kotlinlang.org/docs/reference/basic-types.html#arrays
 */

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}
