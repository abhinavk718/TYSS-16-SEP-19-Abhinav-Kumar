import { Component } from '@angular/core';



@Component({
    selector : 'app-about',
    templateUrl : './about.component.html',
    styleUrls : ['./about.component.css']
})

export class AboutComponent {
    colorName = 'red';
    //  color = 'yellow';
    isActive = false;
constructor() {
    setInterval(() => {
      this.isActive = !this.isActive;
    }, 2000);
}
}
