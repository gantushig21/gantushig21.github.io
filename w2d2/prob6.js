"use strict"

var count = (function() {
    var counter = 0;
    return {
        add: function() {
            return counter += 1;
        },
        reset: function() {
            return counter = 0;
        }
    }
})();

console.log("1st ");
console.log("\tAdd: ", count.add());
console.log("\tAdd: ", count.add());
console.log("\tReset: ", count.reset());
console.log("\tAdd: ", count.add());

// Revealing module pattern
const countRMP = (function() {
    let counter = 0;
    function changeBy(value) {
        counter += value;
    }
    function reset() {
        counter = 0;
    }

    return {
        add: () => changeBy(1),
        reset: () => reset(),
        getCounter: () => counter
    }
})();

console.log("\n2nd");
countRMP.add();
countRMP.add();
countRMP.add();
console.log("\tCounter after calling add 3 times: ", countRMP.getCounter());
countRMP.reset();
console.log("\tCounter after reset: ", countRMP.getCounter());

// Module factory
const countMF = function() {
    let counter = 0;

    function changeBy(value) {
        counter += value;
    }
    function reset() {
        counter = 0;
    }

    return {
        add: () => changeBy(1),
        reset: () => reset(),
        getCounter: () => counter
    }
}

console.log("\n3rd");

const mf1 = countMF();
for (let i = 0; i < 15; i++)
    mf1.add();

console.log("\tAfter calling add 15 times: ", mf1.getCounter());
mf1.reset();
console.log("\tAfter reset: ", mf1.getCounter());

