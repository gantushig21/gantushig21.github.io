"use strict";

// 1.	Define a function max() that takes two numbers as arguments and returns the largest of them. 
//      Use the if-then-else construct available in Javascript.
function max(a, b) {
    return a > b ? a : b;
}

// 2.	Define a function maxOfThree() that takes three numbers as arguments and returns the largest of them.
function maxOfThree(a, b, c) {
    if (a >= b && a >= c)
        return a;

    if (b >= a && b >= c)
        return b;

    return c;
}

// 3.	Write a function isVowel() that takes a character (i.e. a string of length 1) and returns true if it is a vowel, false otherwise.
function isVowel(letter) {
    const vowels = ['a', 'e', 'i', 'o', 'u']

    return vowels.includes(letter.toLowerCase());
}

// 4.	Define a function sum() and a function multiply() that sums and multiplies (respectively) all the numbers in an input 
//      array of numbers. For example, sum([1,2,3,4]) should return 10, and multiply([1,2,3,4]) should return 24. 
//      Note/Hint: Do these using Imperative programming approach (i.e. for…loop or while…loop)
function sum(arr) {
    // let sum = 0;
    // for (let i = 0; i < arr.length; i++)
    //     sum += arr[i];

    // return sum;
    return arr.reduce((sum, element) => sum + element, 0);
}

function multiply(arr) {
    // let p = 1;
    // for (let i = 0; i < arr.length; i++)
    //     p *= arr[i];

    // return p;
    return arr.reduce((mult, element) => mult * element, 1);
}

// 5.	Define a function reverse() that computes the reversal of a string. For example, reverse("jag testar") 
//      should return the string "ratset gaj".
function reverse(str) {
    return str.split('').reverse().join('');
}

// 6.	Write a function findLongestWord() that takes an array of words and returns the length of the longest one.
function findLongestWord(words) {
    let len = 0;
    for (let i = 0; i < words.length; i++) {
        if (len < words[i].length)
            len = words[i].length;
    }

    return len;
}

// 7.   Write a function filterLongWords() that takes an array of words and an integer i and returns a new 
//      array containing only those words that were longer than i characters

function filterLongWords(words, limit) {
    const arr = [];
    for (let i = 0; i < words.length; i++) {
        if (words[i].length > limit)
            arr.push(words[i]);
    }
    return arr;
}

// 8.	Write a function named, computeSumOfSquares, that takes as input, an array of numbers and calculates 
//     and returns the sum of the squares of each number in the input array. E.g. computeSumOfSquares([1,2,3]) 
//     should be computed as 1^2 + 2^2 +3^2 = 14. Note: Write your Javascript code without using Imperative 
//     programming. i.e. Do NOT use any explicit looping construct; instead use functional programming 
//     style/approach.
function computeSumOfSquares(arr) {
    return arr.reduce((sum, element) => sum + element * element, 0);
}

// 9.	Write a function named, printOddNumbersOnly, that takes as input, an array of integral numbers and 
//     it finds and prints only the numbers which are odd.
function printOddNumbersOnly(arr) {
    arr = arr.filter(e => e % 2 == 1);

    console.log(`\tAnswer: `, arr, '\n');
}

// 10.	Write a function named, computeSumOfSquaresOfEvensOnly, that takes as input, an array of integral 
//     numbers and calculates and returns the sum of the squares of only the even numbers in the input 
//     array. E.g. computeSumOfSquaresOfEvensOnly ([1,2,3,4,5]) should be computed as 2^2 +4^2 = 20.

function computeSumOfSquaresOfEvensOnly(arr) {
    return arr.filter(e => e % 2 == 0)
                .reduce((sum, e) => sum + e * e, 0);
}

// 11.	Using the Array.reduce(…) function, re-implement your functions, sum(…) and multiply(…) 
//     (defined in Problem 4 above) without using Imperative programming. i.e. Do NOT use any explicit 
//     looping construct; instead use functional programming style/approach. 
//     DONE

