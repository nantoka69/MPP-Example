package de.nantoka.bookstore

import org.w3c.xhr.XMLHttpRequest

actual object BookStoreModel {
    actual val API_URL = js("getApiUrl()") as String

    actual fun getBooksAsync(url: String, callback: (Array<Book>) -> Unit) {
        val xmlHttp = XMLHttpRequest()

        xmlHttp.open("GET", url)

        xmlHttp.onload = {

            if (xmlHttp.readyState == 4.toShort() && xmlHttp.status == 200.toShort()) {

                val books = JSON.parse<Array<Book>>(xmlHttp.responseText)

                callback.invoke(books)
            }
        }

        xmlHttp.send()
    }
}