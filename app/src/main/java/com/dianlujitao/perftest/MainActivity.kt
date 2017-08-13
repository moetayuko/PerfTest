/*
 * MIT License
 *
 * Copyright (c) 2017 dianlujitao <dianlujitao@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.dianlujitao.perftest

import android.content.ComponentName
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById(R.id.sustained_on) as Button
        button.setOnClickListener {
            window.setSustainedPerformanceMode(true)
        }

        button = findViewById(R.id.sustained_off) as Button
        button.setOnClickListener {
            window.setSustainedPerformanceMode(false)
        }

        button = findViewById(R.id.vr_on) as Button
        button.setOnClickListener {
            setVrModeEnabled(true, ComponentName("com.google.vr.vrcore",
                    "com.google.vr.vrcore.common.VrCoreListenerService"))
        }

        button = findViewById(R.id.vr_off) as Button
        button.setOnClickListener {
            setVrModeEnabled(false, ComponentName("com.google.vr.vrcore",
                    "com.google.vr.vrcore.common.VrCoreListenerService"))
        }
    }
}
