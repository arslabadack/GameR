package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gamer.R
import com.example.gamer.databinding.FragmentRockScissorPaperBinding

class RockScissorPaperFragment : Fragment(R.layout.fragment_rock_scissor_paper){

    private var _binding: FragmentRockScissorPaperBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRockScissorPaperBinding.inflate(inflater, container, false)
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

        binding.rockBtn.setOnClickListener{
            result = (1..3).random()
            binding.playerImg.setImageResource(R.drawable.rock)

            if(result == 1){
                binding.opponentImg.setImageResource(R.drawable.rock)
                binding.resultTxt2.setText("TIE!")
            }else if(result == 2){
                binding.opponentImg.setImageResource(R.drawable.paper)
                binding.resultTxt2.setText("LOSE")
            }else{
                binding.opponentImg.setImageResource(R.drawable.scissors)
                binding.resultTxt2.setText("VICTORY")
            }
        }

        binding.paperBtn.setOnClickListener{
            result = (1..3).random()
            binding.playerImg.setImageResource(R.drawable.paper)

            if(result == 1){
                binding.opponentImg.setImageResource(R.drawable.rock)
                binding.resultTxt2.setText("VICTORY!")
            }else if(result == 2){
                binding.opponentImg.setImageResource(R.drawable.paper)
                binding.resultTxt2.setText("TIE")
            }else{
                binding.opponentImg.setImageResource(R.drawable.scissors)
                binding.resultTxt2.setText("LOSE")
            }
        }

        binding.scissorBtn.setOnClickListener{
            result = (1..3).random()
            binding.playerImg.setImageResource(R.drawable.scissors)

            if(result == 1){
                binding.opponentImg.setImageResource(R.drawable.rock)
                binding.resultTxt2.setText("LOSE!")
            }else if(result == 2){
                binding.opponentImg.setImageResource(R.drawable.paper)
                binding.resultTxt2.setText("VICTORY")
            }else{
                binding.opponentImg.setImageResource(R.drawable.scissors)
                binding.resultTxt2.setText("TIE")
            }
        }
    }
}