package com.example.dialogfragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.dialog_content.view.*

class BasicFragment2: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = LayoutInflater.from(context).inflate(R.layout.dialog_content, container, false)
        v.text_view.setOnClickListener {
            TestDialog(it.context).show()
//            TestDialogFragment2().show(childFragmentManager, "")
//            AlertDialog.Builder(context)
//                .setTitle("aaa")
//                .setMessage("bbb")
//                .setPositiveButton("ok") { _, _ ->
//                }
//                .show()
        }
        return v
    }
}