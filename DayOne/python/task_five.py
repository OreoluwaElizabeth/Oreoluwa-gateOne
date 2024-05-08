sum = 0

for number in range(10):
	number = int(input("Enter score: "))

	if number % 2 == 0:

		sum += number
		average = sum / 10

print("The sum of the scores is " + str(sum))
