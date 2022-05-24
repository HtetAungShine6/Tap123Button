package com.example.mosquito.android

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Fragment1 : Fragment(),View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_1, container, false)
        val btn1: Button = view.findViewById(R.id.button1)
        btn1.setOnClickListener(this)
        return view
    }

    companion object {
        fun newInstance(): Fragment1 {
            return Fragment1()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                val et1: EditText = requireView().findViewById(R.id.editText1)
                val text1: TextView = requireView().findViewById(R.id.textView1)
                var c = et1.getText().toString()
                text1.setText(c)
            }
            else -> {
            }
        }
    }

}
