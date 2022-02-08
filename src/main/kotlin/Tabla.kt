import de.m3y.kformat.Table
import de.m3y.kformat.table



fun main(){
    val uno = table {
            header("A", "B", "C", "Long_Header")

            row(10, "b...1", 2.1f, "foo")
            row(20, "b2", 1 / 3f, "bar")

            hints {
                alignment("A", Table.Hints.Alignment.LEFT)
                precision("C", 2)
                postfix("C", "%")
            }
        }.render(StringBuilder())

    println(uno)
}
