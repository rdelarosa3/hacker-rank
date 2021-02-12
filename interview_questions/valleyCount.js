'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

function countingValleys(steps, path) {
    // Write your code here
    let atSeaLevel = true;
    let inMountain = false;
    let inValley = false;
    let valleyCount = 0;

    let shadowSteps = steps;
    [...path].forEach( (p) =>{
        p == 'U' ? shadowSteps++ : shadowSteps-- ;
        if( shadowSteps == steps){
            atSeaLevel = true;
            inMountain = false;
            if(inValley){
                inValley = false;
                valleyCount ++;
            }
        }
        else if (shadowSteps > steps){
           atSeaLevel = false;
           inMountain = true;
        }
        else if(shadowSteps < steps){
           atSeaLevel = false;
           inValley= true;
        }
    })
    return valleyCount;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const steps = parseInt(readLine().trim(), 10);

    const path = readLine();

    const result = countingValleys(steps, path);

    ws.write(result + '\n');

    ws.end();
}
