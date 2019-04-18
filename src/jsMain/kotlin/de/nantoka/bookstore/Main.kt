package de.nantoka.bookstore

fun main(args: Array<String>) {
    val bookStorePresenter = BookStorePresenter()
    val bookStorePage = BookStoreView(bookStorePresenter)

    bookStorePage.show()
}