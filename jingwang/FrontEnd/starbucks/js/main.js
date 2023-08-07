const searchEl = document.querySelector('.search');
const searchInputEl = document.querySelector('input');

// 돋보기 아이콘 눌러도 검색이 되게 구현
searchEl.addEventListener('click',()=>{
    searchInputEl.focus();
});

searchInputEl.addEventListener("focus",()=>{
    // input에 focus가 됐으면 focused라는 클래스 추가
    searchEl.classList.add('focused')
    // 통합검색 placeholder 속성 추가
    searchInputEl.setAttribute("placeholder", "통합 검색");
});

// focus를 잃었을 때
searchInputEl.addEventListener("blur",()=>{
    // input에 focus가 사라지면 focused라는 클래스 제거
    searchEl.classList.remove('focused')
    // 통합검색 placeholder 속성 제거
    searchInputEl.setAttribute("placeholder", "");
});