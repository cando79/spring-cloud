package com.example.springcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudApplication(){
    fun asdas (){
        print( "111111111111111" )
    }
}

class apigatewayApplication(){
    fun asdas (){
        print( "222222222222222222" )
    }
}

fun main(args: Array<String>) {
//    runApplication<SpringCloudApplication>(*args)
    println( SpringCloudApplication().asdas() )
    println( apigatewayApplication().asdas() )
}


