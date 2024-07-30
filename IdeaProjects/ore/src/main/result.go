package main

import "fmt"

func main() {
	pass := 0
	fail := 0
	studentCounter := 1

	for studentCounter <= 10 {
		fmt.Print("Enter result (1 = pass, 2 = fail): ")
		var result int
		fmt.Scanln(&result)

		for result != 1 && result != 2 {
			fmt.Print("Invalid input. Please enter 1 or 2: ")
			fmt.Scanln(&result)
		}

		if result == 1 {
			pass++
		} else {
			fail++
		}

		studentCounter++
	}
	fmt.Printf("Passed: %d\nFailed: %d\n", pass, fail)

	if pass > 8 {
		fmt.Println("Bonus to instructor!")
	}
}
