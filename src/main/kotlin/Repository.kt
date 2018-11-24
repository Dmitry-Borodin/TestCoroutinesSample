import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

/**
 * @author Dmitry Borodin on 11/24/18.
 */

object Repository {

    suspend fun getDataFromNetwork(): String = withContext(Dispatchers.IO) {
        delay(2000) ///network request
        return@withContext "response"
    }

    suspend fun getDataFromDb(): String = withContext(Dispatchers.IO) {
        Thread.sleep(1000) //complex sql query
        return@withContext "response"
    }
}