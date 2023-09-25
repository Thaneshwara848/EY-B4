import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { GalaryComponent } from './galary/galary.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { DirectivedemoComponent } from './directivedemo/directivedemo.component';
import { PippedemoComponent } from './pippedemo/pippedemo.component';
import { FormsdemoComponent } from './formsdemo/formsdemo.component';
import { ServicedemoComponent } from './servicedemo/servicedemo.component';
import { ProdservComponent } from './prodserv/prodserv.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = 
[
  {
    path:'prod',component:ProductComponent
  },
  {
    path:'serv',component:ServicedemoComponent
  },
  {
    path:'forms',component:FormsdemoComponent
  },
  {
    path:'pipe',component:PippedemoComponent
  },
  {
    path:'directive',component:DirectivedemoComponent
  },
  {
      path:'data',component:DatabindingComponent
  },
  {
    path:'home',component:HomeComponent
  },
  {
    path:'galary',component:GalaryComponent
  },
  {
    path:'signup',component:SignupComponent
  },
  {
    path:'login',component:LoginComponent
  },
  {
    path:'',component:FormsdemoComponent
  },
  {
    path:'**',component:LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
