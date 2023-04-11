import android.content.Context
import java.io.*
import java.util.*

const val FILENAME = "todolist.txt"

data class Task(val name: String, val description: String){
    override fun toString(): String {
        return "Task name: '$name', Task description: '$description')"
    }
}

class ToDoList (var context: Context) {
    private var taskList: MutableList<Task> = mutableListOf()

    fun addItem(name: String, description: String) {
        taskList.add(Task(name, description))
    }

    fun getItems(): List<Task> {
        return Collections.unmodifiableList(taskList)
    }

    fun clear() {
        taskList.clear()
    }

    fun saveToFile() {
        // Write list to file in internal storage
        /*val outputStream = context.openFileOutput(FILENAME, Context.MODE_PRIVATE)
        writeListToStream(outputStream)*/
    }

   fun readFromFile() {
       /* try {
            // Read in list from file in internal storage
            val inputStream: FileInputStream = context.openFileInput(FILENAME)
            val objectInputStream = ObjectInputStream(inputStream)
            taskList.clear()
            val list = objectInputStream.readObject() as List<Task>
            list.forEach { task ->
                taskList.add(task);
            }
        } catch (ex: FileNotFoundException) {
            // Ignore
        }*/
    }

    /*private fun writeListToStream(outputStream: FileOutputStream) {
        val writer = PrintWriter(outputStream)
        for (item in taskList) {
            writer.println(item)
        }
        writer.close()
    }*/
}