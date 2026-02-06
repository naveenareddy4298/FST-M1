import pandas as pd


data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}


df = pd.DataFrame(data)

# Write to CSV file
df.to_csv("users.csv", index=False)

print("CSV file 'users.csv' has been created successfully.")