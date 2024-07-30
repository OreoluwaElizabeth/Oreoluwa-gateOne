package main

import "fmt"

func main() {
	var x1, y1, x2, y2 float64
	fmt.Print("Enter x1: ")
	fmt.Scanln(&x1)
	fmt.Print("Enter y1: ")
	fmt.Scanln(&y1)
	fmt.Print("Enter x2: ")
	fmt.Scanln(&x2)
	fmt.Print("Enter y2: ")
	fmt.Scanln(&y2)

	if x1 == x2 {
		fmt.Println("Points lie on a line perpendicular to the y-axis.")
	} else if y1 == y2 {
		fmt.Println("Points lie on a line perpendicular to the x-axis.")
	} else {
		fmt.Println("Points do not lie on a line perpendicular to any axis.")
	}
}
