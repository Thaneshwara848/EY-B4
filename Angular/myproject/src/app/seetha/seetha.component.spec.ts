import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeethaComponent } from './seetha.component';

describe('SeethaComponent', () => {
  let component: SeethaComponent;
  let fixture: ComponentFixture<SeethaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SeethaComponent]
    });
    fixture = TestBed.createComponent(SeethaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
