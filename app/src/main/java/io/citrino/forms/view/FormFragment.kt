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
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import io.citrino.forms.MainActivity
import io.citrino.forms.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_form.*

/**
 * @author Guilherme Jacichen <gui.jaci@gmail.com>
 */
class FormFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> findNavController().navigateUp()
            else -> super.onOptionsItemSelected(item)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        with(context as MainActivity) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            fab.hide()
        }
    }

    override fun onDetach() {
        super.onDetach()
        with(activity as MainActivity){
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
        }
    }
}