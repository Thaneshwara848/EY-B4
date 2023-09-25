import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdservComponent } from './prodserv.component';

describe('ProdservComponent', () => {
  let component: ProdservComponent;
  let fixture: ComponentFixture<ProdservComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProdservComponent]
    });
    fixture = TestBed.createComponent(ProdservComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
