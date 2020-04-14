package com.codeplace.commons

import android.text.TextUtils
import android.util.Patterns


class Validations {
    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isEmpty(data: String): Boolean {
        return TextUtils.isEmpty(data)
    }

    fun lengthCheck(data: String, length: Int): Boolean {
        return !TextUtils.isEmpty(data) && data.length > length
    }

    fun rangeCheck(data: String, min: Int, max: Int): Boolean {
        return !TextUtils.isEmpty(data) && data.length > min && max < data.length
    }
}