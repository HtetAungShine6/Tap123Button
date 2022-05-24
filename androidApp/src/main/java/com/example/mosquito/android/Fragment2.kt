package com.example.mosquito.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Fragment2 : Fragment(),View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_2, container, false)
        val btn2: Button = view.findViewById(R.id.button2)
        btn2.setOnClickListener(this)
        return view
    }

    companion object {
        fun newInstance(): Fragment2 {
            return Fragment2()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button2 -> {
                val et2: EditText = requireView().findViewById(R.id.editText2)
                val text2: TextView = requireView().findViewById(R.id.textView2)
                var b = et2.getText().toString()
                text2.setText(b)
            }
            else -> {
            }
        }
    }
}