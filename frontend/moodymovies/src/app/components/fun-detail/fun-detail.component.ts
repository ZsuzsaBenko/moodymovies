import {Component, OnInit} from '@angular/core';
import {ScreenFun} from '../../models/ScreenFun';
import {FunService} from '../../services/fun.service';
import {ActivatedRoute} from '@angular/router';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-fun-detail',
  templateUrl: './fun-detail.component.html',
  styleUrls: ['./fun-detail.component.css']
})
export class FunDetailComponent implements OnInit {
  chosenFun = new ScreenFun();
  trailerUrl: any;
  runtime: string;

  constructor(private funService: FunService,
              private router: ActivatedRoute,
              private sanitizer: DomSanitizer) {
  }

  ngOnInit() {
    if (this.router.snapshot.url[0].path === 'random-surprise') {
      this.funService.getSurprise().subscribe(response => {
        this.chosenFun = response;
        this.setFieldsForDisplay();
      });
    } else if (this.router.snapshot.url[0].path.startsWith('random-profile')) {
      const questionnaire = this.router.snapshot.queryParams;
      this.funService.getProfile(questionnaire).subscribe(response => {
        this.chosenFun = response;
        this.setFieldsForDisplay();
      });
    } else {
      this.chosenFun = history.state;
      this.setFieldsForDisplay();
    }
  }

  getSafeUrl(url) {
    return this.sanitizer.bypassSecurityTrustResourceUrl(url);
  }

  setFieldsForDisplay() {
    this.trailerUrl = this.getSafeUrl(this.chosenFun.trailer);

    this.chosenFun.genre = this.chosenFun.genre.toLowerCase();
    if (this.chosenFun.genre === 'sci_fi') {
      this.chosenFun.genre = 'science fiction';
    }

    if (this.chosenFun.runtime > 60) {
      this.runtime = `${Math.floor(this.chosenFun.runtime / 60)}h ${this.chosenFun.runtime % 60}min`;
    } else {
      this.runtime = `${this.chosenFun.runtime} min`;
    }
  }

}
