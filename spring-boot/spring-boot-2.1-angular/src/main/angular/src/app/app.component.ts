import {Component} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.styl']
})
export class AppComponent {

  constructor(private http: HttpClient) {
  }

  title = 'angular';

  click() {
    this.http.get("http://127.0.0.1:8080/hello?name=world")
    console.log("Hello")
  }

}
