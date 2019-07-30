import {Component, OnInit} from '@angular/core';
import {Questionnaire} from '../../models/Questionnaire';

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

  constructor() {
  }

  ngOnInit() {
  }

  onSubmit() {
    const questionnaire = new Questionnaire();
    questionnaire.gender = this.gender;
    questionnaire.age = this.age;
    questionnaire.horoscope = this.horoscope;
    questionnaire.alone = this.alone;
    questionnaire.timeOfDay = this.timeOfDay;
    questionnaire.mood = this.mood;
    questionnaire.masochist = this.masochist;
  }
}
