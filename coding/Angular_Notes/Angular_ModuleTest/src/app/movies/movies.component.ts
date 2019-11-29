import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  data;
  movie;
  constructor(public http: HttpClient) { }

  ngOnInit() {
  }
  search(event) {
    this.data = event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?tt3896198&apikey=cd1c9247&s=' + this.data).subscribe(data => {
      this.movie = data.Search;
      console.log(this.movie);
  }, err => {
    console.log();
  }, () => {
    console.log('movies got successfully');
  });
 }
}
