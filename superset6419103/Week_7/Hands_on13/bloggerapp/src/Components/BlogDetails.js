import React from 'react';
function BlogDetails() {
  const blogs = [
    {
      title: 'React Learning',
      author: 'Hawking',
      description: 'Welcome for learning the React!',
    },
    {
      title: 'Make a MERN',
      author: 'Martin',
      description: 'You can master the MERN with Martin.',
    },
  ];
  return (
    <div className="column">
      <h2>Blog Details</h2>
      {blogs.map((blog, index) => (
        <div key={index}>
          <strong>{blog.title}</strong><br />
          <em>{blog.author}</em><br />
          {blog.description}
          <br /><br />
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
