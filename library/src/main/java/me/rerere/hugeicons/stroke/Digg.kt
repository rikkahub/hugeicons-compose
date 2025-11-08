package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Digg: ImageVector
    get() {
        if (_digg != null) {
            return _digg!!
        }
        _digg = ImageVector.Builder(
            name = "Digg",
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
        moveTo(18f, 19f)
        horizontalLineTo(20f)
        curveTo(20.9428f, 19f, 21.4142f, 19f, 21.7071f, 18.7071f)
        curveTo(22f, 18.4142f, 22f, 17.9428f, 22f, 17f)
        verticalLineTo(16f)
        moveTo(22f, 16f)
        verticalLineTo(11f)
        curveTo(22f, 10.0572f, 22f, 9.58579f, 21.7071f, 9.29289f)
        curveTo(21.4142f, 9f, 20.9428f, 9f, 20f, 9f)
        curveTo(19.0572f, 9f, 18.5858f, 9f, 18.2929f, 9.29289f)
        curveTo(18f, 9.58579f, 18f, 10.0572f, 18f, 11f)
        verticalLineTo(14f)
        curveTo(18f, 14.9428f, 18f, 15.4142f, 18.2929f, 15.7071f)
        curveTo(18.5858f, 16f, 19.0572f, 16f, 20f, 16f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 19f)
        horizontalLineTo(13.5f)
        curveTo(14.4428f, 19f, 14.9142f, 19f, 15.2071f, 18.7071f)
        curveTo(15.5f, 18.4142f, 15.5f, 17.9428f, 15.5f, 17f)
        verticalLineTo(16f)
        moveTo(15.5f, 16f)
        verticalLineTo(11f)
        curveTo(15.5f, 10.0572f, 15.5f, 9.58579f, 15.2071f, 9.29289f)
        curveTo(14.9142f, 9f, 14.4428f, 9f, 13.5f, 9f)
        curveTo(12.5572f, 9f, 12.0858f, 9f, 11.7929f, 9.29289f)
        curveTo(11.5f, 9.58579f, 11.5f, 10.0572f, 11.5f, 11f)
        verticalLineTo(14f)
        curveTo(11.5f, 14.9428f, 11.5f, 15.4142f, 11.7929f, 15.7071f)
        curveTo(12.0858f, 16f, 12.5572f, 16f, 13.5f, 16f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        verticalLineTo(14f)
        curveTo(6f, 14.9428f, 6f, 15.4142f, 5.70711f, 15.7071f)
        curveTo(5.41421f, 16f, 4.94281f, 16f, 4f, 16f)
        curveTo(3.05719f, 16f, 2.58579f, 16f, 2.29289f, 15.7071f)
        curveTo(2f, 15.4142f, 2f, 14.9428f, 2f, 14f)
        verticalLineTo(11f)
        curveTo(2f, 10.0572f, 2f, 9.58579f, 2.29289f, 9.29289f)
        curveTo(2.58579f, 9f, 3.05719f, 9f, 4f, 9f)
        horizontalLineTo(6f)
        moveTo(6f, 9f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5f)
        verticalLineTo(6f)
        moveTo(9f, 9f)
        verticalLineTo(16f)
        }
        }.build()

        return _digg!!
    }

private var _digg: ImageVector? = null
