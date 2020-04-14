package com.codeplace.commons

import android.content.Context
import android.widget.Toast

class Validations {
    fun sowToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}