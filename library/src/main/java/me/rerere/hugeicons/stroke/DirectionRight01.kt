package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DirectionRight01: ImageVector
    get() {
        if (_directionRight01 != null) {
            return _directionRight01!!
        }
        _directionRight01 = ImageVector.Builder(
            name = "DirectionRight01",
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
        moveTo(17.8516f, 5.67914f)
        curveTo(17.1736f, 4.85343f, 16.8345f, 4.44058f, 16.3711f, 4.22029f)
        curveTo(15.9076f, 4f, 15.378f, 4f, 14.3189f, 4f)
        horizontalLineTo(9f)
        verticalLineTo(11f)
        horizontalLineTo(14.3189f)
        curveTo(15.378f, 11f, 15.9076f, 11f, 16.3711f, 10.7797f)
        curveTo(16.8345f, 10.5594f, 17.1736f, 10.1466f, 17.8516f, 9.32086f)
        lineTo(18.1202f, 8.99376f)
        curveTo(18.7067f, 8.27951f, 19f, 7.92239f, 19f, 7.5f)
        curveTo(19f, 7.07761f, 18.7067f, 6.72048f, 18.1202f, 6.00624f)
        lineTo(17.8516f, 5.67914f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3f)
        lineTo(9f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 21f)
        horizontalLineTo(13f)
        }
        }.build()

        return _directionRight01!!
    }

private var _directionRight01: ImageVector? = null
