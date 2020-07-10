package com.dalia.notetakingapplication.noteslist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.dalia.notetakingapplication.R
import com.dalia.notetakingapplication.databinding.FragmentNotesListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class NotesListFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentNotesListBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_notes_list,
            container,
            false)

        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.actionNotesListFragment_to_WriteNoteFragment)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.actionNotesListFragment_to_WriteNoteFragment)
        }
    }
}
