package org
import spock.lang.Specification

class Addition extends Specification{
	def "Scenario: Addition"(){
		
		given: "An integer with value 10"
		def i = 10
		when: "This number is added with another integer"
		i = i+5
		
		then:"The final value is 15"
		assert 15 == i
	}
		def "Scenario: Subtraction"(){
			
			given: "An integer with value 10"
			def i = 10
			when: "This number is subtracted from another integer"
			i = i-2
			
			then:"The final value is 8"
			assert 8 == i
		}
		def "Scenario: Division"(){
			
			given: "An integer with value 10"
			def i = 10
			when: "This number is divided by another integer"
			i = i/2
			
			then:"The final value is 5"
			assert 5 == i
		}
		def "Scenario: multiply"(){
			
			given: "An integer with value 10"
			def i = 10
			when: "This number is multiplied with an 4"
			i = i*2
			
			then:"The final value is 20"
			assert 20 == i
		}
	
}
