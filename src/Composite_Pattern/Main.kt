package Composite_Pattern

fun main() {
    val todoList = mutableListOf<TodoList>()

    val todo1 = Todo("起床")
    val todo2 = Todo("刷牙")
    val todo3 = Todo("吃早餐")
    val todo4 = Todo("騎車")
    val todo5 = Todo("上班")
    val todo6 = Todo("吃中餐")
    val todo7 = Todo("下班")
    todoList.add(todo1)
    todoList.add(todo2)
    todoList.add(todo3)
    todoList.add(todo4)
    todoList.add(todo5)

    val codeTodo1 = Todo("write")
    val codeTodo2 = Todo("test")
    val codeTodo3 = Todo("debug")
    val codeTodo4 = Todo("run")
    val codeTodoList = listOf<TodoList>(codeTodo1, codeTodo2, codeTodo3, codeTodo4)
    val codeProject = Project("Code", codeTodoList)
    todoList.add(codeProject)

    todoList.add(todo6)
    todoList.add(todo7)

    val project = Project("Work", todoList)
    println(project.getHtml())
}