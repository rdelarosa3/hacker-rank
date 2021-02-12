# //Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

# Note:  is considered to be an even index.
i = gets.to_i
while i > 0
	str = gets.chomp;
	evens = "";
	odds = "";

	str.split().each do |item|
		if i%2==0
			evens += item
		else
			odds += item
		end
	end

	puts evens + " " + odds;
	i++
end

	

