package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 0,
    var likedByme: Boolean = false,
    var reposts: Int,

)