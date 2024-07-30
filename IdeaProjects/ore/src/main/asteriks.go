package main

import "fmt"

func main() {
	var baseLength int
	fmt.Print("Enter the base length of the triangle(1-10): ")
	fmt.Scanln(&baseLength)

	if baseLength < 1 || baseLength > 10 {
		fmt.Println("Invalid base length. Please enter a value between 1 and 10.")
		return
	}

	for count := 1; count <= baseLength; count++ {
		for counter := 1; counter <= count; counter++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
