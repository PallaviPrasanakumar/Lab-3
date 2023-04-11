package com.zybooks.to_dolist

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DeleteAllDialog: DialogFragment() {
    interface OnYesClickListener {
        fun onYesClick()
    }

    private lateinit var listener: OnYesClickListener





    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnYesClickListener
    }
}