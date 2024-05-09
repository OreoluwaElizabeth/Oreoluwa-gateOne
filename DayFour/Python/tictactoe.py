print("Welcome to X and O game!!!")
print("Rules -> You are only allowed to write either X or O")

name = input("Enter your name: ")

for counter in range(9):
	print("Enter a letter either X or O: ")
	choice = input().upper()
	valid_input = choice == 'X' or choice == 'O'

	if not valid_input:
		print("Invalid input. Please enter a letter either X or O")
	else:
		while True:
			print("Which column do you want to place your letter (1-9): ")
			column = int(input())

			if 1 <= column <= 9:
				break
			else:
				print("Invalid column. Please enter a number between 1 and 9")



print("Game Over!!!")
