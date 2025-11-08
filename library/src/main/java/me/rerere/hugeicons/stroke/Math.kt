package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Math: ImageVector
    get() {
        if (_math != null) {
            return _math!!
        }
        _math = ImageVector.Builder(
            name = "Math",
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
        moveTo(5.5f, 12.5f)
        lineTo(5.97454f, 12.1836f)
        curveTo(6.44849f, 11.8677f, 6.68546f, 11.7097f, 6.91293f, 11.7803f)
        curveTo(7.1404f, 11.851f, 7.24617f, 12.1154f, 7.45772f, 12.6443f)
        lineTo(9f, 16.5f)
        lineTo(11.0883f, 10.2351f)
        curveTo(11.5283f, 8.91505f, 11.7483f, 8.25503f, 12.2721f, 7.87752f)
        curveTo(12.7959f, 7.5f, 13.4916f, 7.5f, 14.883f, 7.5f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        lineTo(15.5f, 13.5f)
        moveTo(15.5f, 13.5f)
        lineTo(14f, 15f)
        moveTo(15.5f, 13.5f)
        lineTo(17f, 15f)
        moveTo(15.5f, 13.5f)
        lineTo(14f, 12f)
        }
        }.build()

        return _math!!
    }

private var _math: ImageVector? = null
