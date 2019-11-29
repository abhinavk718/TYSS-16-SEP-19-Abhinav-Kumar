import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  selectedBike;
  bikes = [
    {
      name : 'Pulsar',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/05/10/06/26/rs200-4192863__340.jpg',
      model : 'Model : 2012',
      // tslint:disable-next-line: max-line-length
      description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      name : 'Yamaha',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      model : 'Model:2002',
      // tslint:disable-next-line: max-line-length
      description : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
    },
    {
      name : 'Kawaski',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
      model : 'Model:1997',
      // tslint:disable-next-line: max-line-length
      description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      name : 'Rajdoot',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      model : '1995',
      // tslint:disable-next-line: max-line-length
      description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      name : 'RE Interceptor',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
      model : 'Model:2013',
      // tslint:disable-next-line: max-line-length
      description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      name : 'Audi',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/15/14/38/couple-768607__340.jpg',
      model : 'Model:2019',
      // tslint:disable-next-line: max-line-length
      description : 'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.'
    },
    {
      name : 'RE Classic 350',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      model : 'Model : 2014',
      // tslint:disable-next-line: max-line-length
      description : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    },
    {
      name : 'Bajaj',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/17/14/34/vespa-4344085__340.png',
      model : 'Model:1989',
      // tslint:disable-next-line: max-line-length
      description : 'The Bugatti La Voiture Noire is a one-off supercar based on the Chiron. Unveiled at the 2019 Geneva Motor Show, it joins the Divo as a derivative from the already famous Chiron hypercar. The La Voiture Noire is a modern reinterpretation of the Type 57 SC Atlantic from the 1930s.'
    },
    {
      name : 'Gixer SF',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/13/05/05/motorcycle-racer-597913__340.jpg',
      model : 'Model:2015',
      // tslint:disable-next-line: max-line-length
      description : 'Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with Audi valvelift. Combined mpg.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }
  displayBike(motor) {
    console.log(motor);
    this.selectedBike = motor;
  }

}
