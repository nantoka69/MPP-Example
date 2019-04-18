package de.nantoka.bookstore

actual object BookStoreModel {
    actual var API_URL: String = ""

    actual fun getBooksAsync(callback: (books: Array<Book>) -> Unit){}
}