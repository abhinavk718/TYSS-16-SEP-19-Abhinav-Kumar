import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      name : 'Mercedes-Benz E-Class',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png',
      model : 'Model : 1990',
      // tslint:disable-next-line: max-line-length
      description : 'The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer.Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.'
    },
    {
      name : 'Maruthi',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
      model : 'Model : 1945',
      // tslint:disable-next-line: max-line-length
      description : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      name : 'Suzuki',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/05/06/16/32/car-1376190__340.jpg',
      model : 'Model : 2000',
      // tslint:disable-next-line: max-line-length
      description : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      name : 'Lamborghini Aventador',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg',
      model : 'Model : 2005',
      // tslint:disable-next-line: max-line-length
      description : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
    },
    {
      name : 'BMW',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      model : 'Model : 2014',
      // tslint:disable-next-line: max-line-length
      description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      name : 'Lamborghini',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png',
      model : 'Model : 1999',
      // tslint:disable-next-line: max-line-length
      description : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
    },
    {
      name : 'Audi A3',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      model : 'Model : 2019',
      // tslint:disable-next-line: max-line-length
      description : 'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.'
    },
    {
      name : 'Ferrari 812 superfast',
      imgUrl : 'https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg',
      model : 'Model : 2009',
      // tslint:disable-next-line: max-line-length
      description : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    },
    {
      name : 'Bugatti La Voiture Noire',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/06/22/11/auto-2209439__340.png',
      model : 'Model : 2010',
      // tslint:disable-next-line: max-line-length
      description : 'The Bugatti La Voiture Noire is a one-off supercar based on the Chiron. Unveiled at the 2019 Geneva Motor Show, it joins the Divo as a derivative from the already famous Chiron hypercar. The La Voiture Noire is a modern reinterpretation of the Type 57 SC Atlantic from the 1930s.'
    },
    {
      name : 'Audi RS3',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/05/06/16/32/car-1376190__340.jpg',
      model : 'Model : 2007',
      // tslint:disable-next-line: max-line-length
      description : 'Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with Audi valvelift. Combined mpg.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
