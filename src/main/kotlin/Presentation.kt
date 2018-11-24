import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * @author Dmitry Borodin on 11/24/18.
 */


fun main(args: Array<String>) {

    println("Starting out program, fetching data")
    GlobalScope.async {
        launch {
            val dbResponse = Repository.getDataFromDb()
            println("Response from DB is $dbResponse")
        }
        launch {
            val networkResponse = Repository.getDataFromNetwork()
            println("Response from network is $networkResponse")
        }
    }
    Thread.sleep(3000)
}