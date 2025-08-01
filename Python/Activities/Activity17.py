	
import pandas as pd

data = {
  "Usernames": ["admin1", "Test", "New"],
  "Passwords": ["password2", "Sample1", "Any"]
}

dataframe = pd.DataFrame(data)
print(dataframe)
dataframe.to_csv("sample.csv", index=False)