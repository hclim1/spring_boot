package com.hclim1.common.demo.example.domain


class Example(var firstName : String,
			  var lastName : String,
			  var age : Int){

	//Custom Getter
	private val fullName : String
		get() {
			return firstName + lastName;
		}
}