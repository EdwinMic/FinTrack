package com.example.fintrack.presentation.ui.login.viewmodel

import com.example.fintrack.domain.model.base.ErrorDialogModel
import com.example.fintrack.presentation.utils.operator.StatusLoading


data class LoginUiState(
    val isLoading: StatusLoading = StatusLoading.DISMISS_LOADING,
    val email: String = "",
    val password: String = "",
    val passwordVisible: Boolean = false,
    val errorDialog: ErrorDialogModel? = null,
)