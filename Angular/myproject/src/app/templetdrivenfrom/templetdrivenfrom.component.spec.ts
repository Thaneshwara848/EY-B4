import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TempletdrivenfromComponent } from './templetdrivenfrom.component';

describe('TempletdrivenfromComponent', () => {
  let component: TempletdrivenfromComponent;
  let fixture: ComponentFixture<TempletdrivenfromComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TempletdrivenfromComponent]
    });
    fixture = TestBed.createComponent(TempletdrivenfromComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
