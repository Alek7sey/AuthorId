package ru.netology.coroutines.dto

data class PostWithAuthorAndComments (
    val author: Author,
    val post: PostWithComments,
)