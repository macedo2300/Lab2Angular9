import { Policy } from './../model/policy.model';
import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PoliciesService {

  constructor(
    private http : HttpClient
  ) { }


  salvar( policy: Policy) : Observable<Policy> {
    var url = 'http://localhost:8080/api/policies'
    return this.http.post<Policy>(url,policy);
  }
}
