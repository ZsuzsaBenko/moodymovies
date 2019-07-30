import {Injectable} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {ScreenFun} from '../models/ScreenFun';

@Injectable({
  providedIn: 'root'
})
export class FunService {

  constructor(private http: HttpClientModule) {
  }

  getSurprise() {
    const test1 = new ScreenFun();
    test1.funType = 'movie';
    test1.genre = 'sci-fi';
    test1.title = 'Avatar';
    test1.year = 2015;
    test1.rating = 8.8;
    test1.staff = ['James Cameron'];
    test1.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test1.plot = 'This is the plot of this movie.';
    test1.runtime = 150;
    test1.poster = '../assets/avatar.jpg';
    test1.trailer = 'https://www.youtube.com/embed/6ziBFh3V1aM';
    return test1;
  }

  getProfile() {
    const test1 = new ScreenFun();
    test1.funType = 'movie';
    test1.genre = 'sci-fi';
    test1.title = 'Avatar';
    test1.year = 2015;
    test1.rating = 8.8;
    test1.staff = ['James Cameron'];
    test1.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test1.plot = 'This is the plot of this movie.';
    test1.runtime = 150;
    test1.poster = '../assets/avatar.jpg';
    test1.trailer = 'https://www.youtube.com/embed/6ziBFh3V1aM';
    return test1;

    const test2 = new ScreenFun();
    test2.funType = 'series';
    test2.genre = 'horror';
    test2.title = 'Stranger Things';
    test2.year = 2017;
    test2.rating = 9.2;
    test2.staff = ['The Duffer Brothers'];
    test2.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test2.plot = 'This is the plot of this series.';
    test2.runtime = 50;
    test2.poster = 'stranger-things.png';
    test2.trailer = 'https://www.youtube.com/embed/mnd7sFt5c3A';

    return [test1, test2];
  }
}
