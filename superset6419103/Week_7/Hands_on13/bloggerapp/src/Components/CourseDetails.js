import React from 'react';

function CourseDetails() {
  const courses = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/2021' },
  ];

  return (
    <div className="column">
      <h2>Course Details</h2>
      {courses.map((course, index) => (
        <div key={index}>
          <strong>{course.name}</strong><br />
          {course.date}
          <br /><br />
        </div>
      ))}
    </div>
  );
}
export default CourseDetails;
