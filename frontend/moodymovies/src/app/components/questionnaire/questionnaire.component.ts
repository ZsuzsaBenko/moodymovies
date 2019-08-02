import {Component, OnInit} from '@angular/core';
import {Questionnaire} from '../../models/Questionnaire';
import {NavigationExtras, Router} from '@angular/router';

@Component({
  selector: 'app-questionnaire',
  templateUrl: './questionnaire.component.html',
  styleUrls: ['./questionnaire.component.css']
})
export class QuestionnaireComponent implements OnInit {
  gender: string;
  age: number;
  horoscope: string;
  alone: string;
  timeOfDay: string;
  mood: string;
  masochist: string;

  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  onSubmit() {
    const questionnaire = new Questionnaire();
    questionnaire.gender = parseInt(this.gender, 10) || 1;
    questionnaire.age = (this.age >= 0 && this.age <= 100) ? this.age : 18;
    questionnaire.horoscope = this.horoscope || 'AQUARIUS';
    questionnaire.alone = parseInt(this.alone, 10) || 1;
    questionnaire.timeOfDay = parseInt(this.timeOfDay, 10) || 1;
    questionnaire.mood = this.mood || 'LAUGH';
    questionnaire.masochist = parseInt(this.masochist, 10) || 1;

    const navigationExtras: NavigationExtras = {
      queryParams: questionnaire
    };

    this.router.navigate(['/random-profile'], navigationExtras).then();
  }
}
