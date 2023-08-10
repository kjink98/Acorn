// Youtube IFrame API를 비동기로 로드합니다.
let tag = document.createElement('script');

{/* <script src="https://www.youtube.com/iframe_api"></script> */}
tag.src = "https://www.youtube.com/iframe_api";
let firstScriptTag = document.getElementsByTagName('script')[0];
firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
// 3. This function creates an <iframe> (and YouTube player)
//    after the API code downloads.
let player;
function onYouTubeIframeAPIReady() {
    // <div id="player"></div> 에 접근
    // https://www.youtube.com/watch?v=An6LvWQuj_8
    player = new YT.Player('player', {
        height: '360',
        width: '640',
        videoId: 'An6LvWQuj_8', // 최초 재생할 유튜브 영상 ID
        // 동영상 제어 정보

        // https://developers.google.com/youtube/player_parameters.html?playerVersion=HTML5&hl=ko#Parameters : 지원되는 매개변수
        playerVars:{
            autoplay: true,
            loop: true,
            playlist: 'An6LvWQuj_8'
        },
        events: {
            'onReady': function(ev){
                ev.target.mute(); // 소리 묵음
            }
        }
    });
}