/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.common.testing.ui.espresso.action;

import android.view.View;

/**
 * Calculates coordinate position for general locations.
 */
public enum GeneralLocation implements CoordinatesProvider {

  TOP_LEFT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.BEGIN, Position.BEGIN);
    }
  },
  TOP_CENTER {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.BEGIN, Position.MIDDLE);
    }
  },
  TOP_RIGHT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.BEGIN, Position.END);
    }
  },
  CENTER_LEFT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.MIDDLE, Position.BEGIN);
    }
  },
  CENTER {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.MIDDLE, Position.MIDDLE);
    }
  },
  CENTER_RIGHT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.MIDDLE, Position.END);
    }
  },
  BOTTOM_LEFT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.END, Position.BEGIN);
    }
  },
  BOTTOM_CENTER {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.END, Position.MIDDLE);
    }
  },
  BOTTOM_RIGHT {
  @Override
    public float[] calculateCoordinates(View view) {
      return getCoordinates(view, Position.END, Position.END);
    }
  };

  private static float[] getCoordinates(View view, Position vertical, Position horizontal) {
    final int[] xy = new int[2];
    view.getLocationOnScreen(xy);
    final float x = horizontal.getPosition(xy[0], view.getWidth());
    final float y = vertical.getPosition(xy[1], view.getHeight());
    float[] coordinates = {x, y};
    return coordinates;
  }

  private static enum Position {
    BEGIN {
    @Override
      public float getPosition(int viewPos, int viewLength) {
        return viewPos;
      }
    },
    MIDDLE {
    @Override
      public float getPosition(int viewPos, int viewLength) {
        return viewPos + (viewLength / 2.0f);
      }
    },
    END {
    @Override
      public float getPosition(int viewPos, int viewLength) {
        return viewPos + viewLength;
      }
    };

    abstract float getPosition(int widgetPos, int widgetLength);
  }
}
