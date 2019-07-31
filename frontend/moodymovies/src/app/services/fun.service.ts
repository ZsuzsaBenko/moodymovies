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

    const test2 = new ScreenFun();
    test2.funType = 'movie';
    test2.genre = 'horror';
    test2.title = 'Sleepy Hollow';
    test2.year = 1999;
    test2.rating = 9.6;
    test2.director = 'somebody';
    test2.producer = 'someone else';
    test2.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test2.plot = 'This is the plot of this movie.';
    test2.runtime = 125;
    test2.poster = '../assets/sleepy-hollow.jpg';
    test2.trailer = 'https://www.youtube.com/embed/504uo6f3xEc';

    const test3 = new ScreenFun();
    test3.funType = 'movie';
    test3.genre = 'romance';
    test3.title = 'Fifty First Dates';
    test3.year = 2005;
    test3.rating = 8.7;
    test3.director = 'somebody';
    test3.producer = 'someone else';
    test3.actors = ['Jane Doe', 'John Doe'];
    test3.plot = 'This is the plot of this game.';
    test3.runtime = 150;
    test3.poster = '../assets/fifty-first-dates.jpg';
    test3.trailer = 'https://www.youtube.com/embed/Y-9wSAd0dMM';

    const test4 = new ScreenFun();
    test4.funType = 'movie';
    test4.genre = 'fantasy';
    test4.title = 'The Lord Of The Rings - The Fellowship of the Ring';
    test4.year = 2004;
    test4.rating = 9.7;
    test4.director = 'somebody';
    test4.producer = 'someone else';
    test4.actors = ['Jane Doe', 'John Doe'];
    test4.plot = 'This is the plot of this movie.';
    test4.runtime = 200;
    test4.poster = '../assets/fellowship-of-the-ring.jpg';
    test4.trailer = 'https://www.youtube.com/embed/aStYWD25fAQ';

    return [test1, test2, test3, test4];
  }

  getAllByCategory() {
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

    const test2 = new ScreenFun();
    test2.funType = 'movie';
    test2.genre = 'horror';
    test2.title = 'Sleepy Hollow';
    test2.year = 1999;
    test2.rating = 9.6;
    test2.director = 'somebody';
    test2.producer = 'someone else';
    test2.actors = ['Jane Doe', 'John Doe', 'Jack Smith'];
    test2.plot = 'This is the plot of this movie.';
    test2.runtime = 125;
    test2.poster = '../assets/sleepy-hollow.png';
    test2.trailer = 'https://www.youtube.com/embed/504uo6f3xEc';

    return [test1, test2];

  }

  getRandomFun() {
    const test3 = new ScreenFun();
    test3.funType = 'movie';
    test3.genre = 'romance';
    test3.title = 'Fifty First Dates';
    test3.year = 2005;
    test3.rating = 8.7;
    test3.director = 'somebody';
    test3.producer = 'someone else';
    test3.actors = ['Jane Doe', 'John Doe'];
    test3.plot = 'This is the plot of this game.';
    test3.runtime = 150;
    test3.poster = '../assets/fifty-first-dates.jpg';
    test3.trailer = 'https://www.youtube.com/embed/Y-9wSAd0dMM';

    const test4 = new ScreenFun();
    test4.funType = 'movie';
    test4.genre = 'fantasy';
    test4.title = 'The Lord Of The Rings - The Fellowship of the Ring';
    test4.year = 2004;
    test4.rating = 9.7;
    test4.director = 'somebody';
    test4.producer = 'someone else';
    test4.actors = ['Jane Doe', 'John Doe'];
    test4.plot = 'This is the plot of this movie.';
    test4.runtime = 200;
    test4.poster = '../assets/fellowship-of-the-ring.jpg';
    test4.trailer = 'https://www.youtube.com/embed/aStYWD25fAQ';

    return [test3, test4];
  }
}
