##Scala Training Exercises
1. Define a Class
2. Define class Parameters
   - Add a class parameter to Train
     - Use number as name
     - Use Int as type
   - Quit and restart the REPL
   - First try to create a Train like before, without arguments
   - Then create a Train with an appropriate argument
3. Promote Class Parameters I
   - Create a Train in the REPL and try to access number
   - Add (prepend) a kind parameter of type String to Train
   - Promote both parameters of Train to immutable fields
   - Create a Train in the REPL and access kind and number
4. Promote Class Parameters II
   - Create a Time class
     - Add promoted hours and minutes class parameters of type Int
     - Add a "TODO" comment: Verify that Hours is within 0 and 23
     - Add a "TODO" comment: Verify that Minutes is within 0 and 59
5. Define a Field
   - Add an immutable asMinutes field to Time
     - Use Int for the type
     - Initialize it with hours multiplied by 60 plus minutes
   - Create a Time in the REPL and access asMinutes
6. Define a Method
   - Add a minus method to 
      - Add a that parameter of type Time
      - Use Int for the return type
      - Calculate the difference between the two Times in minutes
   - Call the method in the REPL
7. Define an Operator
    - Add a - method to Time
    - Make it an alias of minus, i.e. delegate to minus
    - Call the - operator in the REPL
    - Also call the minus method in infix operator
8. 