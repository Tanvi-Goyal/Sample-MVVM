package com.mvvm.ui.post

import androidx.lifecycle.MutableLiveData
import com.mvvm.base.BaseViewModel
import com.mvvm.model.Post

class PostViewModel : BaseViewModel() {

    private var postTitle = MutableLiveData<String>()
    private var postBody = MutableLiveData<String>()

    fun bind(post: Post) {
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle(): MutableLiveData<String> {
        return postTitle
    }

    fun getPostBody(): MutableLiveData<String> {
        return postBody
    }
}