package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DirectionRight02: ImageVector
    get() {
        if (_directionRight02 != null) {
            return _directionRight02!!
        }
        _directionRight02 = ImageVector.Builder(
            name = "DirectionRight02",
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
        moveTo(16.8516f, 5.67914f)
        curveTo(16.1736f, 4.85343f, 15.8345f, 4.44058f, 15.3711f, 4.22029f)
        curveTo(14.9076f, 4f, 14.378f, 4f, 13.3189f, 4f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 4f, 6.58579f, 4f, 6.29289f, 4.29289f)
        curveTo(6f, 4.58579f, 6f, 5.05719f, 6f, 6f)
        verticalLineTo(9f)
        curveTo(6f, 9.94281f, 6f, 10.4142f, 6.29289f, 10.7071f)
        curveTo(6.58579f, 11f, 7.05719f, 11f, 8f, 11f)
        horizontalLineTo(13.3189f)
        curveTo(14.378f, 11f, 14.9076f, 11f, 15.3711f, 10.7797f)
        curveTo(15.8345f, 10.5594f, 16.1736f, 10.1466f, 16.8516f, 9.32086f)
        lineTo(17.1202f, 8.99376f)
        curveTo(17.7067f, 8.27951f, 18f, 7.92239f, 18f, 7.5f)
        curveTo(18f, 7.07761f, 17.7067f, 6.72048f, 17.1202f, 6.00624f)
        lineTo(16.8516f, 5.67914f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        lineTo(10f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 3f)
        lineTo(10f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        horizontalLineTo(14f)
        }
        }.build()

        return _directionRight02!!
    }

private var _directionRight02: ImageVector? = null
