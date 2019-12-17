package com.example.dialogfragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show_dialog.setOnClickListener{
            val newFragment = BasicDialogFragment()
            newFragment.show(supportFragmentManager, "")
        }
        show_fragment.setOnClickListener {
            val newFragment = BasicFragment()
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.container, newFragment)
            ft.commit()
        }
    }
}
