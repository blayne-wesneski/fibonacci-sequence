#import
from decimal import Decimal

#Initialize Variables
n1 = Decimal(0)
n2 = Decimal(1)
n3 = Decimal(0)
i = 0

#Get user input
count = int(input("How many times would you like to run the Fibonacci Sequence? \n"))

while i < count:

    if n1 <= 1000000000000:
    #print the value of n1
        print(i+1, ": ", "{:,}".format(n1))
    
    else:
        #print the value of n1 in scientific notation
        print(i+1, ": ", "{:.27e}".format(n1))

    #Calculate the next number in the sequence
    n3 = n1 + n2

    #Update the values of n1 and n2
    n1 = n2

    n2 = n3
    
    #Increment the counter
    i += 1