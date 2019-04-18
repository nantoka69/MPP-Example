package de.nantoka.bookstore

actual class BookStoreView actual constructor(presenter: BookStoreContract.Presenter) : BookStoreContract.View {

    override fun showBooks(books: List<Book>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoader() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoader() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
