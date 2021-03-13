require 'json'
require 'stringio'

# gets a base 10 integer and conversts to base 2 gets the highest amount of consecutive 1's

n = gets.to_i  #gets user input
base2 = [] # array to store base 2 

# keeps dividing base10 to by 2 and stores binaries in array
while (n >= 1)
    base2 << n%2
    n = (n/2).floor
end

cCount = 0 # current amount of consecutive 1's
maxC = 0 # max amount of consecutive 1's
for i in base2 do
    i == 1 ? cCount +=1 : cCount = 0 # resets the count if 0
    if (cCount > maxC) 
        maxC = cCount   # updates the maxCount
    end
end

p maxC # returns max cout