package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var displayNumberT:TextView
    private lateinit var resultT:TextView
    private lateinit var oneBT:Button
    private lateinit var twoBT:Button
    private lateinit var threeBT:Button
    private lateinit var fourBT:Button
    private lateinit var fiveBT:Button
    private lateinit var sixBT:Button
    private lateinit var sevenBT:Button
    private lateinit var eightBT:Button
    private lateinit var nineBT:Button
    private lateinit var zeroBT:Button
    private lateinit var allClearBT:Button
    private lateinit var decimalBT:Button
    private lateinit var equalBT:Button
    private lateinit var addBT:Button
    private lateinit var subBT:Button
    private lateinit var multiplyBT:Button
    private lateinit var divideBT:Button
    private lateinit var clearBT:Button
    private var stringOfData = ""
    private var pointEntered = false
    private var countOfDigits = 0
    private val maxDigits = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayNumberT = findViewById(R.id.screenNumberShow)
        resultT = findViewById(R.id.result)
        oneBT = findViewById(R.id.one)
        twoBT = findViewById(R.id.two)
        threeBT = findViewById(R.id.three)
        fourBT = findViewById(R.id.four)
        fiveBT = findViewById(R.id.five)
        sixBT = findViewById(R.id.six)
        sevenBT = findViewById(R.id.seven)
        eightBT = findViewById(R.id.eight)
        nineBT = findViewById(R.id.nine)
        zeroBT = findViewById(R.id.zero)
        addBT = findViewById(R.id.add)
        subBT = findViewById(R.id.sub)
        multiplyBT = findViewById(R.id.multiply)
        divideBT = findViewById(R.id.divide)
        decimalBT = findViewById(R.id.decimal)
        equalBT = findViewById(R.id.equal)
        clearBT = findViewById(R.id.clear)
        allClearBT = findViewById(R.id.allClear)

        resultT.text = null

        Log.d("Calculator","onCreate Called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("digitsCount",countOfDigits)
        val dataStr = displayNumberT.text.toString()
        outState.putString("displayData",dataStr)
        val dataString = stringOfData
        outState.putString("dataString",dataString)
        val tempRes = resultT.text.toString()
        outState.putString("resultData",tempRes)

        Log.d("Calculator","onSaveInstanceState Called")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        countOfDigits = savedInstanceState.getInt("digitsCount")
        val dataStr = savedInstanceState.getString("displayData")
        val tempRes = savedInstanceState.getString("resultData")
        val dataString = savedInstanceState.getString("dataString")
        displayNumberT.text = dataStr
        stringOfData = dataString.toString()
        resultT.text = tempRes
    }

    override fun onStart() {
        super.onStart()
        Log.d("Calculator","onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Calculator","onStop Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Calculator","onPause Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Calculator","onRestart Called")
    }

    override fun onResume() {
        super.onResume()

        oneBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('1')
            }

            else if(countOfDigits < maxDigits){
                storingData('1')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }


        }

        twoBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('2')
            }

            else if(countOfDigits < maxDigits){
                storingData('2')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        threeBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('3')
            }

            else if(countOfDigits < maxDigits){
                storingData('3')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        fourBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('4')
            }

            else if(countOfDigits < maxDigits){
                storingData('4')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        fiveBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('5')
            }

            else if(countOfDigits < maxDigits){
                storingData('5')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        sixBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('6')
            }

            else if(countOfDigits < maxDigits){
                storingData('6')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        sevenBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('7')
            }

            else if(countOfDigits < maxDigits){
                storingData('7')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        eightBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('8')
            }

            else if(countOfDigits < maxDigits){
                storingData('8')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        nineBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('9')
            }

            else if(countOfDigits < maxDigits){
                storingData('9')
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        zeroBT.setOnClickListener{
            if(resultT.text != null && countOfDigits < maxDigits){
                resultT.text = null
                displayNumberT.text = "0"
                storingData('0')
            }

            else if(stringOfData.last() != '/' && countOfDigits < maxDigits) {
                storingData('0')
            }
            
            else if(stringOfData.last() == '/'){
                Toast.makeText(this, "Can't divide by 0", Toast.LENGTH_SHORT).show()
            }

            else{
                Toast.makeText(this, "Maximum Limit is $maxDigits Digits", Toast.LENGTH_SHORT).show()
            }

        }

        addBT.setOnClickListener{
            if(resultT.text != null){
                afterResultWork()
            }

            storingData('+')

        }

        subBT.setOnClickListener{
            if(resultT.text != null){
                afterResultWork()
            }

            storingData('-')

        }

        multiplyBT.setOnClickListener{
            if(resultT.text != null){
                afterResultWork()
            }

            storingData('*')

        }

        divideBT.setOnClickListener{
            if(resultT.text != null){
                afterResultWork()
            }

            storingData('/')

        }

        clearBT.setOnClickListener{
            if(resultT.text != null){
                resultT.text = null
                displayNumberT.text = "0"
            }

            storingData('c')

        }

        allClearBT.setOnClickListener{
            if(resultT.text != null){
                resultT.text = null
                displayNumberT.text = "0"
            }

            storingData('a')
        }

        equalBT.setOnClickListener {
            if(stringOfData.isNotEmpty()){
                pointEntered = false
                countOfDigits = 0
                finalResult()
            }
        }

        decimalBT.setOnClickListener {
            if(resultT.text != null){
                resultT.text = null
            }

            storingData('.')
        }

        Log.d("Calculator","onResume Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Calculator","onDestroy Called")
    }

    private fun afterResultWork(){

        val rString = resultT.text

        for(char in rString) {
            stringOfData+=char
            countOfDigits+=1
        }

        resultT.text = null
    }

    private fun countOfDigits():Int{
        var countOfDigit = 0

        for (i in stringOfData.length-2 downTo 0){

            if(stringOfData[i] == '+' || stringOfData[i] == '-' || stringOfData[i] == '/' || stringOfData[i] == '*') {
                break
            }
            countOfDigit+=1
        }
        return countOfDigit
    }

    private fun storingData(enteredData : Char){

        if(stringOfData.isEmpty()){
            if(enteredData in '1'..'9' || enteredData == '-' ||enteredData == '.'){
                if(enteredData == '.' && !pointEntered){
                    pointEntered = true
                    stringOfData+=('0')
                    stringOfData+=(enteredData)
                    countOfDigits+=1
                }

                else if(enteredData in '1'..'9'){
                    stringOfData+=(enteredData)
                    countOfDigits+=1
                }

                else {
                    stringOfData+=(enteredData)
                }
            }
        }

        else if(stringOfData.isNotEmpty()){
            if(enteredData == 'c'){
                if(stringOfData.last() == '.' ){
                    pointEntered = false
                }

                else if(stringOfData.last() == '+' || stringOfData.last() == '-' || stringOfData.last() == '/' || stringOfData.last() == '*') {

                    for (i in stringOfData.length-2 downTo 0){

                        if(stringOfData[i] == '.'){
                            pointEntered = true
                            break
                        }

                        else if(stringOfData[i] == '+' || stringOfData[i] == '-' || stringOfData[i] == '/' || stringOfData[i] == '*') {
                            pointEntered = false
                            break
                        }
                    }

                    countOfDigits = countOfDigits()
                }

                else if(stringOfData.last() in '0'..'9'){
                    countOfDigits-=1
                }

                stringOfData = stringOfData.dropLast(1)
            }

            else if(enteredData == 'a'){
                stringOfData = ""
                pointEntered = false
                countOfDigits = 0
            }

            else if(enteredData == '+' || enteredData == '-' || enteredData =='/' || enteredData == '*'){
                val last = stringOfData.last()
                stringOfData = stringOfData.dropLast(1)

                if(last in '0'..'9' || last == '.'){
                    stringOfData+=(last)
                    stringOfData+=(enteredData)
                }

                else if(stringOfData.isNotEmpty()) {
                    stringOfData+=(enteredData)
                }

                countOfDigits = 0
                pointEntered = false
            }

            else if(enteredData in '1'..'9' && countOfDigits < maxDigits) {

                if(stringOfData.last() == '0'){
                    stringOfData = stringOfData.dropLast(1)

                    if(stringOfData.isNotEmpty()) {
                        if (stringOfData.last() in '0'..'9' || stringOfData.last() == '.') {
                            stringOfData+=('0')
                        }
                    }
                }

                stringOfData+=(enteredData)
                countOfDigits+=1
            }

            else if(enteredData == '0' &&  stringOfData.last() != '/' && countOfDigits < maxDigits){

                if(stringOfData.last() == '0'){
                    stringOfData = stringOfData.dropLast(1)
                    if(stringOfData.last() in '0'..'9' || stringOfData.last() == '.'){
                        stringOfData+=('0')
                    }
                }

                countOfDigits+=1
                stringOfData+=enteredData
            }

            else if(enteredData == '.' && !pointEntered){
                pointEntered = true

                if(stringOfData.last() !in '0'..'9'){
                    stringOfData+=('0')
                }

                stringOfData+=(enteredData)
            }


        }

        displayNumberT.text = stringOfData
    }

    private fun finalResult (){
        var number1: Double
        var data = ""
        val numberList = mutableListOf<Double>()
        val signList = mutableListOf<Char>()
        val priorityList = listOf('/','+')

        if(stringOfData.last() == '+' || stringOfData.last() == '+'){
            stringOfData+= '0'
        }

        else if(stringOfData.last() == '/' || stringOfData.last() == '*'){
            stringOfData+= '1'
        }

        data +=stringOfData[0]
        for(i in 1 until stringOfData.length){

            if(stringOfData[i]!='+'&& stringOfData[i]!='-'&& stringOfData[i]!='/' && stringOfData[i]!='*'){
                data+=stringOfData[i]
            }

            else{
                number1 = data.toDouble()
                data = ""
                numberList.add(number1)
                signList.add(stringOfData[i])
            }
        }

        number1 = data.toDouble()
        numberList.add(number1)

        var i: Int
        var j: Int
        var count = 0
        while(signList.isNotEmpty()){
            i = 0
            j = numberList.size-1
            while(i in 0 until j && numberList.size > 1){
                if(priorityList[count] == '/'){
                    if(signList[i] == '/'){
                        val res = numberList[i]/numberList[i+1]
                        numberList[i] = res
                        numberList.removeAt(i+1)
                        signList.removeAt(i)
                        i-=1
                        j-=1
                    }

                    else if(signList[i] == '*'){
                        val res = numberList[i]*numberList[i+1]
                        numberList[i] = res
                        numberList.removeAt(i+1)
                        signList.removeAt(i)
                        i-=1
                        j-=1
                    }
                }

                else if(priorityList[count] == '+'){
                    if(signList[i] == '+'){
                        val res = numberList[i]+numberList[i+1]
                        numberList[i] = res
                        numberList.removeAt(i+1)
                        signList.removeAt(i)
                        i-=1
                        j-=1
                    }

                    else if(signList[i] == '-'){
                        val res = numberList[i]-numberList[i+1]
                        numberList[i] = res
                        numberList.removeAt(i+1)
                        signList.removeAt(i)
                        i-=1
                        j-=1
                    }
                }
                i+=1
            }
            count+=1
        }

        stringOfData = ""

        val resultInt = numberList[0].toInt()
        val diff = numberList[0] - resultInt

        if(diff == 0.0){
            resultT.text = resultInt.toString()
        }

        else {
            resultT.text = numberList[0].toFloat().toString()
        }

        stringOfData = ""
    }

}
