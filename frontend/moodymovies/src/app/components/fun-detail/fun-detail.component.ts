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

  constructor(private funService: FunService,
              private router: ActivatedRoute,
              private sanitizer: DomSanitizer) {
  }

  ngOnInit() {
    console.log(this.router.snapshot);
    if (this.router.snapshot.url[0].path === 'random-surprise') {
      this.chosenFun = this.funService.getSurprise();
    } else if (this.router.snapshot.url[0].path === 'random-fun') {
      // this.chosenFun = this.funService.getProfile();
    }

    this.trailerUrl = this.getSafeUrl(this.chosenFun.trailer);
  }

  getSafeUrl(url) {
    return this.sanitizer.bypassSecurityTrustResourceUrl(url);
  }

}
