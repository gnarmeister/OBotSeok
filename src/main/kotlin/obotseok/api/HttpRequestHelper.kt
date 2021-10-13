package obotseok.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class HttpRequestHelper {
    private val client: HttpClient = HttpClient(CIO)

    suspend fun get(url: String): String =
        withContext(Dispatchers.IO) {
            val response: HttpResponse = client.get(url)
            response.readText()
        }
    }