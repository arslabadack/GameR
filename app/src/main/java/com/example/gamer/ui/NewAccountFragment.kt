package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gamer.R
import com.example.gamer.databinding.FragmentNewAccountBinding
import com.example.gamer.util.Data
import com.example.gamer.util.User

class NewAccountFragment : Fragment(R.layout.fragment_new_account) {

    private var _binding: FragmentNewAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewAccountBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.createBtn.setOnClickListener{
            val username = binding.createUsrTxtEdit.text.toString()
            val password = binding.createPasswordTxtEdit.text.toString()

            Data.users.add(User(username, password))


            val action = NewAccountFragmentDirections.actionNewAccountFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }
}
