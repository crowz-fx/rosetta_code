/**
 * Task - https://rosettacode.org/wiki/Arrays#Java 
 * 
 * @author Lui Crowie
 */
let blankArray = new Array();

let arrayWithSize = new Array(5);
console.log(arrayWithSize[2]); // will be undefined as no values assigned

let arrayWithInts = [ 1, 2, 3, 4, 5 ];
console.log(arrayWithInts[4]);

arrayWithInts.push(6);
console.log(arrayWithInts[5]); // only 4 declared above and the push = 5