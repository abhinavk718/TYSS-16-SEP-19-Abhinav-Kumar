import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { HeaderComponent } from './header/header.component';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { BikeComponent } from './bike/bike.component';
import { BikesComponent } from './bikes/bikes.component';
import { MovieComponent } from './movie/movie.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopComponent } from './laptop/laptop.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MobileComponent } from './mobile/mobile.component';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    ChildComponent,
    HeaderComponent,
    TechElevateComponent,
    HomeComponent,
    BikeComponent,
    BikesComponent,
    MovieComponent,
    MoviesComponent,
    LaptopComponent,
    LaptopsComponent,
    MobilesComponent,
    MobileComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'techelevate' , component: TechElevateComponent},
      {path : 'home' , component: HomeComponent},
      {path : 'car' , component: ParentComponent},
      {path : 'bike' , component: BikeComponent},
      {path : 'movie' , component: MovieComponent},
      {path : 'laptop' , component: LaptopComponent},
      {path : 'mobile' , component: MobileComponent}

    ])
  ],
providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
