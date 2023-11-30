const express = require("express");
const usersRouter = require("./routes/users.routes");
const postsRouter = require("./routes/posts.routes");

// constants
const PORT = 4000;
const HOST = "0.0.0.0";

const app = express();

app.use((req, res, next)=>{
    const start = Date.now();
    console.log(`start : ${req.method} ${req.url}`);
    next();

    const diffTime = Date.now() - start;
    console.log(`end : ${req.method} ${req.url} ${diffTime}ms`);
})

app.use(express.json())

app.use("/static", express.static());

app.use("/users", usersRouter);
app.use("/posts", postsRouter);

app.get("/", (req, res)=>{
    res.send("<h1>Hello World~~</h1>");
});


app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);