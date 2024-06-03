arr=(“Jayesh” “Shivang” “1” Vipul “Nishant” “2”)
 
echo ${arr[@]:2:3}
 
 
unset arr[1]
# Jayesh -->
echo "arrayex.${arr[0]:5}"
 
echo "Length of ${#arr[3]}"