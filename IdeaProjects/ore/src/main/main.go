package main

import "fmt"
import "math"

func main() {
	counter := 0
	var largest int
	largest = math.MinInt32

	for counter < 10 {
		fmt.Print("Enter an integer")
		var number int
		fmt.Scanln(&number)

		if number > largest {
			largest = number
		}
		counter++
	}
	fmt.Println("The largest is:", largest)
}
