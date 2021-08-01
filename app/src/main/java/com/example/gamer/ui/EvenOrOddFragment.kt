package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.gamer.R
import com.example.gamer.databinding.FragmentEvenOrOddBinding


class EvenOrOddFragment : Fragment(R.layout.fragment_even_or_odd){

    var player: Int = 1
    private var btnList = ArrayList<Button>()

    private var _binding: FragmentEvenOrOddBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEvenOrOddBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var result = 0

        binding.evenBtn.setOnClickListener{
            result = (1..4).random()

            if(result == 1){
                binding.playerEvenOddImg.setImageResource(R.drawable.two)
                binding.opponentEvenOddImg.setImageResource(R.drawable.one)
                binding.evenOddResultTxt.setText("LOSE!")
            }else if(result == 2){
                binding.playerEvenOddImg.setImageResource(R.drawable.four)
                binding.opponentEvenOddImg.setImageResource(R.drawable.two)
                binding.evenOddResultTxt.setText("WIN!")
            }else if(result == 3){
                binding.playerEvenOddImg.setImageResource(R.drawable.two)
                binding.opponentEvenOddImg.setImageResource(R.drawable.three)
                binding.evenOddResultTxt.setText("LOSE!")
            }else{
                binding.playerEvenOddImg.setImageResource(R.drawable.four)
                binding.opponentEvenOddImg.setImageResource(R.drawable.four)
                binding.evenOddResultTxt.setText("WIN!")
            }
        }

        binding.oddBtn.setOnClickListener{
            result = (1..4).random()

            if(result == 1){
                binding.playerEvenOddImg.setImageResource(R.drawable.one)
                binding.opponentEvenOddImg.setImageResource(R.drawable.one)
                binding.evenOddResultTxt.setText("LOSE!")
            }else if(result == 2){
                binding.playerEvenOddImg.setImageResource(R.drawable.three)
                binding.opponentEvenOddImg.setImageResource(R.drawable.two)
                binding.evenOddResultTxt.setText("WIN!")
            }else if(result == 3){
                binding.playerEvenOddImg.setImageResource(R.drawable.one)
                binding.opponentEvenOddImg.setImageResource(R.drawable.three)
                binding.evenOddResultTxt.setText("LOSE!")
            }else{
                binding.playerEvenOddImg.setImageResource(R.drawable.one)
                binding.opponentEvenOddImg.setImageResource(R.drawable.four)
                binding.evenOddResultTxt.setText("WIN!")
            }
        }
    }
}