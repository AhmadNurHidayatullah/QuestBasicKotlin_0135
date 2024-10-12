package com.example.activity1_135

// Lambda Functions
// Lambda fungtions adalah fungsi yang tidak memiliki nama
// lambda Fungtions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Fungtions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lambda sbb:
fun main() {
    uppercaseString("Hello")
    println({string: String -> string.uppercase() }("Hello"))
// Hello
}