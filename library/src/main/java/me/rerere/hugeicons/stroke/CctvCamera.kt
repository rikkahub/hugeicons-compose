package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CctvCamera: ImageVector
    get() {
        if (_cctvCamera != null) {
            return _cctvCamera!!
        }
        _cctvCamera = ImageVector.Builder(
            name = "CctvCamera",
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
        moveTo(15f, 13f)
        verticalLineTo(14f)
        curveTo(15f, 16.8284f, 15f, 18.2426f, 15.8787f, 19.1213f)
        curveTo(16.7574f, 20f, 18.1716f, 20f, 21f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.6914f, 18f)
        lineTo(20.6914f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10.8292f)
        lineTo(8.46281f, 10.8889f)
        curveTo(7.65914f, 10.9782f, 7.25729f, 11.0229f, 6.93718f, 10.9882f)
        curveTo(5.37478f, 10.8189f, 4.1433f, 9.43436f, 4.00816f, 7.69526f)
        curveTo(3.98047f, 7.33895f, 4.02507f, 6.89263f, 4.11426f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6914f, 7f)
        horizontalLineTo(13.7004f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        lineTo(21.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.246f, 4.22415f)
        curveTo(2.02398f, 3.32732f, 1.91297f, 2.8789f, 2.08182f, 2.5451f)
        curveTo(2.13924f, 2.43157f, 2.21764f, 2.33017f, 2.31277f, 2.24638f)
        curveTo(2.59249f, 2f, 3.05019f, 2f, 3.9656f, 2f)
        horizontalLineTo(16.5537f)
        curveTo(19.5616f, 2f, 22f, 4.46243f, 22f, 7.5f)
        curveTo(22f, 10.5376f, 19.5616f, 13f, 16.5537f, 13f)
        horizontalLineTo(11.8051f)
        curveTo(10.9893f, 13f, 10.5813f, 13f, 10.2309f, 12.8603f)
        curveTo(9.96064f, 12.7526f, 9.71719f, 12.5861f, 9.51778f, 12.3727f)
        curveTo(9.25919f, 12.096f, 9.10768f, 11.7135f, 8.80467f, 10.9485f)
        lineTo(8.26723f, 9.59167f)
        curveTo(7.95643f, 8.80701f, 7.80103f, 8.41468f, 7.51359f, 8.1244f)
        curveTo(7.22614f, 7.83413f, 6.83765f, 7.67719f, 6.06065f, 7.36333f)
        lineTo(4.3686f, 6.67983f)
        curveTo(3.64185f, 6.38626f, 3.27848f, 6.23948f, 3.00574f, 5.98088f)
        curveTo(2.91013f, 5.89022f, 2.82367f, 5.79019f, 2.74764f, 5.68227f)
        curveTo(2.53076f, 5.37443f, 2.43584f, 4.99101f, 2.246f, 4.22415f)
        }
        }.build()

        return _cctvCamera!!
    }

private var _cctvCamera: ImageVector? = null
