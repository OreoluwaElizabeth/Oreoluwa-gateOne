package main

import "fmt"

func main() {
	var totalMiles, totalGallons, tripCount int
	var miles, gallons int

	fmt.Println("Enter miles driven and gallons used for each trip.")
	fmt.Println("Enter -1 for miles driven to quit.")

	for {
		fmt.Print("Enter miles driven: ")
		fmt.Scanln(&miles)

		if miles == -1 {
			break
		}

		fmt.Print("Enter gallons used: ")
		fmt.Scanln(&gallons)

		mpg := float64(miles) / float64(gallons)
		fmt.Printf("Miles per gallon for this trip: %.2f\n", mpg)

		totalMiles += miles
		totalGallons += gallons
		tripCount++

		overallMpg := float64(totalMiles) / float64(totalGallons)
		fmt.Printf("Combined miles per gallon: %.2f\n", overallMpg)
	}
}
