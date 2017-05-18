/**
 * `val`は、read-onlyなローカル変数を定義するときに用いる。
 * `when節`はC言語でいうところのswitch文に該当する。とても便利(> △ < *)
 * See http://kotlinlang.org/docs/reference/control-flow.html#when-expression
 */

fun main(args: Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}
