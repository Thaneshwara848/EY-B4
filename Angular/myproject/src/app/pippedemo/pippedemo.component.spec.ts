import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PippedemoComponent } from './pippedemo.component';

describe('PippedemoComponent', () => {
  let component: PippedemoComponent;
  let fixture: ComponentFixture<PippedemoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PippedemoComponent]
    });
    fixture = TestBed.createComponent(PippedemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
