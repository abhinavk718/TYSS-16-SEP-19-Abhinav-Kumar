import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive ({
    // tslint:disable-next-line: directive-selector
    selector : '[custDir]'
})


export class CustomDirective {
    constructor(private e1: ElementRef) {
     this.e1.nativeElement.style.backgroundColor = 'red';
    }
    @HostBinding('style.backgroundColor') backgroundColor = 'yellow';
    @HostListener('mouseenter') m() {
        this.e1.nativeElement.style.backgroundColor = 'pink';
    }
    @HostListener('mouseleave') n() {
        this.e1.nativeElement.style.backgroundColor = 'orange';
    }
}
