import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  selectedLaptop;
  Laptops = [
    {
      name : 'Asus ROG Gaming',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/24/14/29/mac-459196__340.jpg',
      price : 'Price : 53000 ',
      // tslint:disable-next-line: max-line-length
      description : 'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'HP Pavillion',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/04/20/13/17/work-731198__340.jpg',
      price : 'Price : 40000 ',
      // tslint:disable-next-line: max-line-length
      description : 'HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
    },
    {
      name : 'Dell Vostro',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/12/30/11/55/office-583841__340.jpg',
      price : 'Price : 34000',
      // tslint:disable-next-line: max-line-length
      description : 'Dell 15 7000 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.'
    },
    {
      name : 'Apple Macbook air',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/23/14/37/apple-1853259__340.jpg',
      price : 'Price : 59999 ',
      // tslint:disable-next-line: max-line-length
      description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
    },
    {
      name : 'Toshiba',
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/58/laptop-154091__340.png',
      price : 'Price : 60000',
      // tslint:disable-next-line: max-line-length
      description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
    },
    {
      name : 'Acer',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/03/26/10/41/apple-691798__340.jpg',
      price : 'Price : 44000 ',
      // tslint:disable-next-line: max-line-length
      description : 'Comes W/ Infinity Edge IPS Display. Laptops W/ Intel® Core™ Processor, Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, Accidental Damage Service.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }
  displayLaptop(laptop) {
    console.log(laptop);
    this.selectedLaptop = laptop;
  }

}
