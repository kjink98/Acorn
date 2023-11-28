const log = {
    info: function(info){
        console.log("Info: " + info);
    },
    warning : function(warning) {
        console.log("warning: " + warning);
    },
    error : (error) => {
        console.log("error: " + error);
    }
};

module.exports = log; // default

// 상수 export
module.exports.A = 100;

exports.test1 = function(data){ // module은 생략 가능
    return "data";
}