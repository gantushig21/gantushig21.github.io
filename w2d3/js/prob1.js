"use strict"

// 1.	Define a JavaScript object literal named, person, with the following specification:
//      a.	Person object should have the properties:
//          i.	name (initialize this with empty string value)
//          ii.	dateOfBirth (initialize this with empty string value)
//      b.	Person object should have the methods:
//          i.	getName (should return the value of the person’s name property)
//          ii.	setName (should take as input parameter, a String value which it sets as the person’s name) 

// Given that someone named John IS-A person, applying JavaScript inheritance and the Object.create(…) method, create an object named, john, whose name property is set to the string, “John” and whose dateOfBirth property is set to the date, December 10th, 1998.

// Print-out to the console, the information about the person named John, in the following format:
// “The person’s name is John”
// “John was born on 1998-12-10”


function getFormattedDate(date) {
    let day = date.getDate();
    if (day < 10)
        day = '0' + day;

    let month = date.getMonth() + 1;
    if (month < 10)
        month = '0' + month;

    const year = date.getFullYear();

    return `${year}-${month}-${day}`;
}

const person = {
    name: '',
    dateOfBirth: '',
    setName: newName => {
        this.name = newName;
    },
    getName: () => this.name
};      

const john = Object.create(person);
john.setName("John");
john.dateOfBirth = new Date(1998, 11, 10);

console.log(`The person's name is ${john.getName()}\n${john.getName()} was born on ${getFormattedDate(john.dateOfBirth)}`);