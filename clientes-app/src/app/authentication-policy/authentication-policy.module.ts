import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthenticationPolicyRoutingModule } from './authentication-policy-routing.module';
import { PolicyComponent } from './policy/policy.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [PolicyComponent],
  imports: [
    CommonModule,
    FormsModule,
    AuthenticationPolicyRoutingModule
  ],
  exports:[PolicyComponent]
})
export class AuthenticationPolicyModule { }
