#!/bin/ruby

require 'json'
require 'stringio'

# Complete the solve function below.
def solve(meal_cost, tip_percent, tax_percent)
   total = meal_cost + (meal_cost * tip_percent)/100 + (meal_cost * tax_percent)/100
   puts total.round() 
end

meal_cost = gets.to_f

tip_percent = gets.to_i

tax_percent = gets.to_i

solve meal_cost, tip_percent, tax_percent
