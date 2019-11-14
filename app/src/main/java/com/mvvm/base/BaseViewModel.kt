package com.mvvm.base

import androidx.lifecycle.ViewModel
import com.mvvm.injection.component.DaggerViewModelInjector
import com.mvvm.injection.component.ViewModelInjector
import com.mvvm.injection.module.NetworkModule
import com.mvvm.ui.post.PostListViewModel
import com.mvvm.ui.post.PostViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }

}