import * as React from 'react';
import Counter from "./Counter";
import {createRoot} from 'react-dom/client';


const rootNode = document.getElementById('root');
const reactRoot = createRoot(rootNode!);

reactRoot.render(<Counter title="이건 Function Component의 Counter야(수정)" />); 