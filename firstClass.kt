class firstClass {
	private var name: String ="Hasitha"
	
	fun printMe(){
		print("I am " + name)
	}
	//when the class is created inside another class this is called the
	//the nested class
	inner class Nested{
		private val welcomemessage:String ="Inside the nested Class"
		fun foo()=welcomemessage
	}
}

fun main(args: Array< String>){
	val Obj = firstClass().Nested().foo()
	print(Obj)
}