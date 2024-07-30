package main

import "fmt"

func main() {
	var number1, number2 int
	fmt.Print("Enter first number: ")
	fmt.Scanln(&number1)
	fmt.Print("Enter second number: ")
	fmt.Scanln(&number2)

	if number1 == number2 {
		fmt.Println(0)
	} else if number1 > number2 {
		fmt.Println(1)
	} else {
		fmt.Println(-1)
	}
}
