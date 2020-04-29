"use strict"

// 3.	Re-write the person object specification described in Question 1 above, but this time, using a Constructor Function named, Person. 
//      Then, add a method named, toString() to the person object, which return the string representation of the person object data in the format:

// {Name: John, DateOfBirth: 1998-12-10}

// Using your constructor function for the person object, create a person named, Peter, whose date of birth is November 10, 1985.

// Print-out to the console, the information for the person named, Peter, using its toString() method. 

function Person(name, dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
}

Person.prototype.toString = function() {
    return `{Name: ${this.name}, DateOfBirth: ${getFormattedDate(this.dateOfBirth)}}`;
}

const peter = new Person('Peter', new Date(1985, 10, 10));
console.log(peter.toString());

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