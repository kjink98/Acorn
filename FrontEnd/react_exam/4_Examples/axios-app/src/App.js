import logo from './logo.svg';
import './App.css';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [posts, setPosts] = React.useState([]);

  useEffect(() => {
    //   axios({
    //     url: 'https://jsonplaceholder.typicode.com/posts', // 통신할 웹문서
    //     method: 'get' // 통신할 방식
    //   }).then(response => setPosts(response.data))
    // });
      axios.get('https://jsonplaceholder.typicode.com/photos')
      .then(response => setPosts(response.data))
    })
  //   try {
  //     const response = await axios.get('https://jsonplaceholder.typicode.com/photos')
  //     setPosts(response.data)
  //   } catch(error) {
  //      console.log(error)
  //   } 
  // })

  return (
    <div className="App">
      <h1>posts</h1>
      <ul>
        {posts.map(post => (
          <li key={post.id}>
            <div>{post.title}</div>
            <div><img src={post.thumbnailUrl} /></div>
            </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
