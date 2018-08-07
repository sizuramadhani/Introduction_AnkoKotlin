package com.example.sizura.firstankokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        //view group
        verticalLayout {

            //view edit
            val a = editText {
                hint = "input something"
                textSize = 12f
            }
            val b = editText {
                hint = "input something"
                textSize = 12f
            }
            button {
                text = "Submit"
                //anko common
                onClick {
                    toast(a.text.toString())
                }
            }

            button {
                text = "ini alert"

                alert {
                    title = "ini judul"
                    message = ""
                    yesButton {  }//positive
                    noButton {  }
                }.show()
            }

            button {
                text = "Pindah"
                startActivity<Main2Activity>("a" to 1,"b" to "sizuka")//a itu key nya dan to nya itu valuenya

            }
        }

    }
}
