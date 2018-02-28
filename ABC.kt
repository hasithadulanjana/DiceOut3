open class ABC {
	open fun think(){
		print("Hey! i am the mother class")
	}
	
}

class BCD:ABC(){
	override fun think(){
		print("i was adopted loser!")
	}
}

fun main(args:Array<String>){
	var a =BCD()
	a.think()
}