package de.nantoka.bookstore

import retrofit2.Call
import retrofit2.http.GET

interface RestInterface {
        @GET("books.json")
        fun getBooks(): Call<Array<Book>>
}