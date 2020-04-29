"use strict"

// 2.	Given that an Employee IS-A person, applying JavaScript inheritance and the Object.create(…) method, create a generic object named, employee, with the following properties:
//      a.	Salary (initialize this with the value zero dollars
//      b.	hireDate (initialize this with the current date of today)

//      and the following method:

//      c.	doJob (should take as input parameter, a string representing the jobTitle of the employee and it prints-out to the console, the employee’s information in the following format:

//          “[Employee’s name] is a [jobTitle] who earns $[salary]”
//          e.g. Anna is a Programmer who earns $249,995.50 

// Create an employee named, Anna, set their salary to $249.995.50 and call the doJob() method, passing it the jobtitle, Programmer.

// Note the console output should be: Anna is a Programmer who earns $249,995.50

const person = {
    name: '',
    dateOfBirth: '',
    setName: newName => {
        this.name = newName;
    },
    getName: () => this.name
};     

const employee = Object.create(person);

employee.salary = 0;
employee.hireDate = new Date();

employee.doJob = jobTitle => {
    console.log(`${employee.getName()} is a ${jobTitle} who earns $${employee.salary.toLocaleString()}`);
};

employee.setName("Anna");
employee.salary = 249995.50;
employee.doJob("Programmer");
