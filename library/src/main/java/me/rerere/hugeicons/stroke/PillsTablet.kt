package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PillsTablet: ImageVector
    get() {
        if (_pillsTablet != null) {
            return _pillsTablet!!
        }
        _pillsTablet = ImageVector.Builder(
            name = "PillsTablet",
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
        moveTo(20f, 16f)
        verticalLineTo(8f)
        curveTo(20f, 5.17157f, 20f, 3.75736f, 19.1213f, 2.87868f)
        curveTo(18.2426f, 2f, 16.8284f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(16f)
        curveTo(4f, 18.8284f, 4f, 20.2426f, 4.87868f, 21.1213f)
        curveTo(5.75736f, 22f, 7.17157f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(16.8284f, 22f, 18.2426f, 22f, 19.1213f, 21.1213f)
        curveTo(20f, 20.2426f, 20f, 18.8284f, 20f, 16f)
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
        curveTo(15.1046f, 6f, 16f, 6.89543f, 16f, 8f)
        curveTo(16f, 9.10457f, 15.1046f, 10f, 14f, 10f)
        horizontalLineTo(10f)
        curveTo(8.89543f, 10f, 8f, 9.10457f, 8f, 8f)
        curveTo(8f, 6.89543f, 8.89543f, 6f, 10f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 14f)
        horizontalLineTo(14f)
        curveTo(15.1046f, 14f, 16f, 14.8954f, 16f, 16f)
        curveTo(16f, 17.1046f, 15.1046f, 18f, 14f, 18f)
        horizontalLineTo(10f)
        curveTo(8.89543f, 18f, 8f, 17.1046f, 8f, 16f)
        curveTo(8f, 14.8954f, 8.89543f, 14f, 10f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        verticalLineTo(18f)
        }
        }.build()

        return _pillsTablet!!
    }

private var _pillsTablet: ImageVector? = null
