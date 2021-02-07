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

// Task

// Complete the getLetter(s) function in the editor. It has one parameter: a string, , consisting of lowercase English alphabetic letters (i.e., a through z). It must return A, B, C, or D depending on the following criteria:

// If the first character in string  is in the set , then return A.
// If the first character in string  is in the set , then return B.
// If the first character in string  is in the set , then return C.
// If the first character in string  is in the set , then return D.
// Hint: You can get the letter at some index  in  using the syntax s[i] or s.charAt(i).

function readLine() {
    return inputString[currentLine++];
}

function getLetter(s) {
    let letter;
    // Write your code here
    const arr1 = ['a','e','i','o','u'];
    const arr2 = ['b','c','d','e','f'];
    const arr3 = ['h','j','k','l','m'];
    s = s.charAt(0);
    switch(true) {
        case (arr1.includes(s)):
            letter = 'A';
            break;
        case (arr2.includes(s)):
            letter = 'B';
            break;
        case (arr3.includes(s)):
            letter = 'C';
            break;
    
        default:
            letter = 'D';
        }
    return letter;
}


function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}