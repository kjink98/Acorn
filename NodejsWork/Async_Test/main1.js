// ***** 콜백과 콜백 지옥 ***** //
const a = () => console.log(1);
const b = () => console.log(2);

// 동기(순서대로 출력)
// a();
// b();

// 비동기(순서가 다르게)
const a2 = () => {
    setTimeout(()=>{console.log(1)}, 1000)
}

// a2();
// b();

// 콜백 (순서대로)
const a3 = (callback) => {
    setTimeout(()=>{
        console.log(1);
        callback();
    }, 1000)
}

    // 비동기로 변경
const b2 = () => {
    setTimeout(() => {
        console.log(2)
    }, 1000);
}

// a3(()=>{b2()});

const c = () => {console.log(3);}

// c();


// 1->2->3 이 출력되도록
const b3 = (callback) => {
    setTimeout(() => {
        console.log(2),
        callback();
    }, 1000);
}

// a3(()=>{
//     b3(()=>{
//         c()
//     })
// });


const c2 = (callback) => {
    setTimeout(() => {
        console.log(3),
        callback();
    }, 1000);
}

const d = () => {
    setTimeout(() => {
        console.log(4)
    }, 1000);
}

// a3(()=>{
//     b3(()=>{
//         c2(()=>{
//             d()
//         })
//     })
// });

// *********** Promise ***********

const aa = () => {
    return new Promise((resolve)=>{
        setTimeout(() => {
            console.log(1),
            resolve();
        }, 1000);
    });
}

const bb = () => {
    return new Promise((resolve)=>{
        setTimeout(() => {
            console.log(2),
            resolve();
        }, 1000);
    });
}

const cc = () => {
    return new Promise((resolve)=>{
        setTimeout(() => {
            console.log(3),
            resolve();
        }, 1000);
    });
}

const dd = () => {
   console.log(4);
}
/*
aa().then(()=>{
    bb().then(()=>{
        cc().then(()=>{
            dd()
        })
    })
})
*/

/*
aa().then(()=>{
    return bb()
}).then(()=>{
    return cc()
}).then(()=>{
    return dd()
})
*/

/*
aa()
    .then(()=>bb())
    .then(()=>cc())
    .then(()=>dd())
*/

aa()
    .then(bb)
    .then(cc)
    .then(dd)
    .then(()=>console.log('done'))    
