package com.example.dialogfragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    private val newFragments = arrayOf(BasicFragment(),Basic2Fragment())
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        show_dialog.setOnClickListener{
//            val newFragment = BasicDialogFragment()
//            newFragment.show(supportFragmentManager, "")
//        }
        show_fragment.setOnClickListener {
            navigate(newFragments[index%2])
            index++
        }
    }

    private fun navigate(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        if (fragment.isAdded) {
            transaction.add(R.id.container, fragment).commit()
        } else {
            transaction.add(R.id.container, fragment).commit()
        }
    }
}
