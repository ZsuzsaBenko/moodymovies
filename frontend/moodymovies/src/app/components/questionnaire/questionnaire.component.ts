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
    questionnaire.gender = this.gender != null ? parseInt(this.gender, 10) : 1;
    questionnaire.age = (this.age >= 0 && this.age <= 100) ? this.age : 18;
    questionnaire.horoscope = this.horoscope != null ? this.horoscope : 'AQUARIUS';
    questionnaire.alone = this.alone != null ? parseInt(this.alone, 10) : 1;
    questionnaire.timeOfDay = this.timeOfDay != null ? parseInt(this.timeOfDay, 10) : 1;
    questionnaire.mood = this.mood != null ? this.mood : 'LAUGH';
    questionnaire.masochist = this.masochist != null ? parseInt(this.masochist, 10) : 1;

    const navigationExtras: NavigationExtras = {
      queryParams: questionnaire
    };

    this.router.navigate(['/random-profile'], navigationExtras).then();
  }
}
