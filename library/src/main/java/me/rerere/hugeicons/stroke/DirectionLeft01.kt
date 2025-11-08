package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DirectionLeft01: ImageVector
    get() {
        if (_directionLeft01 != null) {
            return _directionLeft01!!
        }
        _directionLeft01 = ImageVector.Builder(
            name = "DirectionLeft01",
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
        moveTo(6.14839f, 5.67914f)
        curveTo(6.82645f, 4.85343f, 7.16547f, 4.44058f, 7.62894f, 4.22029f)
        curveTo(8.09241f, 4f, 8.62199f, 4f, 9.68114f, 4f)
        horizontalLineTo(15f)
        verticalLineTo(11f)
        horizontalLineTo(9.68114f)
        curveTo(8.62199f, 11f, 8.09241f, 11f, 7.62894f, 10.7797f)
        curveTo(7.16547f, 10.5594f, 6.82645f, 10.1466f, 6.14839f, 9.32086f)
        lineTo(5.87979f, 8.99376f)
        curveTo(5.29326f, 8.27951f, 5f, 7.92239f, 5f, 7.5f)
        curveTo(5f, 7.07761f, 5.29326f, 6.72048f, 5.87979f, 6.00624f)
        lineTo(6.14839f, 5.67914f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21f)
        lineTo(15f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 21f)
        horizontalLineTo(19f)
        }
        }.build()

        return _directionLeft01!!
    }

private var _directionLeft01: ImageVector? = null
