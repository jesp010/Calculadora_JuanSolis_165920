package solis.juan.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nums: String = ""
        var resultado: String = ""
        var operador: String = ""
        var operacion: Int = 0
        var a: Int = 0
        var n1: Int = 0
        var n2: Int = 0

        // Text Views
        val textViewNums: TextView = findViewById(R.id.TVNums) as TextView
        val textViewRes: TextView = findViewById(R.id.TVResultado) as TextView

        // Botones numéricos
        val b0: Button = findViewById(R.id.boton0) as Button
        val b1: Button = findViewById(R.id.boton1) as Button
        val b2: Button = findViewById(R.id.boton2) as Button
        val b3: Button = findViewById(R.id.boton3) as Button
        val b4: Button = findViewById(R.id.boton4) as Button
        val b5: Button = findViewById(R.id.boton5) as Button
        val b6: Button = findViewById(R.id.boton6) as Button
        val b7: Button = findViewById(R.id.boton7) as Button
        val b8: Button = findViewById(R.id.boton8) as Button
        val b9: Button = findViewById(R.id.boton9) as Button

        // Botones de operandos y funciones
        val bSuma: Button = findViewById(R.id.botonSuma) as Button
        val bResta: Button = findViewById(R.id.botonResta) as Button
        val bMulti: Button = findViewById(R.id.botonMulti) as Button
        val bDiv: Button = findViewById(R.id.botonDivision) as Button
        val bBorrar: Button = findViewById(R.id.botonBorrar) as Button
        val bRes: Button = findViewById(R.id.botonResultado) as Button

        // Resetea variables
        fun resetNums(){
            nums = ""
            resultado = ""
            operador = ""
            n1 = 0
            n2 = 0
            a = 0
        }

        // Event Listeners de botones:

        b0.setOnClickListener {
            nums = nums.toString() + "0"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b1.setOnClickListener {
            nums = nums.toString() + "1"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b2.setOnClickListener {
            nums = nums.toString() + "2"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b3.setOnClickListener {
            nums = nums.toString() + "3"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b4.setOnClickListener {
            nums = nums.toString() + "4"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b5.setOnClickListener {
            nums = nums.toString() + "5"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b6.setOnClickListener {
            nums = nums.toString() + "6"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b7.setOnClickListener {
            nums = nums.toString() + "7"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b8.setOnClickListener {
            nums = nums.toString() + "8"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        b9.setOnClickListener {
            nums = nums.toString() + "9"
            textViewNums.setText(nums)
            a = nums.toInt()
        }
        bSuma.setOnClickListener {
            n1 = a
            resultado = nums.toString() + "+"
            textViewRes.setText(resultado)
            textViewNums .setText("")
            operador = "+"
            nums = ""
            a = 0
        }
        bResta.setOnClickListener {
            n1 = a
            resultado = nums.toString() + "-"
            textViewRes.setText(resultado)
            textViewNums .setText("")
            operador = "-"
            nums = ""
            a = 0
        }
        bMulti.setOnClickListener {
            n1 = a
            resultado = nums.toString() + "*"
            textViewRes.setText(resultado)
            textViewNums .setText("")
            operador = "*"
            nums = ""
            a = 0
        }
        bDiv.setOnClickListener {
            n1 = a
            resultado = nums.toString() + "/"
            textViewRes.setText(resultado)
            textViewNums .setText("")
            operador = "/"
            nums = ""
            a = 0
        }
        bRes.setOnClickListener {
            if (operador.equals("+")){
                n2 = a
                operacion = n1 + n2
                textViewRes.setText(operacion.toString())
                textViewNums.setText("0")
                resetNums()
            }
            if (operador.equals("-")){
                n2 = a
                operacion = n1 - n2
                textViewRes.setText(operacion.toString())
                textViewNums.setText("0")
                resetNums()
            }
            if (operador.equals("*")){
                n2 = a
                operacion = n1 * n2
                textViewRes.setText(operacion.toString())
                textViewNums.setText("0")
                resetNums()
            }
            if (operador.equals("/")){
                n2 = a
                operacion = n1 / n2
                textViewRes.setText(operacion.toString())
                textViewNums.setText("0")
                resetNums()
            }
        }
        bBorrar.setOnClickListener {
            resetNums()
            textViewRes.setText("")
            textViewNums.setText("")
        }
    }
}