package de.nantoka.bookstore

class BookStorePresenter : BookStoreContract.Presenter {

    private lateinit var view: BookStoreContract.View

    override fun attach(view: BookStoreContract.View) {
        this.view = view
    }

    override fun loadBooks() {

        view.showLoader()

        BookStoreModel.getBooksAsync() { books ->

            view.hideLoader()

            view.showBooks(books.toList())
        }
    }
}