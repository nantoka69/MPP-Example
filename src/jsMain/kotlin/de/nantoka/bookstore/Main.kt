package de.nantoka.bookstore

fun main(args: Array<String>) {
    val bookStorePresenter = BookStorePresenter()
    val bookStoreView = BookStoreView()
    bookStoreView.presenter = bookStorePresenter

    bookStoreView.show()
}