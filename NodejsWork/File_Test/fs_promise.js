const fs = require("fs/promises");
const content = "Hello World!!!";

async function helloWorld(){
    try{
        await fs.writeFile(process.env.FILE_PATH, content);
        const data = await fs.readFile(process.env.FILE_PATH, "utf-8");
        console.log(data);
    } 
    catch(err){
        console.log(err);
    }
}

helloWorld();