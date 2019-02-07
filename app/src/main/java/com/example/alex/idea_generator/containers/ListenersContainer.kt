package com.example.alex.idea_generator.containers

import java.util.concurrent.CopyOnWriteArraySet

class ListenersContainer {

    private val listeners = CopyOnWriteArraySet<() -> Unit>()

    fun add(listener: () -> Unit) = listeners.add(listener)

    fun remove(listener: () -> Unit) = listeners.remove(listener)

    fun call() = listeners.forEach { it.invoke() }

    fun count() = listeners.size

    fun empty() = count() <= 0

}