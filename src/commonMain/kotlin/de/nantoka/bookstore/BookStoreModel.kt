package de.nantoka.bookstore

expect object BookStoreModel {
    var API_URL: String

    fun getBooksAsync(callback: (books: Array<Book>) -> Unit)
}