package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.gamer.R
import com.example.gamer.databinding.FragmentHomeBinding
import com.example.gamer.databinding.FragmentLoginBinding
import com.example.gamer.util.Data

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.userTxt.text = Data.currentUser?.username

        binding.headsNTailsBtn.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToHeadsNTailsFragment()
            findNavController().navigate(action)
        }

        binding.rockPaperScissorBtn.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToRockScissorPaperFragment()
            findNavController().navigate(action)
        }

        binding.ticTacToeBtn.setOnClickListener{
            val action = HomeFragmentDirections.actionHomeFragmentToEvenOrOddFragment()
            findNavController().navigate(action)
        }

    }
}