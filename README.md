# Coursera203
Rotating Fan

HTML code:

<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="Fan.css">
        <title>Standing Fan</title>
        <meta charset="utf-8">
        <meta name="viewport" width="device-width, initial-scale=1.0"> 
        <meta http-equiv="X-UA-Compatible" content="IE-edge"/>
    </head>
    <body>
<div class="container">
    <div class="main-content">
    <p class="text">Enya</p>
   </div>
   <div class="centre-content">
       <p class="fashion">Unlimited View: Buy Your Ladies Wears and Accesories Now!</p>
   </div>
   <div class="last-content">
       <button type="button" class="pay-now-btn">
           Apply Coupons
       </button>
       <button type="button" class="pay-now-btn">
           Pay with Netbanking
       </button>
       <button type="button" class="pay-now-btn">
           Netbanking Options
       </button>
   </div>
   <div class="card-details">
       <p>Pay using Credit or Debit card</p>
       <div class="card-number">
           <label>Card Number</label>
           <input type="text" class="card-number-field" placeholder="###-###-###"/>
       </div>
       <br>
       <div class="date-number">
           <label>Expiry Date</label>
           <input type="text" class="date-number-field" placeholder="DD-MM-YY">
       </div>
       <div class="cvv-number">
           <label>CVV Number</label>
           <input type="text" class="cvv-number" placeholder="xxx">
       </div>
       <div class="nameholder-number">
           <label>Card Holder Name</label>
           <input type="text" class="card-name-field" placeholder="Enter your Name">
       </div>
       <button type="submit" class="submit-now-btn">
           Submit
       </button>
   </div>
</div>
   </body>
   </html>

CSS code:

*{
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
body{
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  font-weight: bold;
}
.container{
  height: 900px;
  width: 400px;
  background-image: linear-gradient(#b91c58, #bd254b);
  top: 50px;
  left: 50px;
  position: absolute;
  transform: translate(-50%, -50%);
  border-bottom-right-radius: 150px;
  border-bottom-left-radius: 180px;
}

.text{
  text-align: center;
  font-size: 300%;
  text-decoration: aliceblue;
  color: aliceblue;
}

.centre-content{
  height: 180px;
  margin: -70px 30px 20px;
  color: aliceblue;
  text-align: center;
  font-size: 20px;
  border-radius: 25px;
  padding-top: 0.5px;
  background-image: -moz-linear-gradient(#b91c58, #bd254b);
}

.centre-content-h1{
  padding-top: 30px;
  padding-bottom: 30px;
  font-weight: normal;
}

.price{
  font-size: 60px;
  margin-left: 5px;
  bottom: 15px;
  position: relative;
}

.pay-now-btn{
  cursor: pointer;
  color: #fff;
  height: 50px;
  width: 290px;
  border: none;
  margin: 5px 30px;
  background-color: rgb(223, 43, 112);
  position: relative;
}
