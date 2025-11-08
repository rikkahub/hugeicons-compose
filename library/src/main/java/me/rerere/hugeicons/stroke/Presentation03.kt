package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation03: ImageVector
    get() {
        if (_presentation03 != null) {
            return _presentation03!!
        }
        _presentation03 = ImageVector.Builder(
            name = "Presentation03",
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
        moveTo(3f, 10f)
        curveTo(3f, 12.8284f, 3f, 14.2426f, 3.87868f, 15.1213f)
        curveTo(4.75736f, 16f, 6.17157f, 16f, 9f, 16f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 16f, 19.2426f, 16f, 20.1213f, 15.1213f)
        curveTo(21f, 14.2426f, 21f, 12.8284f, 21f, 10f)
        verticalLineTo(4.5f)
        horizontalLineTo(3f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        lineTo(12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 2f)
        horizontalLineTo(3f)
        curveTo(2.5286f, 2f, 2.29289f, 2f, 2.14645f, 2.14645f)
        curveTo(2f, 2.29289f, 2f, 2.5286f, 2f, 3f)
        verticalLineTo(3.5f)
        curveTo(2f, 3.9714f, 2f, 4.20711f, 2.14645f, 4.35355f)
        curveTo(2.29289f, 4.5f, 2.5286f, 4.5f, 3f, 4.5f)
        horizontalLineTo(21f)
        curveTo(21.4714f, 4.5f, 21.7071f, 4.5f, 21.8536f, 4.35355f)
        curveTo(22f, 4.20711f, 22f, 3.9714f, 22f, 3.5f)
        verticalLineTo(3f)
        curveTo(22f, 2.5286f, 22f, 2.29289f, 21.8536f, 2.14645f)
        curveTo(21.7071f, 2f, 21.4714f, 2f, 21f, 2f)
        }
        }.build()

        return _presentation03!!
    }

private var _presentation03: ImageVector? = null
