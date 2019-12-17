package com.example.dialogfragmentdemo

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.test_dialog.view.*

class TestDialog(context: Context) : Dialog(context) {
    private var v: View

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        v = LayoutInflater.from(context).inflate(R.layout.test_dialog, null, false)
        setContentView(v)
        v.test.setOnClickListener {
            AlertDialog.Builder(getContext())
                .setTitle("aaa")
                .setMessage("bbb")
                .setPositiveButton("ok") { _, _ ->
                }
                .show()
        }
    }
}