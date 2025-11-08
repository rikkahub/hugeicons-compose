package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stairs02: ImageVector
    get() {
        if (_stairs02 != null) {
            return _stairs02!!
        }
        _stairs02 = ImageVector.Builder(
            name = "Stairs02",
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
        moveTo(10f, 15f)
        horizontalLineTo(3.5f)
        curveTo(3.03406f, 15f, 2.80109f, 15f, 2.61732f, 15.0761f)
        curveTo(2.37229f, 15.1776f, 2.17761f, 15.3723f, 2.07612f, 15.6173f)
        curveTo(2f, 15.8011f, 2f, 16.0341f, 2f, 16.5f)
        curveTo(2f, 16.9659f, 2f, 17.1989f, 2.07612f, 17.3827f)
        curveTo(2.17761f, 17.6277f, 2.37229f, 17.8224f, 2.61732f, 17.9239f)
        curveTo(2.80109f, 18f, 3.03406f, 18f, 3.5f, 18f)
        horizontalLineTo(10f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        horizontalLineTo(7f)
        curveTo(6.05719f, 12f, 5.58579f, 12f, 5.29289f, 12.2929f)
        curveTo(5f, 12.5858f, 5f, 13.0572f, 5f, 14f)
        verticalLineTo(15f)
        horizontalLineTo(13f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 18f, 20.8284f, 18f, 21.4142f, 17.4142f)
        curveTo(22f, 16.8284f, 22f, 15.8856f, 22f, 14f)
        verticalLineTo(8f)
        curveTo(22f, 7.05719f, 22f, 6.58579f, 21.7071f, 6.29289f)
        curveTo(21.4142f, 6f, 20.9428f, 6f, 20f, 6f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9f)
        horizontalLineTo(10f)
        curveTo(9.05719f, 9f, 8.58579f, 9f, 8.29289f, 9.29289f)
        curveTo(8f, 9.58579f, 8f, 10.0572f, 8f, 11f)
        verticalLineTo(12f)
        horizontalLineTo(16f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 6f)
        horizontalLineTo(13f)
        curveTo(12.0572f, 6f, 11.5858f, 6f, 11.2929f, 6.29289f)
        curveTo(11f, 6.58579f, 11f, 7.05719f, 11f, 8f)
        verticalLineTo(9f)
        horizontalLineTo(19f)
        verticalLineTo(6f)
        }
        }.build()

        return _stairs02!!
    }

private var _stairs02: ImageVector? = null
