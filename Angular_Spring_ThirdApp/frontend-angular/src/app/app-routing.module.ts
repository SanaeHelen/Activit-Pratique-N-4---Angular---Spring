import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {StudentsComponent} from "./students/students.component";
import {PaymentsComponent} from "./payments/payments.component";
import {ProfileComponent} from "./profile/profile.component";
import {LoadStudentsComponent} from "./load-students/load-students.component";
import {LoadPaymentsComponent} from "./load-payments/load-payments.component";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {LogoutComponent} from "./logout/logout.component";
import {AdminTemplateComponent} from "./admin-template/admin-template.component";
import {AuthGuard} from "./guards/auth.guard";
import {AuthorizationGuard} from "./guards/authorization.guard";




const routes: Routes = [
  {path : "", component : LogoutComponent},
  {path : "logout", component : LogoutComponent},
  {path : "admin", component : AdminTemplateComponent,
    canActivate : [AuthGuard],
    children: [
      {path: "home", component: HomeComponent},
      {path: "profile", component: ProfileComponent},
      {path: "students", component: StudentsComponent},
      {path: "payments", component: PaymentsComponent},
      {
        path: "loadStudents", component: LoadStudentsComponent,
        canActivate : [AuthorizationGuard] , data: {roles : ['ADMIN']}
      },
      {path: "loadPayments", component: LoadPaymentsComponent},
      {path: "dashboard", component: DashboardComponent}
    ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
