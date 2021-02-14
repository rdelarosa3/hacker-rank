# Enter your code here. Read input from STDIN. Print output to STDOUT
phoneBook = {}
inputArr = []
amount = gets.to_i
while true
    str = $stdin.gets
    str.nil? ? break : inputArr << str.chomp
end
inputArr[0..amount-1].each do |s|
    contact = s.split(' ')
    phoneBook[contact[0]] = contact[1]
end

inputArr[amount..inputArr.length-1].each do |c|    
    puts phoneBook.key?(c) ? "#{c}=#{phoneBook[c]}" : "Not found"
end