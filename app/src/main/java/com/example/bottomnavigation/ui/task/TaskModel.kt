package com.example.bottomnavigation.ui.task

import java.io.Serializable

data class TaskModel(
    val task: String,
    var time: Long
) : Serializable