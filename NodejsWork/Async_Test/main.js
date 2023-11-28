// console.log(1);
// setTimeout(()=>{console.log(2)}, 1000);
// console.log(3);
// ******************************************************
// const btnEl = document.querySelector("h1")
// btnEl.addEventListener("click", ()=>{
//     console.log("Clicked!");
// });

// console.log("Hello World");

// ******************************
/*
const getMovies = (movieName, callback) => {
    fetch(`https://www.omdbapi.com/?apikey=7035c60c&s=${movieName}`)
        .then(res => res.json())
        .then(res => {
            console.log(res);
            callback();
        })
    }
    */
    // 비동기(실행 순서가 매 번 달라짐)
    /*
    getMovies('frozen', ()=>{
        console.log("겨울 왕국");
        getMovies('avengers', ()=>{
            console.log("어벤저스");
            getMovies('avatar', ()=>{
                console.log("아바타");
            });
        });
    });
    */

// promise
const getMovies = (movieName, callback) => {
    return new Promise(resolve => {
        fetch(`https://www.omdbapi.com/?apikey=7035c60c&s=${movieName}`)
            .then(res => res.json())
            .then(res => {
                console.log(res);
                callback();
            })
    });
}


    


    
