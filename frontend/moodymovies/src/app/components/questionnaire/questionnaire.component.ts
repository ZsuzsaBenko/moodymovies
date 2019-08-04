import {Component, OnInit} from '@angular/core';
import {Questionnaire} from '../../models/Questionnaire';
import {NavigationExtras, Router} from '@angular/router';

@Component({
  selector: 'app-questionnaire',
  templateUrl: './questionnaire.component.html',
  styleUrls: ['./questionnaire.component.css']
})
export class QuestionnaireComponent implements OnInit {
  gender: number;
  age: number;
  horoscope: string;
  alone: number;
  timeOfDay: number;
  mood: string;
  masochist: number;

  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  onSubmit() {
    const questionnaire = new Questionnaire();
    questionnaire.gender = this.gender || 1;
    questionnaire.age = (this.age >= 0 && this.age <= 100) ? this.age : 18;
    questionnaire.horoscope = this.horoscope || 'AQUARIUS';
    questionnaire.alone = this.alone || 1;
    questionnaire.timeOfDay = this.timeOfDay || 1;
    questionnaire.mood = this.mood || 'LAUGH';
    questionnaire.masochist = this.masochist || 1;

    const navigationExtras: NavigationExtras = {
      queryParams: questionnaire
    };

    this.router.navigate(['/random-profile'], navigationExtras).then();
  }
}
