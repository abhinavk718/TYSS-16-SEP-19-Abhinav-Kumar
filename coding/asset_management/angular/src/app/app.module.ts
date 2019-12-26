import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { UpdateAssetComponent } from './update-asset/update-asset.component';
import { ManagerLoginComponent } from './manager-login/manager-login.component';
import { AddassetComponent } from './addasset/addasset.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { RegisterComponent } from './register/register.component';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { ManagerComponent } from './manager/manager.component';
import { GetDataComponent } from './get-data/get-data.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    UpdateAssetComponent,
    ManagerLoginComponent,
    AddassetComponent,
    AddEmployeeComponent,
    RegisterComponent,
    HomeComponent,
    AdminComponent,
    UserComponent,
    ManagerComponent,
    GetDataComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'add-asset', component: AddassetComponent},
      {path: 'manager-login', component: ManagerLoginComponent},
      {path: 'update-asset', component: UpdateAssetComponent},
      {path: 'add-employee' , component: AddEmployeeComponent},
      {path: 'register', component: RegisterComponent},
      {path: 'home', component: HomeComponent},
      {path: 'admin', component: AdminComponent},
      {path: 'user', component: UserComponent},
      {path: 'manager', component: ManagerComponent},
      {path: 'get-data', component: GetDataComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
