package de.nantoka.bookstore

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

actual object BookStoreModel {
    actual var API_URL: String =
        "https://gist.githubusercontent.com/tarek360/4578e33621011e18829bad0c8d1c8cdf/raw/06d185bebc3e14a56dfa85f53288daddd4ff6a2b/books.json"

    val restService = Retrofit.Builder()
        .baseUrl(API_URL.substringBeforeLast("/") + "/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RestInterface::class.java)

    actual fun getBooksAsync(callback: (books: Array<Book>) -> Unit) {
        restService.getBooks().enqueue(
            object : Callback<Array<Book>> {
                override fun onFailure(call: Call<Array<Book>>, t: Throwable) {
                }

                override fun onResponse(call: Call<Array<Book>>, response: Response<Array<Book>>) {
                    response.body()?.let {
                        callback(it)
                    }
                }
            }
        )
    }
}