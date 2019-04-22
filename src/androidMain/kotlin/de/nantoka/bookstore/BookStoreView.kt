package de.nantoka.bookstore

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nantoka.bookstore.R
import kotlinx.android.synthetic.main.activity_main.*


actual class BookStoreView : BookStoreContract.View, AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        BookStorePresenter.attach(this)
        BookStorePresenter.loadBooks()
    }

    override fun showBooks(books: List<Book>) {
        content.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        content.adapter = ListAdapter(books, this)
    }

    override fun showLoader() {
        loader.isVisible = true
    }

    override fun hideLoader() {
        loader.isVisible = false
    }

    fun onViewDetailsClick(view: View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(view.tag as String))
        startActivity(browserIntent)
    }
}
