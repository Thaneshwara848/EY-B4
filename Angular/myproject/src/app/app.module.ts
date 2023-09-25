import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { GalaryComponent } from './galary/galary.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { DirectivedemoComponent } from './directivedemo/directivedemo.component';
import { PipeComponent } from './pipe/pipe.component';
import { PippedemoComponent } from './pippedemo/pippedemo.component';
import { SqrPipe } from './sqr.pipe';
import { CubePipe } from './cube.pipe';
import { FormsdemoComponent } from './formsdemo/formsdemo.component';
import { TempletdrivenfromComponent } from './templetdrivenfrom/templetdrivenfrom.component';
import { ReactivdrivenformComponent } from './reactivdrivenform/reactivdrivenform.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { A1Component } from './a1/a1.component';
import { A2Component } from './a2/a2.component';
import { A3Component } from './a3/a3.component';
import { ServicedemoComponent } from './servicedemo/servicedemo.component';
import { ProductComponent } from './product/product.component';
import { ProdservComponent } from './prodserv/prodserv.component';
import { HttpClientModule } from  '@angular/common/http';
import { RamaComponent } from './rama/rama.component';
import { SeethaComponent } from './seetha/seetha.component';
import { RavanaComponent } from './ravana/ravana.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    GalaryComponent,
    SignupComponent,
    LoginComponent,
    DatabindingComponent,
    DirectivedemoComponent,
    PipeComponent,
    PippedemoComponent,
    SqrPipe,
    CubePipe,
    FormsdemoComponent,
    TempletdrivenfromComponent,
    ReactivdrivenformComponent,
    A1Component,
    A2Component,
    A3Component,
    ServicedemoComponent,
    ProductComponent,
    ProdservComponent,
    RamaComponent,
    SeethaComponent,
    RavanaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
