// In the definition of add() shown in question 6, identify the "free" variable. In the context of a function closure, 
// what is a "free" variable? 

// var add = (function(){
//     let counter = 0;
//     return function() {
//         return counter =+ 1;
//     }
    
// })();


// ####### Answer #########
// counter is free variable
// Free variable is the variable that isn't declared in function as parameter nor locally, 
// it is the variable that is declared outside the function.