package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderLeft01: ImageVector
    get() {
        if (_borderLeft01 != null) {
            return _borderLeft01!!
        }
        _borderLeft01 = ImageVector.Builder(
            name = "BorderLeft01",
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
        moveTo(6.5f, 2.5f)
        curveTo(5.40606f, 2.69854f, 4.60096f, 3.04969f, 3.96447f, 3.6708f)
        curveTo(2.5f, 5.09987f, 2.5f, 7.39991f, 2.5f, 12f)
        curveTo(2.5f, 16.6001f, 2.5f, 18.9001f, 3.96447f, 20.3292f)
        curveTo(4.60096f, 20.9503f, 5.40606f, 21.3015f, 6.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6896f, 2.75143f)
        curveTo(18.7317f, 2.94471f, 19.4986f, 3.28657f, 20.105f, 3.89124f)
        curveTo(20.7113f, 4.49591f, 21.0541f, 5.26076f, 21.2479f, 6.3f)
        moveTo(10f, 2.50495f)
        curveTo(10.586f, 2.5f, 11.2883f, 2.5f, 11.9741f, 2.5f)
        curveTo(12.6599f, 2.5f, 13.4249f, 2.5f, 14.0109f, 2.50495f)
        moveTo(21.495f, 10.1f)
        curveTo(21.5f, 10.6844f, 21.5f, 11.3161f, 21.5f, 12f)
        curveTo(21.5f, 12.6839f, 21.5f, 13.3156f, 21.495f, 13.9001f)
        moveTo(21.2479f, 17.7f)
        curveTo(21.0541f, 18.7392f, 20.7113f, 19.5041f, 20.105f, 20.1088f)
        curveTo(19.4986f, 20.7134f, 18.7317f, 21.0553f, 17.6896f, 21.2486f)
        moveTo(10f, 21.495f)
        curveTo(10.586f, 21.5f, 11.2883f, 21.5f, 11.9741f, 21.5f)
        curveTo(12.6598f, 21.5f, 13.4249f, 21.5f, 14.0109f, 21.495f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        verticalLineTo(4f)
        moveTo(12f, 20f)
        verticalLineTo(21.5f)
        moveTo(9f, 12f)
        horizontalLineTo(15f)
        moveTo(19.5312f, 12f)
        horizontalLineTo(21f)
        moveTo(12f, 9f)
        lineTo(12f, 15f)
        }
        }.build()

        return _borderLeft01!!
    }

private var _borderLeft01: ImageVector? = null
