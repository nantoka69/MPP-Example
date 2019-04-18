package de.nantoka.bookstore

expect class BookStoreView() : BookStoreContract.View{

    var presenter: BookStoreContract.Presenter?
}