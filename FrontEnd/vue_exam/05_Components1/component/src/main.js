import { createApp } from 'vue'
import App from './step4/App.vue'

import ListHeader from "./step2/components/ListHeader.vue"
import ListFooter from "./step2/components/ListFooter.vue"
import ListPage from "./step2/components/ListPage.vue"



const app = createApp(App);

// Global Component 등록
app.component("list-header", ListHeader);
app.component("list-footer", ListFooter);
app.component("list-page", ListPage);

//step4


app.mount('#app');
