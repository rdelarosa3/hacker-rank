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

// Complete the getGrade(score) function in the editor. It has one parameter: an integer,
//  denoting the number of points Julia earned on an exam. 
//  It must return the letter corresponding to her  according to the following rules:


function readLine() {
    return inputString[currentLine++];
}

function getGrade(score) {
    let grade;
    // Write your code here
    switch(true) {
        case (score > 25):
            grade = 'A';
            break;
        case (score > 20):
            grade = 'B';
            break;
        case (score > 15):
            grade = 'C';
            break;
        case (score > 10):
            grade = 'D';
            break;
        case (score > 5):
            grade = 'E';
            break;
        default:
            grade = 'F';
        }
    return grade;
}


function main() {
    const score = +(readLine());
    
    console.log(getGrade(score));
}