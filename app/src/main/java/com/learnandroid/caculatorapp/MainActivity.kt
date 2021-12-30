package com.learnandroid.caculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException


class MainActivity : AppCompatActivity() {
    lateinit var b1: Button;lateinit var b2:Button; lateinit var b3:Button;lateinit var b4:Button;lateinit var b5:Button; lateinit var b6:Button 
    lateinit var b7:Button; lateinit var b8:Button; lateinit var b9:Button; lateinit var b0:Button; lateinit var bdot:Button; lateinit var bpi:Button
    lateinit var bequal:Button; lateinit var badd:Button; lateinit var bsub:Button; lateinit var bmul:Button; lateinit var bdiv:Button
    lateinit var binv:Button; lateinit var bsqrt:Button; lateinit var bsquare:Button; lateinit var bfact:Button; lateinit var bln:Button
    lateinit var blog:Button; lateinit var btan:Button; lateinit var bcos:Button; lateinit var bsin:Button; lateinit var bb1:Button
    lateinit var bb2:Button; lateinit var bc:Button; lateinit var bac:Button
    lateinit var tvprime: TextView; lateinit var tvsec:TextView


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b0 = findViewById(R.id.b0)
        bdot = findViewById(R.id.bdot)
        bpi = findViewById(R.id.bpi)
        bequal = findViewById(R.id.bequal)
        bsub = findViewById(R.id.bsub)
        badd = findViewById(R.id.badd)
        bmul = findViewById(R.id.bmul)
        bdiv = findViewById(R.id.bdiv)
        binv = findViewById(R.id.binv)
        bsqrt = findViewById(R.id.bsqrt)
        bsquare = findViewById(R.id.bsquare)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        btan = findViewById(R.id.btan)
        bcos = findViewById(R.id.bcos)
        bsin = findViewById(R.id.bsin)
        bb1 = findViewById(R.id.bb1)
        bb2 = findViewById(R.id.bb2)
        bc = findViewById(R.id.bc)
        bac = findViewById(R.id.bac)

        tvprime = findViewById(R.id.tvprime)
        tvsec = findViewById(R.id.tvsec)

        //onclick Listener
        b1.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "1") }
        b2.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "2") }
        b3.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "3") }
        b4.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "4") }
        b5.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "5") }
        b6.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "6") }
        b7.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "7") }
        b8.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "8") }
        b9.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "9") }
        b0.setOnClickListener { tvprime.text = ( tvprime.text.toString() + "0") }
        bdot.setOnClickListener { tvprime.text = ( tvprime.text.toString() + ".") }
        bac.setOnClickListener {
            tvprime.text = ""
            tvsec.text = ""
        }
        bc.setOnClickListener {
            var str : String = tvprime.text.toString()
            if(!str.equals("")){
                str = str.substring(0, str.length - 1)
                tvprime.text = str
            }
        }
        badd.setOnClickListener { tvprime.text = (tvprime.text.toString() + "+")}
        bsub.setOnClickListener {
            val str: String = tvprime.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvprime.text = (tvprime.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            val str: String = tvprime.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvprime.text = (tvprime.text.toString() + "*")
            }
        }
        bdiv.setOnClickListener { tvprime.text = (tvprime.text.toString() + "/" )}
        bsqrt.setOnClickListener {
            if(tvprime.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }else {
                val str: String = tvprime.text.toString()
                val r = Math.sqrt(str.toDouble())
                val result = r.toString()
                tvprime.text= result
            }
        }
        bb1.setOnClickListener { tvprime.text = (tvprime.text.toString() + "(" )}
        bb2.setOnClickListener { tvprime.text = (tvprime.text.toString() + ")" )}
        bpi.setOnClickListener { tvprime.text = (tvprime.text.toString() + "3.142" )
                                 tvsec.text = (bpi.text.toString() )}
        bsin.setOnClickListener { tvprime.text = (tvprime.text.toString() + "sin") }
        bcos.setOnClickListener { tvprime.text = (tvprime.text.toString() + "cos") }
        btan.setOnClickListener { tvprime.text = (tvprime.text.toString() + "tan") }
        binv.setOnClickListener { tvprime.text = (tvprime.text.toString() + "^" + "(-1)") }
        bfact.setOnClickListener {
            if(tvprime.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }else {
                val value:Int = tvprime.text.toString().toInt()
                val fact: Int = factorial(value)
                tvprime.text = fact.toString()
                tvsec.text = "$value`!"
            }
        }
        bsquare.setOnClickListener {
            if(tvprime.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }else {
                val d = tvprime.text.toString().toDouble()
                val square = d * d
                tvprime.text = square.toString()
                tvsec.text = "$d²"
            }
        }
        bln.setOnClickListener { tvprime.text = (tvprime.text.toString() + "ln") }
        blog.setOnClickListener { tvprime.text = (tvprime.text.toString() + "log") }
        bequal.setOnClickListener {
            val str : String = tvprime.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            tvprime.text = r
            tvsec.text = str
        }


    }

    private fun evaluate(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            fun eat(charToEdt: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()

                if (ch == charToEdt) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw  RuntimeException("Unexpected : " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x -= parseTerm()
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor()
                    else if (eat('/'.toInt())) x /= parseFactor()
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.toInt())) return parseFactor()
                else if (eat('-'.toInt())) return -parseFactor()

                var x: Double
                val startPos = pos

                if (eat('('.toInt())) {
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    x = if (func == "sqrt") Math.sqrt(x)
                    else if (func == "sin") Math.sin(Math.toRadians(x))
                    else if (func == "cos") Math.cos(Math.toRadians(x))
                    else if (func == "tan") Math.tan(Math.toRadians(x))
                    else if (func == "log") Math.log10(x)
                    else if (func == "ln") Math.log(x)
                    else throw RuntimeException("Unknown function: $func")
                }else {
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                return x
            }

        }.parse()


    }

    private fun factorial(n: Int): Int {
        return if (n==1 || n==0)1 else n* factorial(n-1)
    }


}