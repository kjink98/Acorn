const searchE1 = document.querySelector('.search');
const searchInputEl = document.querySelector('input');

// 돋보기 아이콘 눌러서 검색이 가능하게 구현
searchE1.addEventListener('click',() =>{
    searchInputEl.focus();
})

// 돋보기 아이콘 누르면 통합검색 placeholder 속성 추가
searchInputEl.addEventListener("focus", () => {
    // input focus가 됐으면 focused라는 클래스 추가
    searchE1.classList.add('focused')
    searchInputEl.setAttribute("placeholder", "통합 검색");
})

// focus를 잃으면 focused 해제
searchInputEl.addEventListener("blur", ()=>{
    searchE1.classList.remove('focused')
    searchInputEl.setAttribute("placeholder", "")
})