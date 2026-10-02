package com.example.fintrack.domain.model.base

data class ErrorDialogModel(
    val title: String = "",
    val message: String = "",
    val primaryButtonText: String = "",
    val secondaryButtonText: String = "",
)
