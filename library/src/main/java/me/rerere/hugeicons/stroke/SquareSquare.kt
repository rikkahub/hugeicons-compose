package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareSquare: ImageVector
    get() {
        if (_squareSquare != null) {
            return _squareSquare!!
        }
        _squareSquare = ImageVector.Builder(
            name = "SquareSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.35938f, 10.9961f)
        curveTo(6.71937f, 10.9961f, 7.71214f, 10.85f, 8.07262f, 11.6121f)
        curveTo(8.48813f, 12.4906f, 9.53007f, 15.4735f, 9.77937f, 16.0721f)
        curveTo(10.0668f, 16.762f, 10.5114f, 17.1041f, 11.6514f, 16.9841f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.006f, 10.984f)
        curveTo(10.62f, 10.984f, 9.6f, 13.072f, 9.04734f, 13.912f)
        curveTo(8.38719f, 14.9642f, 7.32f, 17.032f, 6f, 16.984f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        horizontalLineTo(15f)
        curveTo(15f, 11f, 17.0049f, 9.67917f, 17.2244f, 9.52908f)
        curveTo(17.4439f, 9.37899f, 18f, 9.05382f, 18f, 8.32833f)
        curveTo(18f, 7.60284f, 17.2751f, 6.99999f, 16.5073f, 7f)
        curveTo(15.7396f, 7.00001f, 15f, 7.53452f, 15f, 8.33583f)
        }
        }.build()

        return _squareSquare!!
    }

private var _squareSquare: ImageVector? = null
