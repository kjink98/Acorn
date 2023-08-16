// MENU


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



// BADGE
const badgeE1 = document.querySelector('header .badges');

// throttle : 속도 조절
window.addEventListener('scroll', _.throttle(() => {
    // console.log(window.scrollY);
    if (window.scrollY > 500){
        gsap.to(badgeE1, .6, { opacity: 0, display: 'none' })
        // 상단으로 스크롤 버튼 보이기!
        gsap.to(toTopEl, .2, {
            x: 0
          })
    }
        // gsap.to(요소, 지속시간, 옵션)
        
    else {
        gsap.to(badgeE1, .6, { opacity: 1, display: 'block' })
        // 상단으로 스크롤 버튼 숨기기!
        gsap.to(toTopEl, .2, {
            x: 100
          })
    }
    // 0.3초 간격으로 함수를 호출하겠다.
}, 300))