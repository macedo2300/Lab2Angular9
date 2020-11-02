import { AuthenticationPolicyModule } from './authentication-policy/authentication-policy.module';
import { ClientesModule } from './clientes/clientes.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { TemplateModule } from './template/template.module';
import { HomeComponent } from './home/home.component';
import { PoliciesService} from './service/policies.service';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ClientesModule,
    AuthenticationPolicyModule,
    TemplateModule
  ],
  providers: [PoliciesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
