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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MangementFormComponent } from './components/mangement-form/mangement-form.component';
import { ManagementTableComponent } from './components/management-table/management-table.component';
import { MatTableModule } from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import { ApiService } from './services/api.service';
import { LineChartComponent } from './components/line-chart/line-chart.component';

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
    DropdownComponent,
    MangementFormComponent,
    ManagementTableComponent,
    LineChartComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatSelectModule,
    MatTableModule,
  ],
  providers: [ApiService],
  bootstrap: [AppComponent],
})
export class AppModule {}
