package main

import "fmt"

func main() {
	var expected int
	fmt.Print("Enter an expected value: ")
	fmt.Scanln(&expected)

	var sum int
	sum = 0
	for sum < expected {
		var number int
		fmt.Print("Enter a number: ")
		fmt.Scanln(&number)
		sum += number
	}
	if sum == expected {
		fmt.Println("Sum has been reached")
	} else {
		fmt.Println("Sum has been exceeded")
	}
}
