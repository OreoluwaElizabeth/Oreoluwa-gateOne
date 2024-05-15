first_nams = []

last_names = []

names = []

phone_numbers = []


user_choice = 0

while user_choice != 7:

	options = """
		Welcome to Phone Book
		Please select an option below
		==============================
		1 -> Add Contact
		2 -> Remove / Delete Contact
		3 -> Find Contact By Phone Number
		4 -> Find Contact By First Name
		5 -> Find Contact By Last Name
		6 -> Edit Contact
		7 -> Exit
		"""

	print(options)
	user_choice = int(input())

	match user_choice:
		case 1:
			print("Add Contact")
			while True:
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				full_name = f"{first_name} {last_name}"
				phone_number = input("Enter phone number: ")

				first_names.append(first_name)
				last_names.append(last_name)
				names.append(full_name)
				phone_numbers.append(phone_number)

				print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>")
				print("Saved Successfully!!")

				choice = input("Do you want to save another contact? (yes/no): ")
				if choice.lower() != "yes":
					break
			print("Thank you for using phone book")
			print(names)
			print(phone_numbers)

		case 2:
			print("Remove / Delete Contact")
			print("Lists of contacts saved")

			for count in range (len(names)):
				name = names[count]
				print(f"{count + 1} {name} -> {phone_numbers[count]}")

			remove_contact = input("Enter the contact name you want to remove / delete: ")

			if remove_contact in names:
				index = names.index(remove_contact)
				names = names[:index] + names[index + 1:]
				phone_numbers = phone_numbers[:index] + phone_numbers[index + 1:]
				print("Deleting >>>>>>>>>>>>>>>>>>>>>>>>>>")
				print("Contact Deleted successfully!!!")
			else:
				print("No contact found.")

		case 3:
			print("Find Contact By Phone Number")
			phone_number = input("Enter the number you are searching for: ")

			for count in range(len(phone_numbers)):
				if phone_number = phone_numbers[count]:
					print(f"{count + 1} {names[count] -> {phone_numbers[count]}")
					break
			else:
				print("Contact not found")

		case 4:
			print("Find Contact By First Name")
			first_name = input("Enter the first name you are looking for?: ")

			for count in range(len(first_names)):
				if first_name.lower() == first_names[count].lower():
					print(f"{count + 1} {names[count]} -> {phone_numbers[count]}")

		case 5:
			print("Find Contact By Last Name")