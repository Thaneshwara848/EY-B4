import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormsdemoComponent } from './formsdemo.component';

describe('FormsdemoComponent', () => {
  let component: FormsdemoComponent;
  let fixture: ComponentFixture<FormsdemoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormsdemoComponent]
    });
    fixture = TestBed.createComponent(FormsdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});