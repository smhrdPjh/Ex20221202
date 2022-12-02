package com.example.ex20221202

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class Fragment4 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_4, container, false)

        val etUrl = view.findViewById<EditText>(R.id.etUrl)
        val btnSend = view.findViewById<Button>(R.id.btnSend)

        btnSend.setOnClickListener {
            // 버튼을 클릭했을 때 일어나야하는 일!!!
            // SharedPreferences에 Url값 저장하기
            val url = etUrl.text.toString()
            // 1. SharedPreference 가져오기
            // 1) 이름지정
            // 2) 모드 설정
            // requireActivity.getSharedPreference()
            val spf = requireActivity().getSharedPreferences(
                "mySPF",
                Context.MODE_PRIVATE

            )
            // 2. SharedPreference에 데이터를 저장할 수있는 editor가져오기

            val editor= spf.edit()
            // 3. editor를 통해서 데이터 저장하기
            editor.putString("url", url).commit()
            // +Fragment1에서 꺼내서 url에 설정

        }








        return view
    }


}