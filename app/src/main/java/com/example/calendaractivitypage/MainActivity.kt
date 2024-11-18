data class ToDoItem(val date: String, val time: String, val activity: String)

val toDoList = mutableListOf<ToDoItem>()

fun getInput(prompt: String): String {
    print(prompt)
    return readLine() ?: ""
}

fun addToDoItem() {
    val date = getInput("Enter the date (e.g., 2024-12-31): ")
    val time = getInput("Enter the time (e.g., 14:00): ")
    val activity = getInput("Enter the activity: ")

    val toDoItem = ToDoItem(date, time, activity)
    toDoList.add(toDoItem)
    println("To-do item added successfully!\n")
}

fun displayToDoList() {
    if (toDoList.isEmpty()) {
        println("Your to-do list is empty.\n")
    } else {
        println("Your to-do list:")
        toDoList.forEachIndexed { index, toDoItem ->
            println("${index + 1}. ${toDoItem.date} ${toDoItem.time} - ${toDoItem.activity}")
        }
        println()
    }
}

fun main() {
    while (true) {
        println("To-Do List Application")
        println("1. Add a to-do item")
        println("2. Display to-do list")
        println("3. Exit")
        print("Choose an option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> addToDoItem()
            2 -> displayToDoList()
            3 -> {
                println("Exiting application.")
                return
            }
            else -> println("Invalid option. Please try again.\n")
        }
    }
}

