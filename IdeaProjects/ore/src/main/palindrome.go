package main

import "fmt"

func main() {
	var number int
	fmt.Print("Enter a five-digit integer: ")
	fmt.Scanln(&number)

	if number < 10000 || number > 99999 {
		fmt.Println("Error....number must be five digits long")
		return
	}

	palindrome := true
	original := number
	reversed := 0

	for number > 0 {
		digit := number % 10
		reversed = reversed*10 + digit
		number /= 10
	}

	if original != reversed {
		palindrome = false
	}

	if palindrome {
		fmt.Println("Number is a palindrome.")
	} else {
		fmt.Println("Number is not a palindrome")
	}
}
