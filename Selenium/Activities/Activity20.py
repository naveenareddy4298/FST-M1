import pandas as pd

df = pd.read_excel("data.xlsx")
rows, columns = df.shape
print("Number of rows:", rows)
print("Number of columns:", columns)

print("\n-----------------------------\n")
print("Emails column data:")
print(df["Emails"])

print("\n-----------------------------\n")
sorted_df = df.sort_values(by="FirstName", ascending=True)

print("Data sorted by FirstName (Ascending Order):")
print(sorted_df)
