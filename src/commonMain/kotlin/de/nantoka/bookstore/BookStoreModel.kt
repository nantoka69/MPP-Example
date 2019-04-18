package de.nantoka.bookstore

expect object BookStoreModel {
    val API_URL: String

    fun getBooksAsync(url: String, callback: (books: Array<Book>) -> Unit)
}