import {Routes} from "@angular/router";
import {TestPackageComponent} from "./testpackage/loader/test-package.component";
import {UploadLoaderJobComponent} from "./testpackage/loader/jobs/upload/upload-loader-job.component";
import {TestPackageStatusComponent} from "./testpackage/loader/status/test-package-status.component";
import {ErrorComponent} from "./error.component";
import {AuthGuard} from "./auth.component";

export const routes: Routes = [
  {
    path: 'home',
    redirectTo: '',
    pathMatch: 'full'
  },
  {
    path: '',
    redirectTo: 'loader',
    pathMatch: 'full',
  },
  {
    path: 'loader',
    pathMatch: 'prefix',
    data: {
      breadcrumb: {
        label: "Test Package Jobs"
      }
    },
    children: [
      {
        path: '',
        pathMatch: 'prefix',
        canActivate: [AuthGuard],
        component: TestPackageComponent
      },
      {
        path: 'error',
        pathMatch: 'prefix',
        component: ErrorComponent
      },
      {
        path: 'upload',
        pathMatch: 'prefix',
        data: {
          breadcrumb: {
            label: "Test Package Upload"
          }
        },
        children: [
          {
            path: '',
            pathMatch: 'prefix',
            canActivate: [AuthGuard],
            component: UploadLoaderJobComponent
          }
        ]
      }, {
        path: 'status',
        pathMatch: 'prefix',
        canActivate: [AuthGuard],
        component: TestPackageStatusComponent,
        data: {
          breadcrumb: {
            label: "Loaded Test Packages"
          }
        }
      }
    ]
  }
];
