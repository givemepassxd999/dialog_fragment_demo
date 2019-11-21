package com.example.dialogfragmentdemo

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.dialog_content.view.*

class BasicFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = LayoutInflater.from(context).inflate(R.layout.dialog_content, container, false)
        v.text_view.text = "Fragment"
        v.text_view.setTextColor(Color.BLACK)
        return v
    }
}