# codingguru

## Smallest Negative Balance

You are working on new application for recording debts. This program allows users to create groups that show all records of debts between the group members. Give the group debt records(including the borrower name, lender name and debt amout). who in the group has the smallest negative balance?

### Notes :-

- -10 is smaller than -1
- If multipel people have the smallest negative balance, return the list in alphabetical order.
- If nobody has negative balance, return the string array ["Nobody has a negative balance"].

Example 
n = 6

debts = ['Alex Blake 2', 'Blake Alex 2', 'Casey Alex 5'. ' Blake Casey 7', 'Alex Blake 4', 'Alex Casey 4']

There are 6 debt records as shown in the table below:

| borrower    | Lender      | amount |
| ----------- | ----------- | -------|
| Alex        | Blake       | 2      |
| Blake       | Alex        | 2      |
| Casey       | Alex        | 5      |
| Blake       | Casey       | 7      |
| Alex        | Blake       | 4      |
| Alex        | Casey       | 4      |


- The first, fifth, and sixth entries decrease Alex's balance because Alex is a borrower. The second and third entries increase it because Alex is a lender. Alex's balance is (2+5)-(2+4+4)=7-10=-3.
- Blake is a lender in the first and fifth entries and a borrower in the second and fourth entries. Thus, Blake's balance is (2+4)-(2+7) = 6-9 = -3
- Casey is a lender in the fourth and sixth entries, and a borrower in the third entry. Thus, Casey's balance is (7+4)-5=6.
