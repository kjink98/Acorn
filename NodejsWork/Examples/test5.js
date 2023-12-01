const fs = require('fs');
const readline = require('readline');

const readInterface = readline.createInterface({
    input: fs.createReadStream('customer.txt')
});

let lineCount = 1;

readInterface.on('line', (line) => {
    console.log(`한 줄 읽음 : ${line}`);
    const name = line.split(' ')[0];
    console.log(`#${lineCount} -> ${name}`);
    lineCount++;
});

readInterface.on('close', () => {
    console.log('파일을 모두 읽음.');
});
