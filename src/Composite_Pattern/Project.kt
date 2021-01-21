package Composite_Pattern

import java.lang.StringBuilder

class Project(private val title: String, private val todoList: List<TodoList>) : TodoList {

    private val html = StringBuilder("")

    override fun getHtml(): String {
        html.append("\n<h1>$title</h1>\n")
        todoList.forEach {
            html.append("<li>${it.getHtml()}</li>\n")
        }
        return html.toString()
    }
}