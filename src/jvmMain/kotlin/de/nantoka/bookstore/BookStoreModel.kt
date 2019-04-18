package de.nantoka.bookstore

actual object BookStoreModel {
    actual val API_URL: String = ""

    actual fun getBooksAsync(url: String, callback: (books: Array<Book>) -> Unit){}
}