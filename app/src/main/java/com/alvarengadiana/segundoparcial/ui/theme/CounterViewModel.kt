package com.alvarengadiana.segundoparcial.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        _count.value -= 1
    }
}
