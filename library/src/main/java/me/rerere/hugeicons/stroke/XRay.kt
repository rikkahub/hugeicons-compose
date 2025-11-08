package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = ImageVector.Builder(
            name = "XRay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        lineTo(12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14.3321f)
        curveTo(11.047f, 14.3321f, 10.1425f, 14.2268f, 9.329f, 14.0377f)
        curveTo(8.45448f, 13.8345f, 7.5f, 14.4753f, 7.5f, 15.4049f)
        curveTo(7.5f, 15.8904f, 7.76615f, 16.3401f, 8.20673f, 16.5039f)
        curveTo(8.53045f, 16.6243f, 8.87716f, 16.7297f, 9.24287f, 16.8181f)
        curveTo(9.83466f, 16.961f, 10.3551f, 17.3472f, 10.6124f, 17.9182f)
        lineTo(10.7188f, 18.1543f)
        curveTo(10.9514f, 18.6703f, 11.4509f, 19f, 12f, 19f)
        curveTo(12.5491f, 19f, 13.0486f, 18.6703f, 13.2812f, 18.1543f)
        lineTo(13.3876f, 17.9182f)
        curveTo(13.6449f, 17.3472f, 14.1653f, 16.961f, 14.7571f, 16.8181f)
        curveTo(15.1228f, 16.7297f, 15.4695f, 16.6243f, 15.7933f, 16.5039f)
        curveTo(16.2338f, 16.3401f, 16.5f, 15.8904f, 16.5f, 15.4049f)
        curveTo(16.5f, 14.4753f, 15.5455f, 13.8345f, 14.671f, 14.0377f)
        curveTo(13.8575f, 14.2268f, 12.953f, 14.3321f, 12f, 14.3321f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        curveTo(14.6134f, 7.61859f, 14.084f, 8f, 13.5f, 8f)
        curveTo(12.916f, 8f, 12.3866f, 7.61859f, 12f, 7f)
        curveTo(11.6134f, 7.61859f, 11.084f, 8f, 10.5f, 8f)
        curveTo(9.91601f, 8f, 9.38657f, 7.61859f, 9f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10f)
        curveTo(7.64429f, 10.6186f, 8.52668f, 11f, 9.5f, 11f)
        curveTo(10.4733f, 11f, 11.3557f, 10.6186f, 12f, 10f)
        curveTo(12.6443f, 10.6186f, 13.5267f, 11f, 14.5f, 11f)
        curveTo(15.4733f, 11f, 16.3557f, 10.6186f, 17f, 10f)
        }
        }.build()

        return _xRay!!
    }

private var _xRay: ImageVector? = null
