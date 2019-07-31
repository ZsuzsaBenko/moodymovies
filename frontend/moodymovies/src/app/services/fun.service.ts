import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ScreenFun} from '../models/ScreenFun';

@Injectable({
  providedIn: 'root'
})
export class FunService {
  baseUrl = 'http://localhost:8762/moodservice/randomizer';

  constructor(private http: HttpClient) {
  }

  getSurprise() {
    const test1 = new ScreenFun();
    test1.funType = 'movie';
    test1.genre = 'sci-fi';
    test1.title = 'Avatar';
    test1.year = 2015;
    test1.rating = 8.8;
    test1.director = 'somebody';
    test1.producer = 'someone else';
    test1.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test1.plot = 'This is the plot of this movie.';
    test1.runtime = 150;
    test1.poster = '../assets/avatar.jpg';
    test1.trailer = 'https://www.youtube.com/embed/6ziBFh3V1aM';
    return test1;
  }

  getProfile(questionnaire) {
    const test1 = new ScreenFun();
    test1.funType = 'movie';
    test1.genre = 'horror';
    test1.title = 'Sleepy Hollow';
    test1.year = 2010;
    test1.rating = 9.6;
    test1.director = 'somebody';
    test1.producer = 'someone else';
    test1.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test1.plot = 'This is the plot of this movie.';
    test1.runtime = 125;
    test1.poster = '../assets/sleepy-hollow.jpg';
    test1.trailer = 'https://www.youtube.com/embed/504uo6f3xEc';

    return test1;
  }

  getAll() {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/all');
  }

  getAllByCategory(category) {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/checkbox/' + category);
  }

  getOneRandomFromEachCategory() {
    return this.http.get<ScreenFun[]>(this.baseUrl + '/one-from-each');
  }
}
