package com.example.dialogfragmentdemo

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment

class TestDialogFragment : DialogFragment() {
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
        return inflater.inflate(R.layout.test_fragment_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        test.setOnClickListener {
//            TestDialogFragment2().show(childFragmentManager, "")
//        }
    }
}