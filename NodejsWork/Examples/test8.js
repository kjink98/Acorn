const fs = require('fs');

fs.readFile('stdin.txt', 'utf8', (err, data) => {
  if(err) {
    console.error(err);
    return;
  }
  
  const numbers = data.split('\n').map(Number);
  const result = numbers[0] * numbers[1] * numbers[2];
  const resultStr = result.toString();
  let frequency = Array(10).fill(0);
  
  for(let i = 0; i < resultStr.length; i++) {
    frequency[resultStr[i]]++;
  }
  
  frequency.forEach((num) => {
    console.log(num);
  });
});
