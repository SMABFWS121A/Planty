import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { NotificationComponent } from './components/notification/notification.component';
import { PlantManagemnetComponent } from './components/plant-managemnet/plant-managemnet.component';
import { CategoryManagementComponent } from './components/category-management/category-management.component';
import { SensorManagementComponent } from './components/sensor-management/sensor-management.component';
import { SettingsComponent } from './components/settings/settings.component';
import { DropdownComponent } from './components/molecules/dropdown/dropdown.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    NotificationComponent,
    PlantManagemnetComponent,
    CategoryManagementComponent,
    SensorManagementComponent,
    SettingsComponent,
    DropdownComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
