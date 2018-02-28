class Person(val firstname: String, var age:Int) {
val message:String="Hey MF's!"
	constructor(name:String, age :Int, message: String):this(name, age){
		
	}
}
fun main(args:Array <String>){
	var Person1 =Person("Hasitha",11)
	print(Person1.firstname +" " +Person1.age)
}