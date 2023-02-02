## Order application 
Write an application where a customer can create orders, save and view their invoices.
### Requirements
* The concepts of final, static, overload, override, constructor, inheritance, polymorphism, encapsulation, List, Set, Map should be used.
* You can add to the system.
* It is enough to work on the main method.
* Try to write in accordance with SOLID principles.

### Homework Steps

* Listing operations should be done using stream.
* Create a Maven project.
* Run the maven commands and add the output
* List all customers
* Able to create new customers
* List customers with the letter 'C' in them
* List the total amount of invoices for customers who signed up in June
* List all invoices in the system
* List invoices over 1500TL in the system
* Calculate the average of invoices over 1500TL in the system
* List the names of customers with invoices under 500TL in the system
* Write the code that lists the companies in which the average invoices for the month of June are below 750.

### Output
```markdown
Customers List:
Name: Jack01 - Registered_date: 2019-06-22 - Invoice: [Company_name: Colin's - Sector: TEXTILE - Amount: 1750.0 - Billing_date: 2020-05-20]
Name: Christiana02 - Registered_date: 2021-04-08 - Invoice: [Company_name: L'Oreal Paris - Sector: COSMETIC - Amount: 425.0 - Billing_date: 2021-06-15]
Name: Alexander03 - Registered_date: 2019-07-16 - Invoice: [Company_name: Nestle - Sector: FOOD - Amount: 450.0 - Billing_date: 2020-06-12]
Name: Frank04 - Registered_date: 2022-01-15 - Invoice: [Company_name: Microsoft - Sector: TECHNOLOGY - Amount: 3399.0 - Billing_date: 2022-04-30]
Name: Diana05 - Registered_date: 2022-06-15 - Invoice: []

Invoices List:
Company_name: Colin's - Sector: TEXTILE - Amount: 1750.0 - Billing_date: 2020-05-20
Company_name: L'Oreal Paris - Sector: COSMETIC - Amount: 425.0 - Billing_date: 2021-06-15
Company_name: Nestle - Sector: FOOD - Amount: 450.0 - Billing_date: 2020-06-12
Company_name: Microsoft - Sector: TECHNOLOGY - Amount: 3399.0 - Billing_date: 2022-04-30

Requests:
List of customers with the letter 'C' in it: [Name: Christiana02 - Registered_date: 2021-04-08 - Invoice: [Company_name: L'Oreal Paris - Sector: COSMETIC - Amount: 425.0 - Billing_date: 2021-06-15]]
The total amount of invoices of registered customers in June: 1750.0
List of invoices higher than the entered parameter value: [Company_name: Colin's - Sector: TEXTILE - Amount: 1750.0 - Billing_date: 2020-05-20, Company_name: Microsoft - Sector: TECHNOLOGY - Amount: 3399.0 - Billing_date: 2022-04-30]
Average of invoices higher than the entered parameter value: 2574.5
Names of customers with invoices less than the entered parameter value: [Christiana02, Alexander03]
Sector names whose average invoice for June is lower than the entered parameter value: [COSMETIC, FOOD]
```