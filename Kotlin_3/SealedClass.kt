package Kotlin_3

sealed class MobileApp(val os : String){
    class Android(os : String, val packageName : String) : MobileApp(os)

    class IOS(os : String, val bundleID : String) : MobileApp(os)

    class WindowsMobile(os : String, package1 : String) : MobileApp(os)
}

fun whoami(app : MobileApp) = when(app){
    is MobileApp.Android -> println("${app.os} / ${app.packageName}")
    is MobileApp.IOS -> println("${app.os} / ${app.bundleID}")
    else -> println("${app.os}")
}

fun main(args : Array<String>){

}