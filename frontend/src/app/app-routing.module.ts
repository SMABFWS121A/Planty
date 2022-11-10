import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { SettingsComponent } from './components/settings/settings.component';
import { SensorManagementComponent } from './components/sensor-management/sensor-management.component';
import { CategoryManagementComponent } from './components/category-management/category-management.component';
import { PlantManagemnetComponent } from './components/plant-managemnet/plant-managemnet.component';
import { NotificationComponent } from './components/notification/notification.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'settings', component: SettingsComponent },
  { path: 'sensor', component: SensorManagementComponent },
  { path: 'category', component: CategoryManagementComponent },
  { path: 'plant', component: PlantManagemnetComponent },
  { path: 'notification', component: NotificationComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
