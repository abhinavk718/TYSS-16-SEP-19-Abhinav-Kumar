import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
  selectedMobile;
  Mobiles = [
    {
      name : 'Samsung S6 Edge',
      price : 'Rs : 23000',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Asus Zenfone 5',
      price : 'Rs : 14999',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/09/09/11/cell-phone-1245663__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'Samsung galaxy s5',
      price : 'Rs : 35999',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/20/08/33/camera-1842202__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
    },
    {
      name : 'Iphone 5',
      price : 'Rs : 41999',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/23/21/23/iphone-6-458159__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Iphone 5 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.'
    },
    {
      name : 'IPhone 4',
      price : 'Rs : 24999',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/22/15/56/mobile-phone-2000081__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
    },
    {
      name : 'Moto G2',
      price : 'Rs : 23000',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/28/14/38/ux-787980__340.jpg',
      // tslint:disable-next-line: max-line-length
      description : 'Motorola Mobile 2nd Generation X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }
  displayMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }
}
