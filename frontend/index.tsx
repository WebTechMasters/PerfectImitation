import React from 'react';
import ReactDom from 'react-dom'
window.addEventListener('load', () => {
    console.log('리액트 스크립트 로드됨');
    const root = document.getElementById('root');
    ReactDom.render(<p> hello World</p>, root);
});