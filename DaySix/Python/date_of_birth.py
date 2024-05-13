from datetime import datetime

def calculate_age(date_of_birth):
	parts = date_of_birth.split("/")
	birth_year = int(parts[2])
	current_year = 2024
	return current_year - birth_year


print("Welcome to your age reveal")

print("Kindly enter your date of birth in this format.....D/M/Y")

name = input("What is your name?: ")

date_of_birth = input("Enter your date of birth: ")

age = calculate_age(date_of_birth)

print(name, "You are", age, "years old")


