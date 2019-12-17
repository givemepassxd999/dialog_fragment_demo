package com.example.dialogfragmentdemo

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.test_fragment_dialog_2.*

class TestDialogFragment2 : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val dialog = super.onCreateDialog(savedInstanceState)
        val window = dialog.window
        window?.requestFeature(Window.FEATURE_NO_TITLE)
        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        setStyle(STYLE_NORMAL, android.R.style.Theme_Light_NoTitleBar_Fullscreen)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.test_fragment_dialog_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test2.setOnClickListener {
            AlertDialog.Builder(context)
                .setTitle("aaa")
                .setMessage("bbb")
                .setPositiveButton("ok") { _, _ ->
                }
                .show()
        }
    }
}