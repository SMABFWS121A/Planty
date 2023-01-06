import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlantManagemnetComponent } from './plant-managemnet.component';

describe('PlantManagemnetComponent', () => {
  let component: PlantManagemnetComponent;
  let fixture: ComponentFixture<PlantManagemnetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlantManagemnetComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PlantManagemnetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
