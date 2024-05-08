sum = 0
average = 0

for number in range(10):
	number = int(input("Enter score: "))

	sum += number
	average = sum / 10

print("The average of the scores is " + str(average))