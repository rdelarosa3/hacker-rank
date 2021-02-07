'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
/*
 * Task
 * Implement a function named factorial that has one parameter: an integer, . 
 * It must return the value of  (i.e.,  factorial).
 */
const factorial = (n) =>{
    for(let i=n-1;i>0;i--){
       n *= i; 
    }
    return n;
}

function main() {
    const n = +(readLine());
    
    console.log(factorial(n));
}