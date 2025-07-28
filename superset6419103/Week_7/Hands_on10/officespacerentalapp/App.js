import React from "react";

function App(){

  const heading = <h1> Office space rental details</h1> ;

  const office = {
    name: "Cognizant",
    rent : 60000,
    address: "Chennai",
    image : "Cognizant_image_source.jpg"
  };

  const rentStyle = {
    color: office.rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold',
    fontSize: '18px'
  };

   const officeList = [
    {
      name: "Cognizant",
      rent: 60000,
      address: "Chennai"
    },
    {
      name: "Accenture",
      rent: 62000,
      address: "MG Road, Bengaluru"
    },
    {
      name: "Wipro",
      rent: 48000,
      address: "Cyber Towers, Hyderabad"
    }
  ];
   return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}

      
      <div style={{ border: '1px solid gray', padding: '10px', marginBottom: '20px' }}>
        <img src={office.image} alt="Office" style={{ width: '250px' }} />
        <p><strong>Name:</strong> {office.name}</p>
        <p><strong>Address:</strong> {office.address}</p>
        <p><strong>Rent:</strong> <span style={rentStyle}>₹{office.rent}</span></p>
      </div>

      
      <h2>All Office Listings</h2>
      {officeList.map((o, index) => {
        const dynamicStyle = {
          color: o.rent < 60000 ? 'red' : 'green',
          fontWeight: 'bold'
        };

        return (
          <div key={index} style={{ marginBottom: '15px', padding: '10px', border: '1px solid lightgray' }}>
            <p><strong>Name:</strong> {o.name}</p>
            <p><strong>Address:</strong> {o.address}</p>
            <p><strong>Rent:</strong> <span style={dynamicStyle}>₹{o.rent}</span></p>
          </div>
        );
      })}
    </div>
  );
}

export default App;
  


