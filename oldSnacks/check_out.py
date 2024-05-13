from datetime import datetime


def calculate_total(subtotal):
    discount_rate = 0.1
    vat_rate = 0.075
    discount_amount = subtotal * discount_rate
    vat_amount = subtotal * vat_rate
    discounted_total = subtotal - discount_amount
    total_with_vat = discounted_total + vat_amount
    return total_with_vat, discount_amount, vat_amount

   

   
def display_receipt(customer_name, cashier_name, items, subtotal, total_with_vat, discount_amount, vat_amount, date):
    print("=======================================================================================")
    print("\t\t\tSEMICOLON STORES")
    print("\t\t\tMAIN BRANCH")
    print("\t\t\tLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("\t\t\tTEL: 03293828343")
    print("Date: ", date)
    print("Cashier: ", cashier_name)
    print("Customer Name: ", customer_name)
    print("=======================================================================================")
    print("\tITEM-NAME\tQUANTITY\tPRICE-PER-UNIT\tTOTAL")
    print("---------------------------------------------------------------------------------------")
    for item in items:
        print(item)
    print("---------------------------------------------------------------------------------------")
    print("\tSubtotal: ", subtotal)
    print("\tDiscount: ", discount_amount)
    print("\tVat @7.5: ", vat_amount)
    print("=======================================================================================")
    print("\tBill total: ", total_with_vat)
    print("=======================================================================================")
    print("THIS IS NOT AN RECEIPT KINDLY PAY ", total_with_vat)
    print("=======================================================================================")

    
    amount = float(input("How much did the customer give to you?: "))
    balance = amount - total_with_vat
    print("=======================================================================================")
    print("\t\t\tSEMICOLON STORES")
    print("\t\t\tMAIN BRANCH")
    print("\t\t\tLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("\t\t\tTEL: 03293828343")
    print("Date: ", date)
    print("Cashier: ", cashier_name)
    print("Customer Name: ", customer_name)
    print("=======================================================================================")
    print("\tITEM-NAME\tQUANTITY\tPRICE-PER-UNIT\tTOTAL")
    print("---------------------------------------------------------------------------------------")
    for item in items:
        print(item)
    print("---------------------------------------------------------------------------------------")
    print("\tSubtotal: ", subtotal)
    print("\tDiscount: ", discount_amount)
    print("\tVat @7.5: ", vat_amount)
    print("=======================================================================================")
    print("\tBill total: ", total_with_vat)
    print("\tAmount paid: ", amount)
    print("\tBalance: ", balance)
    print("=======================================================================================")
    print("\t\t\t THANK YOU FOR YOUR PATRONAGE")
    print("=======================================================================================")


name = input("Enter customer name: ")
cashier_name = input("Enter cashier name: ")

subtotal = 0
items = []

add_more = "yes"
while add_more.lower() == "yes":
    item_name = input("What did the user buy?: ")
    quantity = float(input("How many pieces?: "))
    price_per_unit = float(input("How much per unit?: "))
    item_total = quantity * price_per_unit
    subtotal += item_total
    items.append(f"\t\t{item_name}\t{quantity}\t{price_per_unit}\t{item_total}")
    add_more = input("Add more items? (yes/no): ")

total_with_vat, discount_amount, vat_amount = calculate_total(subtotal)
date = datetime.now()

display_receipt(name, cashier_name, items, subtotal, total_with_vat, discount_amount, vat_amount, date)

