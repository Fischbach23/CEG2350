## Lab 04

- Name: Blake Fischbach
- Email: fischbach.9@wright.edu

## Part 1 Answers

1. `\d{3}-\d{3}-\d{4} x\d{4}`
2. `.*[cC][aA].*`
3. `\S+@\S+\.\S+`
4. `(20\d{2})[- /.](0[1-9]|1[0-2])[- /.](0[1-9]|[12]\d|3[01])`

## Part 2 Answers

1. sed -i 's/<\/[^>]*>//g' INPUTFILE
2. sed -i 's/^\s*<li>/- /g' INPUTFILE
3. sed -i 's/<h1>/# /g' INPUTFILE
4. sed -i 's/<h2>/## /g' INPUTFILE
5. sed -i 's/<ul>//g' INPUTFILE
   sed -i 's/<\/ul>//g' INPUTFILE
6. sed -i 's/Batches/Matches/g' INPUTFILE
7. (Optional notes if needed)

## Part 3 Answers

1. awk '$1 ~ /^Bil/' records.txt
2. awk '$4 == 42 {print $3}' records.txt
3. awk -F ' ' '$3 ~ /wright.edu/ {print $2 ", " $1 ": " $3}' records.txt
4. awk '$3 ~ /wright\.edu/ && $6 == "1234" {print $2, "favorite number is:", $5}' records.txt
5. awk '{gsub(/password/,"N0T@PL@!NP@$$W0RD",$6); print}' records.txt > updaterecords.txt
