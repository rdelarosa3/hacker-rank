'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}


// Converts a base 10 number as an interger to base2 and gets the max amount of consecutive 1's
function main() {
    let base10 = parseInt(readLine(), 10); // get users input
    let base2Arr = []; // list to save binary numbers

    // keeps dividing base10 by 2 and pushes remainder to list
    while (base10 >= 1){
        base2Arr.push(base10%2);
        base10 = Math.floor(base10/2);
    }

    // loops through the array and updates vars respectively 
    let maxC = 0;
    let currectC = 0;
    for (let i of base2Arr){
        i == 1 ? currectC++ : currectC = 0; // resets the count if not 1
        if(currectC > maxC) maxC = currectC; // updates the max count if current count is greater
    }
    console.log(maxC);// returns consecutive max count
        
}
