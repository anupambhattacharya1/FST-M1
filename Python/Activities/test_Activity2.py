	
import pytest
 
# Additon test
def test_addition():
	
    # Initialize two numbers
	num1 = 10
	num2 = 15
    
	# Add them
	sum = num1 + num2
 
	# Assertion
	assert sum == 25
 
# Subtraction test
def test_subtraction():
  
	# Initialize two numbers
	num1 = 50
	num2 = 35
    
	# Subtract them
	diff = num1 - num2
 
	# Assertion
	assert diff == 15
 
# Multiplication test
def test_multiplication():
  
	num1 = 5
	num2 = 20

	prod = num1 * num2
 
	assert prod == 100
 

def test_division():

	num1 = 100
	num2 = 5
    

	quot = num1 / num2
 

	assert quot == 20