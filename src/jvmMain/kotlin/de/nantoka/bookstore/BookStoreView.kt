package de.nantoka.bookstore

actual class BookStoreView actual constructor() : BookStoreContract.View {

    override fun showBooks(books: List<Book>) {
        for (book in books){
            System.out.println("\n==========\n")
            System.out.println("Title: ${book.title}")
            System.out.println("Description: ${book.description}")
            System.out.println("Price: ${book.price}")
            System.out.println("Details: ${book.url}")
        }
    }

    override fun showLoader() {
        System.out.println("Fetching book list ...")
    }

    override fun hideLoader() {
        System.out.println("Fetched.\n")
    }

    fun writeBookList(){
        BookStorePresenter.attach(this)
        BookStorePresenter.loadBooks()
    }
}
