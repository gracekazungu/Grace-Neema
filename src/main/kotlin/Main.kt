fun main(){
    greetPerson("Ada")
    var y = division(num1 =34,num2 =20 )
    println(y)
    var sum =addition(num1=10,num2=65,num3=45,num4=75)
    println(sum)
    var String= "Iam comfident enough"
    println(String)
}
fun greetPerson(name:String){
    println("hello $name")
}
fun division(num1:Int, num2:Int):Int{
    return(num1%num2)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return (sum)
}
fun statement(me:String):String{
    return(me)

}