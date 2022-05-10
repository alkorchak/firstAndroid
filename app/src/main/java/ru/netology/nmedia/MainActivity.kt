package ru.netology.nmedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.databinding.ActivityMainBinding
import ru.netology.nmedia.short


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
            id =0L,
            author = "Alex",
            content = "Events",
            published = "01.05.2022",
            likes = 1099999,
            reposts = 2999
        )

        with(binding) {
            authorName.text = post.author
            date.text = post.published
            mainTextView.text = post.content
            favCount.text = short(post.likes)
            repostCount.text = short(post.reposts)
            if (post.likedByme) {
                favButton.setImageResource(R.drawable.favorite_24)
            }

            favButton.setOnClickListener {
                post.likedByme = !post.likedByme
                val imageResId = if (post.likedByme) R.drawable.favorite_24 else R.drawable.favorite_border_24
                favButton.setImageResource(imageResId)
                if (post.likedByme) post.likes++ else post.likes--
                favCount.text = short(post.likes)
            }

            repostButton.setOnClickListener {
                post.reposts++
                repostCount.text = short(post.reposts)
            }
        }
    }
}

