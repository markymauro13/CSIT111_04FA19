# Author: Mark Mauro    Date: 9/20/19

loanAmount = input("Enter the loan amount: ")   # Enter the loan amount
monthlyInterestRate = input("Enter the monthlyInterestRate: ")  # Enter the monthly interest rate
numberOfYears = input("Enter the number of years: ")    # Enter the number of years

monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1/(1+monthlyInterestRate) ** (numberOfYears*12)))   # Store the equation as a variable


print("The monthly loan payment is: ")
print(monthlyPayment)   # Print the monthly payment
