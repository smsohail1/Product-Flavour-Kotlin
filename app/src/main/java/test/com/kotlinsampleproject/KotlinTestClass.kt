package test.com.kotlinsampleproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by muhammad.sohail on 10/1/2018.
 */

class KotlinTestClass : AppCompatActivity() {

    /*Open your activity which is MainActivity.java here, you need to invoke an action. Press Ctrl+Shift+A and start
    typing an action name as like below snapshot.*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Different types of array in KOTLIN
        var array = arrayOf<Int>(2, 4, 5, 5)
        var array2 = arrayOf("434", "43434")
        var array3: IntArray = intArrayOf(3, 6)
        var arrar4 = charArrayOf('3', 'd', 'f')

        //Array list in kotlin(Best)
        var arrayList = arrayListOf<Int>()
        if (!arrayList.isEmpty()) {
            Log.d("list", "not empty")
        } else {
            arrayList.add(4)
            Log.d("list", "empty")
        }

        //Array list in kotlin
        //  val arrayListArr: ArrayList<String> = ArrayList<String>()


    }

    public fun testMethod1(list: MutableList<String>) {
        println(list.size)
        Log.d("sds", list.size.toString())
        //  println(list.get(0))
        for (items in list.indices) {
            println("item at index " + items + " is " + list[items])
            Log.d("sds", "item at index " + items + " is " + list[items]);
        }

        var value = "sohail";
        when (value) {
            "sohail" -> {
                Log.d("sds", "sohail");
                println("condition true")
            }
            "salman" -> Log.d("sds", "salman")
            else -> Log.d("dsd", "does not match")
        }

//        list.reverse()
//        list.sort()
//        list.sortDescending()


        for (items in list.indices) {

            println("\n\n")

            when (list[items]) {
                "sohail" -> Log.d("sds", items.toString() + "th index")

                "salman" -> Log.d("sds", items.toString() + "th index")
                else -> Log.d("sds", "does not match")
            }
        }


        //equalsIgnoreCase in kotlin
        var str = "World"
        if (str.equals(str, true)) {

        }

    }

    //Does not access or call from another class
    private fun testMethod3() {

    }


    fun testMethod2(id: Int, name: String): Int {
        //println(id)
        Log.d("ww", id.toString())
        Log.d("ww", name);


//        loop@ for (i in 1..3) {
//            for (j in 1..3) {
//                println("i = $i and j = $j")
//                if (i == 2)
//                    break@loop
//            }
//        }
        //print(name)

        var data: Int = 1;
        try {
            data = 20 / 0;
        } catch (e: Exception) {
            Log.d("exception", e.message);
        } finally {
            Log.d("finally", data.toString());
        }

        //Nullable type
        var str1: String? = "test"
        if (str1 != null) {
            Log.d("nullable", str1);
        }
        str1 = null;

        //Nullable type
        var str2: String = "test"
        if (str2 != null) {
            Log.d("nullable", str1);
        }
        // str2 = null;


        hashMap()




        return id;
    }

    fun hashMap() {
//        val hashMap: HashMap<Int, String> = HashMap<Int, String>()
//        hashMap.put(1, "Ajay")
//        hashMap.put(3, "Vijay")
//        hashMap.put(4, "Prakash")
//        hashMap.put(2, "Rohan")
//
//        println(".....traversing hashmap.......")
//        for (key in hashMap.keys) {
//            println("Element at key $key = ${hashMap[key]}")
//        }
//
//
//        println(".....hashMap.containsKey(3).......")
//        println(hashMap.containsKey(3))
//        println(".....hashMap.containsValue(\"Rohan\").......")
//        println(hashMap.containsValue("Rohan"))
//
//        hashMap.put(2, "Raj")
//        println(".....hashMap.replace(3,\"Ashu\")... hashMap.replace(2,\"Raj\").......")....")
//        for (key in hashMap.keys) {
//            println("Element at key $key = ${hashMap[key]}")
//        }

//        println(".....hashMap.clear().......")
//        hashMap.clear()
//        println(".....print hashMap after clear().......")
//        println(hashMap)


        //Hashmap best practice
        val stringMap: HashMap<String,String> = hashMapOf<String,String>()
        stringMap.put("name", "Ashu")
        stringMap.put("city", "Delhi")
        stringMap.put("department", "Development")
        stringMap.put("hobby", "Playing")

        println("......traverse stringMap.......")
        for(key in stringMap.keys){
            println("Key = ${key} , value = ${stringMap[key]}")
        }

        println("......stringMap.containsKey(\"name\").......")
        println(stringMap.containsKey("name"))

//        println("......stringMap.clear().......")
//        println(stringMap.clear())
//        println(stringMap)
    }
}
