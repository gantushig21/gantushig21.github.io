var make_adder = function(value) {
    var counter = 0;
    return function() {
        return counter += value;
    }
}

var add5 = make_adder(5);
add5();
add5();
add5();
console.log("After 4 times: ", add5());

var add7 = make_adder(7);
add7();
add7();
console.log("After 3 times: ", add7());