// 12.	Implement Javascript code for a function named, findSecondBiggest, which takes as input, an array of 
//     numbers and finds and returns the second biggest of the numbers. For example, findSecondBiggest([1,2,3,4,5]) 
//     should return 4. And findSecondBiggest([19,9,11,0,12]) should return 12. (Note: Do not use sorting!)
function findSecondBiggest(arr) {
    if (arr.length < 1)
        return null;

    let first = arr[0];
    let second = null;
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] >= first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second) {
            second = arr[i];
        }
    }

    return second;
}

// 13.	Write a function named printFibo, that takes as input, a given length, n, and any two starting numbers a and b, 
//     and it prints-out the Fibonacci sequence, e.g. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of the given length, beginning 
//     with a and b. (e.g. printFibo(n=1, a=0, b=1), prints-out: "0", as output; printFibo(n=2, a=0, b=1), prints-out: "0, 1", as 
//     output; printFibo(n=3, a=0, b=1), prints-out: "0, 1, 1", as output; printFibo(n=6, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5", as 
//     output; and printFibo(n=10, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34", as output).
function printFibo(n, a, b) {
    if (n == 1) {
        console.log(`\tAnswer: `, a, '\n');
        return;
    }

    const arr = [a, b]
    for (let i = 2; i < n; i++)
        arr.push(arr[i - 2] + arr[i - 1]);

    console.log(`\tAnswer: `, arr, '\n');
}


const a1 = 101, b1 = 456;
console.log(`1. Find max of two elements [${a1}, ${b1}]: `);
console.log(`\tAnswer: `, max(a1, b1), '\n');

const a2 = 45, b2 = 23, c2 = 81;
console.log(`2. Find max of three elements [${a2}, ${b2}, ${c2}]: `);
console.log(`\tAnswer: `, maxOfThree(a2, b2, c2), '\n');

const  a3 = 'A';
console.log(`3. Check letter if it is a vowel: '${a3}'`);
console.log(`\tAnswer: `, isVowel(a3), '\n');

const arr = [2, 3, 4, 5];
console.log(`4. Sum and multiply of these elements [${arr}]:`);
console.log("\tSum: ", sum(arr));
console.log("\tMultiply: ", multiply(arr), '\n');

const s5 = "Hello World";
console.log(`5. Reversal of the string ${s5}:`);
console.log(`\tAnswer: `, reverse(s5), '\n');

const words6 = ["I", "love", "coding", "javascript", "is", "more", "fun"];
console.log(`6. Longest word of string array [${words6}]:`);
console.log(`\tAnswer: `, findLongestWord(words6), '\n');

const words7 = ["I", "love", "coding", "javascript", "is", "more", "fun"];
const i7 = 4;
console.log(`7. Filter words in [${words7}] that are longer than ${i7} length:`);
console.log(`\tAnswer: `, filterLongWords(words7, i7), '\n');

const arr8 = [1, 2, 3];
console.log(`8. Sum of squares in [${arr8}]:`);
console.log(`\tAnswer: `, computeSumOfSquares(arr8), '\n');

const arr9 = [4, 11, 5, 91, 8, 4, 101];
console.log(`9. Print odd numbers of [${arr9}]:`);
printOddNumbersOnly(arr9);

const arr10 = [1, 2, 3, 4, 5];
console.log(`10. Sum of the squares of only the even numbers in [${arr10}]:`);
console.log(`\tAnswer: `, computeSumOfSquaresOfEvensOnly(arr10), '\n');

const arr12 = [19, 9, 11, 0, 12];
console.log(`12. Find second biggest of array [${arr12}]: `);
console.log(`\tAnswer: `, findSecondBiggest(arr12), '\n');

const n13 = 10, a13 = 0, b13 = 1;
console.log(`13. Print fibonacci (${n13}, ${a13}, ${b13}): `);
printFibo(n13, a13, b13);

