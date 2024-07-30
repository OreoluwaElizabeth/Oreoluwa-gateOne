package main

import "fmt"
import "math"

func main() {
	counter := 0
	var largest int
	var secondLargest int
	largest = math.MinInt32
	secondLargest = math.MinInt32

	for counter < 10 {
		fmt.Print("Enter an integer: ")
		var number int
		fmt.Scanln(&number)

		if number > largest {
			secondLargest = largest
			largest = number
		} else if number > secondLargest {
			secondLargest = number
		}
		counter++
	}
	fmt.Println("The first largest is: ", largest)
	fmt.Println("The second largest is: ", secondLargest)
}
