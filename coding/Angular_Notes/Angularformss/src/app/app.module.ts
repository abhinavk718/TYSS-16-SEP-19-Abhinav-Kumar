import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TemplatedrivenformComponent } from './templateform/templatedrivenform/templatedrivenform.component';
import { Form1Component } from './templateform/form1/form1.component';
import { Form2Component } from './templateform/form2/form2.component';
import { RouterModule } from '@angular/router';
import { ReactiveformComponent } from './reactiveforms/reactiveform/reactiveform.component';
import { Form3Component } from './reactiveforms/form3/form3.component';
import { Form4Component } from './reactiveforms/form4/form4.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TemplatedrivenformComponent,
    Form1Component,
    Form2Component,
    ReactiveformComponent,
    Form3Component,
    Form4Component,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
     {path: 'templateform', component: TemplatedrivenformComponent},
     {path: 'form1', component: Form1Component},
     {path: 'form2', component: Form2Component},
     {path: 'reactiveform', component: ReactiveformComponent},
     {path: 'form3', component: Form3Component},
     {path: 'form4', component: Form4Component},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
