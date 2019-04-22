package de.nantoka.bookstore

import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

actual class BookStoreView actual constructor() : BookStoreContract.View {

    private val loader = document.getElementById("loader") as HTMLDivElement
    private val content = document.getElementById("content") as HTMLDivElement

    override fun showBooks(books: List<Book>) {
        books.forEach {
            val card = CardBuilder.build(it)
            content.appendChild(card)
        }
    }

    override fun showLoader() {
        loader.style.visibility = "visible"
    }

    override fun hideLoader() {
        loader.style.visibility = "hidden"
    }

    fun show() {
        BookStorePresenter.attach(this)
        BookStorePresenter.loadBooks()
    }
}
