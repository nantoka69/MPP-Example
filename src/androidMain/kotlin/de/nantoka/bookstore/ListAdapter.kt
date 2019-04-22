package de.nantoka.bookstore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nantoka.bookstore.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.book_card.view.*

class ListAdapter(private val books: List<Book>, private val context: Context) : RecyclerView.Adapter<ListAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.book_card,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.title.text = books[position].title
        holder.description.text = books[position].description
        holder.price.text = books[position].price
        holder.details.tag = books[position].url

        holder.loadCover(books[position].coverUrl)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.title
        val description = view.description
        val price = view.price
        val details = view.details
        val cover = view.cover

        fun loadCover(url: String) {
            Picasso.get().load(url).into(cover)
        }
    }
}