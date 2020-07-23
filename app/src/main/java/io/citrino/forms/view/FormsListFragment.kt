/******************************************************************************
 * Copyright (c) 2020                                                         *
 *                                                                            *
 * Permission is hereby granted, free of charge, to any person obtaining      *
 * a copy of this software and associated documentation files (the            *
 * "Software"), to deal in  the Software without restriction, including       *
 * without limitation the rights to  use, copy, modify, merge, publish,       *
 * distribute, sublicense, and/or sell copies of  the Software, and to        *
 * permit persons to whom the Software is furnished to do  so, subject        *
 * to the following conditions:                                               *
 *                                                                            *
 * The above copyright notice and this permission notice shall be             *
 * included in all copies or substantial portions of the Software.            *
 *                                                                            *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,            *
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES            *
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NON              *
 * INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS           *
 * BE LIABLE FOR ANY  CLAIM,  DAMAGES OR OTHER LIABILITY, WHETHER IN          *
 * AN ACTION OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM,  OUT OF           *
 * OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER  DEALINGS           *
 * IN THE SOFTWARE.                                                           *
 ******************************************************************************/

/******************************************************************************
 * Copyright (c) 2020                                                         *
 *                                                                            *
 * Permission is hereby granted, free of charge, to any person obtaining      *
 * a copy of this software and associated documentation files (the            *
 * "Software"), to deal in  the Software without restriction, including       *
 * without limitation the rights to  use, copy, modify, merge, publish,       *
 * distribute, sublicense, and/or sell copies of  the Software, and to        *
 * permit persons to whom the Software is furnished to do  so, subject        *
 * to the following conditions:                                               *
 *                                                                            *
 * The above copyright notice and this permission notice shall be             *
 * included in all copies or substantial portions of the Software.            *
 *                                                                            *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,            *
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES            *
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NON              *
 * INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS           *
 * BE LIABLE FOR ANY  CLAIM,  DAMAGES OR OTHER LIABILITY, WHETHER IN          *
 * AN ACTION OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM,  OUT OF           *
 * OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER  DEALINGS           *
 * IN THE SOFTWARE.                                                           *
 *                                                                            *
 *                                                                            *
 ******************************************************************************/


package io.citrino.forms.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.citrino.forms.MainActivity
import io.citrino.forms.R

/**
 * @author Guilherme Jacichen <gui.jaci@gmail.com>
 */
class FormsListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_forms, container, false)
    }

    override fun onStart() {
        super.onStart()
        (activity as? MainActivity?)?.run {
            fab.show()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        with(context as MainActivity) {
            fab.setOnClickListener {
                findNavController().navigate(R.id.action_edit_form_in_list)
            }
        }
    }

    override fun onDetach() {
        super.onDetach()

        with(activity as MainActivity) {
            fab.setOnClickListener {}
        }
    }
}