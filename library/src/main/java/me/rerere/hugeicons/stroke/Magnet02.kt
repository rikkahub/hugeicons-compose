package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Magnet02: ImageVector
    get() {
        if (_magnet02 != null) {
            return _magnet02!!
        }
        _magnet02 = ImageVector.Builder(
            name = "Magnet02",
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
        moveTo(16f, 10f)
        verticalLineTo(9f)
        curveTo(16f, 8.05719f, 16f, 7.58579f, 16.2929f, 7.29289f)
        curveTo(16.5858f, 7f, 17.0572f, 7f, 18f, 7f)
        curveTo(18.9428f, 7f, 19.4142f, 7f, 19.7071f, 7.29289f)
        curveTo(20f, 7.58579f, 20f, 8.05719f, 20f, 9f)
        verticalLineTo(10f)
        moveTo(16f, 10f)
        verticalLineTo(14f)
        curveTo(16f, 16.2091f, 14.2091f, 18f, 12f, 18f)
        curveTo(9.79086f, 18f, 8f, 16.2091f, 8f, 14f)
        verticalLineTo(10f)
        moveTo(16f, 10f)
        horizontalLineTo(20f)
        moveTo(20f, 10f)
        verticalLineTo(14f)
        curveTo(20f, 18.4183f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 18.4183f, 4f, 14f)
        verticalLineTo(10f)
        moveTo(8f, 10f)
        verticalLineTo(9f)
        curveTo(8f, 8.05719f, 8f, 7.58579f, 7.70711f, 7.29289f)
        curveTo(7.41421f, 7f, 6.94281f, 7f, 6f, 7f)
        curveTo(5.05719f, 7f, 4.58579f, 7f, 4.29289f, 7.29289f)
        curveTo(4f, 7.58579f, 4f, 8.05719f, 4f, 9f)
        verticalLineTo(10f)
        moveTo(8f, 10f)
        lineTo(4f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 1.99982f)
        lineTo(10.625f, 4.99982f)
        horizontalLineTo(13.625f)
        lineTo(11.75f, 7.99982f)
        }
        }.build()

        return _magnet02!!
    }

private var _magnet02: ImageVector? = null
