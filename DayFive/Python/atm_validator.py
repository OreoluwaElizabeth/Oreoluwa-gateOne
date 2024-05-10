print("Welcome to ATM card validator!!!")

atm_number = input("Kindly input your card number?:")

	if length_number(atm_number):
		print("Card number is valid.")
	else:
		print("Card number is not valid.")


	

def length_number(atm_number):

	valid_length = 16

	return len(atm_number) == valid_length