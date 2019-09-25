package com.ted.maiboxkt

import java.util.*

fun main(args: Array<String>) {
    // //box3 Box3: 長23，寬14，高13 (cm)
    val scan = Scanner(System.`in`)
    println("Please enter object's length")
    val length=scan.nextFloat()
    println("Please enter object's width:")
    val width=scan.nextFloat()
    println("Please enter object's height:")
    val height=scan.nextInt()
    val box=BoxTester(length,width,height)
    box.validate(length,width,height)



}
// //box3 Box3: 長23，寬14，高13 (cm)
//box5 Box5: 長39.5，寬27.5，高23 (cm)
class BoxTester(var length:Float,var width:Float,var height:Int)
{


    fun validate(length: Float, width: Float, height: Int): Boolean {
        this.length=length
        this.width=width
        this.height=height
        if (length<=23 && width<=14 &&height<=13){
            println("box3")
        }else if( length<=39.5 && width<=27.5 &&height<=23){
            println("box5")
        }else{
            println("your box not according to mailbox size")
        }

//        when(validate(length,width,height)){
//            length<=23 && width<=14 &&height<=13-> "box3"
//       //     length<=39.5 && width<=27.5 &&height<=23-> "box5"
//            else->"your box not according to mailbox size"
//        }
        return false
    }


}
