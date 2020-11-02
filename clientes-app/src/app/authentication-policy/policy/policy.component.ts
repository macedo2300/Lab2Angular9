import { Component, OnInit } from '@angular/core';
import { PoliciesService } from './../../service/policies.service';
import { Policy } from 'src/app/model/policy.model';

@Component({
  selector: 'app-policy',
  templateUrl: './policy.component.html',
  styleUrls: ['./policy.component.css']
})
export class PolicyComponent implements OnInit {

  policy : Policy;

  constructor( public policeService: PoliciesService) {
    this.policy = new Policy();
   }

  ngOnInit(): void {
    this.inicializar();
  }

  salvar(){
    console.log(this.policy);
    this.inicializar();
  }

  fechar(){
    this.inicializar();
  }

  inicializar(): void {
    this.policy.name ='';
    this.policy.idGroup ='';
    this.policy.descripition ='';
    this.policy.transection = [];
  }
  onSubimit() {
    this.policeService
            .salvar(this.policy)
            .subscribe( response =>{
              console.log(response);
            }

            )
  }

}
