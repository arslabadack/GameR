package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gamer.R
import com.example.gamer.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginBtn.setOnClickListener{
            val username = binding.usernameTxtEdit.text.toString()
            val password = binding.passwordTxtEdit.text.toString()
            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(username, password)
            findNavController().navigate(action)
        }
        binding.newUserBtn.setOnClickListener{
            val action = LoginFragmentDirections.actionLoginFragmentToNewAccountFragment()
            findNavController().navigate(action)
        }
    }
}