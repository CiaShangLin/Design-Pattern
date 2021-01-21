package Composite_Pattern

class Todo(private val todo: String) : TodoList {
    override fun getHtml(): String = todo
}