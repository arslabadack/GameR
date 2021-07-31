package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.gamer.R
import com.example.gamer.databinding.FragmentHomeBinding
import com.example.gamer.databinding.FragmentTicTacToeBinding


class TicTacToeFragment : Fragment(R.layout.fragment_tic_tac_toe){

    var player: Int = 1
    private var btnList = ArrayList<Button>()

    private var _binding: FragmentTicTacToeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTicTacToeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding
    }

/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tic_tac_toe)
        btnList = arrayListOf<Button>(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        btnRestart.visibility = View.GONE
        for(x in 0..btnList.size-1) {
            btnList[x].setOnClickListener {
                joga(it as Button)
            }
        }
        btnRestart.setOnClickListener {
            restart()
        }
    }

    private fun joga(btn: Button){
        if(player % 2 != 0) {
            btn.text = "X"
        }
        else{
            btn.text = "O"
        }
        btn.isClickable = false
        checkGame()
        ++player
    }
    private fun restart(){
        for(x in 0..btnList.size-1){
            btnList[x].text = ""
            btnList[x].isClickable = true
        }
        tvResult.text = ""
        player = 1
        btnRestart.visibility = View.GONE
    }
    private fun checkGame(){
        if(player == 9){
            tvResult.text = "Empate"
            btnRestart.visibility = View.VISIBLE
        }
        val numb = listOf<Int>(0,3,6)
        for(x in numb){
            if (btnList[x].text != "" && btnList[x].text == btnList[x+1].text && btnList[x+1].text == btnList[x + 2].text) {
                ganhador()
            }
        }
        for(x in 0..2){
            if(btnList[x].text != "" && btnList[x].text == btnList[x+3].text && btnList[x+3].text == btnList[x+6].text){
                ganhador()
            }
        }
        if ((btnList[0].text != "" && btnList[0].text == btnList[4].text && btnList[4].text == btnList[8].text)
            || (btnList[2].text != "" && btnList[2].text == btnList[4].text && btnList[4].text == btnList[6].text)) {
            ganhador()
        }
    }
    private fun ganhador(){
        if(player % 2 != 0){
            tvResult.text = "Ganhador: X"
        }
        else{
            tvResult.text = "Ganhador: O"
        }
        endGame()
        btnRestart.visibility = View.VISIBLE
    }
    private fun endGame(){
        for(x in 0..btnList.size-1){
            btnList[x].isClickable = false
        }
    }*/
}