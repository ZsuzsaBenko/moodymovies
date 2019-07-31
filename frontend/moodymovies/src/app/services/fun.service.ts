import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {ScreenFun} from '../models/ScreenFun';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  })
};

@Injectable({
  providedIn: 'root'
})
export class FunService {
  baseUrl = 'http://localhost:8762/moodservice/randomizer';

  constructor(private http: HttpClient) {
  }

  getSurprise() {
    return this.http.get<ScreenFun>(this.baseUrl + '/random-choice');
  }

  getProfile(questionnaire) {
    return this.http.post<ScreenFun>(this.baseUrl + '/questionnaire', questionnaire, httpOptions);
  }

  getAll() {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/all');
  }

  getAllByCategory(category) {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/fun-type/' + category);
  }

  getOneRandomFromEachCategory() {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/one-from-each');
  }
}
