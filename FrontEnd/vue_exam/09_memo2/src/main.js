import { createApp } from 'vue'
import App from './step6/App.vue'

import HeaderComponent from "./components/HeaderComponent"
import FooterComponent from "./components/FooterComponent"


const app = createApp(App)

app.component("HeaderComponent", HeaderComponent)
app.component("FooterComponent", FooterComponent)


app.mount('#app')
