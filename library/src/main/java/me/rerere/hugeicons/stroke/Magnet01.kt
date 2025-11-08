package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Magnet01: ImageVector
    get() {
        if (_magnet01 != null) {
            return _magnet01!!
        }
        _magnet01 = ImageVector.Builder(
            name = "Magnet01",
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
        moveTo(16f, 12f)
        verticalLineTo(11f)
        curveTo(16f, 10.0572f, 16f, 9.58579f, 16.2929f, 9.29289f)
        curveTo(16.5858f, 9f, 17.0572f, 9f, 18f, 9f)
        curveTo(18.9428f, 9f, 19.4142f, 9f, 19.7071f, 9.29289f)
        curveTo(20f, 9.58579f, 20f, 10.0572f, 20f, 11f)
        verticalLineTo(12f)
        moveTo(16f, 12f)
        verticalLineTo(14f)
        curveTo(16f, 16.2091f, 14.2091f, 18f, 12f, 18f)
        curveTo(9.79086f, 18f, 8f, 16.2091f, 8f, 14f)
        verticalLineTo(12f)
        moveTo(16f, 12f)
        horizontalLineTo(20f)
        moveTo(20f, 12f)
        verticalLineTo(14f)
        curveTo(20f, 18.4183f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 18.4183f, 4f, 14f)
        verticalLineTo(12f)
        moveTo(8f, 12f)
        verticalLineTo(11f)
        curveTo(8f, 10.0572f, 8f, 9.58579f, 7.70711f, 9.29289f)
        curveTo(7.41421f, 9f, 6.94281f, 9f, 6f, 9f)
        curveTo(5.05719f, 9f, 4.58579f, 9f, 4.29289f, 9.29289f)
        curveTo(4f, 9.58579f, 4f, 10.0572f, 4f, 11f)
        verticalLineTo(12f)
        moveTo(8f, 12f)
        lineTo(4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 2f)
        verticalLineTo(6f)
        moveTo(20f, 4f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        horizontalLineTo(4f)
        }
        }.build()

        return _magnet01!!
    }

private var _magnet01: ImageVector? = null
