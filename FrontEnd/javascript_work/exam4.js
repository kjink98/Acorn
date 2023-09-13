const formEl = document.querySelector("form");
const inputs = formEl.querySelectorAll("input");

// 1. ID를 입력 후 다음 양식으로 커서를 옮기면 입력한 ID를 자동으로 
// 대문자로 변경
const inputId = formEl.firstElementChild;

inputId.addEventListener("change", ev => {
    ev.target.value = ev.target.value.toUpperCase();
})


//  2. E-mail이 제대로 입력됐는지 체크.
// 잘못 입력됐을 경우 "올바르게 입력하세요" 라는 메시지 출력
const inputEmail = formEl.children[3];
const emailPattern = new RegExp('^[a-zA-Z0-9]+@[a-z]+\.[a-z]{2,3}$');

inputEmail.addEventListener("change", ev => {
    if (!emailPattern.test(ev.target.value)) {
        alert('올바르게 입력하세요');
    }
})

// 3. password에 반드시 4글자 이상 입력되도록 한다.
const inputPw = formEl.children[6];
const pwPattern = new RegExp('[a-zA-Z0-9]{4,}');

inputPw.addEventListener("change", ev => {
    if (!pwPattern.test(ev.target.value)) {
        alert('4글자 이상 입력하세요');
    }
})

// 4. 주민번호 뒷자리의 첫글자가 1 또는 3이면 남자 라디오박스에 체크되게 하고
//      2 또는 4이면 여자 라디오에 체크

const male = formEl.children[13];
const female = formEl.children[15];

const inputSsn1 = formEl.children[9];
const inputSsn2 = formEl.children[10];
inputSsn2.addEventListener("change", ev => {
    const firstNum = ev.target.value[0]
    if (firstNum === '1' || firstNum === '3') {
        male.checked = true;
    } else if (firstNum === '2' || firstNum === '4') {
        female.checked = true;
    }
})
// 5. 전송에서 각 항 공통으로 값을 입력하지 않으면 "반드시 값을 입력하세요" 
// 라는 메시지를 출력
const inputSubmit = document.getElementById("btnSubmit");
inputSubmit.addEventListener("click", ev => {
    if (!inputId.value) {
        alert("반드시 값을 입력하세요");
        ev.preventDefault;
        return;
    }

    if (!inputEmail.value) {
        alert("반드시 값을 입력하세요");
        ev.preventDefault;
        return;
    }

    if (!inputPw.value) {
        alert("반드시 값을 입력하세요");
        ev.preventDefault;
        return;
    }

    if (!inputSsn1.value) {
        alert("반드시 값을 입력하세요");
        ev.preventDefault;
        return;
    }
})
