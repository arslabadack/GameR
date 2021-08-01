package com.example.gamer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.gamer.R
import com.example.gamer.databinding.FragmentLoginBinding
import com.example.gamer.util.Data

class LoginFragment : Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val user = Data


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

            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(username)
            findNavController().navigate(action)

        /*    for(thisUser in user.users){
                if(thisUser.username.equals(username) && thisUser.password.equals(password)){
                    val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(username)
                    findNavController().navigate(action)
                    break
                }else{
                    Toast.makeText(this.context, "Wrong username or password", LENGTH_LONG).show()
                    break
                }
            }*/
        }

        binding.newUserBtn.setOnClickListener{
            val action = LoginFragmentDirections.actionLoginFragmentToNewAccountFragment()
            findNavController().navigate(action)
        }
    }
}

