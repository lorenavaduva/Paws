package com.paws

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.paws.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ChoosePetFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstPetButton.setOnClickListener {
            CurrentModelSingleton.setModel("Sushi")
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.secondPetButton.setOnClickListener {
            CurrentModelSingleton.setModel("Dixie")
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.thirdPetButton.setOnClickListener {
            CurrentModelSingleton.setModel("Muffin")
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}