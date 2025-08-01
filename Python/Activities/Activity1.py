name = input("Enter name")
age = int(input("Enter age"))

	
year = str( ( 2024 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )
print( name + " will be 100 years old in the year " + str(year))
print( name + " will be 100 years old in the year {} " .format(year))
