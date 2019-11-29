import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { HelpComponent } from './help/help.component';
import { AboutComponent } from './about/about.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { NgIfComponent } from './data-bindings/ng-if/ng-if.component';
import { NgForComponent } from './data-bindings/ng-for/ng-for.component';
import { NgswitchComponent } from './data-bindings/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormsComponent } from './forms/forms.component';
import { Form1Component } from './forms/form1/form1.component';
import { Form2Component } from './forms/form2/form2.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import {HttpClientModule} from '@angular/common/http';
import { DollorPipe } from './dollor.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    HelpComponent,
    AboutComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    NgIfComponent,
    NgForComponent,
    NgswitchComponent,
    CustomDirective,
    RegisterComponent,
    FormsComponent,
    Form1Component,
    Form2Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollorPipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule . forRoot([
      {path : 'home' , component : HomeComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'about' , component : AboutComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'property-binding' , component : PropertyBindingComponent},
      {path : 'event-binding' , component : EventBindingComponent},
      {path : 'two-way' , component : TwoWayBindingComponent},
      {path : 'ng-if' , component : NgIfComponent},
      {path : 'ng-for' , component : NgForComponent},
      {path : 'ngswitch' , component : NgswitchComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'forms' , component : FormsComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      {path : 'reactive-form' , component : ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
