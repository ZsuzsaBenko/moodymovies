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
  funList: ScreenFun[] = [];

  constructor(private funService: FunService,
              private router: ActivatedRoute) {
  }

  ngOnInit() {
    const snapshot = this.router.snapshot;

    if (snapshot.url[0].path.endsWith('all') && snapshot.params.funType == null) {
      this.funService.getAll().subscribe( response => this.funList = response);
    } else if (snapshot.url[0].path === 'random-fun') {
      this.funService.getOneRandomFromEachCategory().subscribe(response => this.funList = response);
    } else {
      const category = snapshot.params.funType;
      this.funService.getAllByCategory(category).subscribe(response => this.funList = response);
    }
  }

  filterFunList(category) {
    return this.funList.filter(fun => fun.funType === category);
  }
}
