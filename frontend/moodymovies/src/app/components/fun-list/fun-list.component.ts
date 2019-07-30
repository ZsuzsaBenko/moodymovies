import {Component, OnInit} from '@angular/core';
import {ScreenFun} from '../../models/ScreenFun';
import {FunService} from '../../services/fun.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-fun-list',
  templateUrl: './fun-list.component.html',
  styleUrls: ['./fun-list.component.css']
})
export class FunListComponent implements OnInit {
  funList: ScreenFun[];

  constructor(private funService: FunService,
              private router: ActivatedRoute) {
  }

  ngOnInit() {
    if (this.router.snapshot.url[0].path === 'all') {
      this.funList = this.funService.getAll();
    } else if (this.router.snapshot.url[0].path === 'random-fun') {
      this.funList = this.funService.getRandomFun();
    } else {
      this.funList = this.funService.getAllByCategory();
    }
  }

}
