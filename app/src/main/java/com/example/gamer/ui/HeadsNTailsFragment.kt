package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gamer.R
import com.example.gamer.databinding.FragmentHeadsNTailsBinding


class HeadsNTailsFragment : Fragment(R.layout.fragment_heads_n_tails) {

    private var _binding: FragmentHeadsNTailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHeadsNTailsBinding.inflate(inflater, container, false)
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

        binding.headsBtn.setOnClickListener{
            result = (1..2).random()

            if(result == 1){
                binding.headsNTailsImg.setImageResource(R.drawable.heads)
                binding.resultTxt.setText("VICTORY!")
            }else{
                binding.headsNTailsImg.setImageResource(R.drawable.tails)
                binding.resultTxt.setText("LOSE")
            }
        }

        binding.tailsBtn.setOnClickListener{
            result = (1..2).random()

            if(result == 2){
                binding.headsNTailsImg.setImageResource(R.drawable.tails)
                binding.resultTxt.setText("VICTORY!")
            }else{
                binding.headsNTailsImg.setImageResource(R.drawable.heads)
                binding.resultTxt.setText("LOSE")
            }
        }
    }
}