import React from 'react';

function BookDetails() {
  const books = [
    { title: 'Master React', price: 700 },
    { title: 'Deep Dive into Angular 11', price: 800 },
    { title: 'MERN Essentials', price: 900 }
  ];

  return (
    <div className="column">
      <h2>Book Details</h2>
      {books.map((book, index) => (
        <div key={index}>

          <strong>{book.title} {book.index} {book.price}</strong><br />
          {book.price}
          <br /><br />
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
