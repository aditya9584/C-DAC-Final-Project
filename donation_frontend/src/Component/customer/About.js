import React from 'react';
import im1 from '../../images/manychildrenunsplash.jpg';

function About() {
  

  return (
    <div className="container">
      <hr className="mt-2 mb-3"/>
      <img src={im1} class="img-responsive"/>
        <p className="mx-auto w-75 p-3 overlay-text">
        <b>Let's Donate</b> is an online donation website. We have developed this platform to donate the essential things like Medicines, Books, Clothes etc to the needy people.
        This website is aimed to provide the essential things to NGO. That NGO can help needy people. Many poor people who do not afford to buy their own medicines, clothes etc. this website will help 
        these people to get the things which they required to cure their respective diseases and the unused medicine will be utilized in good way.
        </p>
      
    </div>
  );
}

export default About;
