package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PcCase: ImageVector
    get() {
        if (_pcCase != null) {
            return _pcCase!!
        }
        _pcCase = ImageVector.Builder(
            name = "PcCase",
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
        moveTo(6f, 16f)
        verticalLineTo(8f)
        curveTo(6f, 5.17157f, 6f, 3.75736f, 6.87868f, 2.87868f)
        curveTo(7.75736f, 2f, 9.17157f, 2f, 12f, 2f)
        curveTo(14.8284f, 2f, 16.2426f, 2f, 17.1213f, 2.87868f)
        curveTo(18f, 3.75736f, 18f, 5.17157f, 18f, 8f)
        verticalLineTo(16f)
        curveTo(18f, 18.8284f, 18f, 20.2426f, 17.1213f, 21.1213f)
        curveTo(16.2426f, 22f, 14.8284f, 22f, 12f, 22f)
        curveTo(9.17157f, 22f, 7.75736f, 22f, 6.87868f, 21.1213f)
        curveTo(6f, 20.2426f, 6f, 18.8284f, 6f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 10f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(18.01f)
        }
        }.build()

        return _pcCase!!
    }

private var _pcCase: ImageVector? = null
