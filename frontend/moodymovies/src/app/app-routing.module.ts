import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {FunListComponent} from './components/fun-list/fun-list.component';
import {FunDetailComponent} from './components/fun-detail/fun-detail.component';
import {QuestionnaireComponent} from './components/questionnaire/questionnaire.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'random-fun', component: FunListComponent},
  {path: 'random-surprise', component: FunDetailComponent},
  {path: 'random-profile', component: FunDetailComponent},
  {path: 'questionnaire', component: QuestionnaireComponent},
  {path: 'all/:funType', component: FunListComponent, pathMatch: 'full'},
  {path: 'all', component: FunListComponent, pathMatch: 'full'},
  {path: ':funType/:id', component: FunDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
