package com.codeplace.commons

import android.content.Context
import androidx.appcompat.app.AlertDialog

class AlertUtils {

    fun showAlert(
        context: Context,
        message: String,
        title: String = "",
        positive: String = "Ok",
        negative: String = "",
        callBack: AlertCallBack? = null,
        isCancelable: Boolean = false
    ) {
        val builder = AlertDialog.Builder(context)
        if (!Validations().isEmpty(title)) {
            builder.setTitle(title)
        }
        if (!Validations().isEmpty(positive)) {
            builder.setPositiveButton(positive) { _, _ ->
                callBack?.callBack(true)
            }
        }
        if (!Validations().isEmpty(negative)) {
            builder.setPositiveButton(positive) { _, _ ->
                callBack?.callBack(false)
            }
        }
        builder.setMessage(message)
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(isCancelable)
        alertDialog.show()

    }

    fun showAlert(
        context: Context,
        message: String,
        callBack: AlertCallBack? = null,
        isCancelable: Boolean = false
    ) {
        val builder = AlertDialog.Builder(context)

        builder.setPositiveButton("Ok") { _, _ ->
            callBack?.callBack(true)
        }
        builder.setPositiveButton("Cancel") { _, _ ->
            callBack?.callBack(false)
        }
        builder.setMessage(message)
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(isCancelable)
        alertDialog.show()
    }


}

interface AlertCallBack {
    fun callBack(isPositive: Boolean)
}
