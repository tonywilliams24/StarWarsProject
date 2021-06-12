from mysql.connector import connect

mydb = connect(
    host="localhost",
    user="root",
    password="notStrongRootPass"
)

mycursor = mydb.cursor()

mycursor.execute("SHOW DATABASES")

for x in mycursor:
    print(x)

