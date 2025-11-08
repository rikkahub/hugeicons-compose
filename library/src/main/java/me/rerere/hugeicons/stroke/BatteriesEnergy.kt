package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BatteriesEnergy: ImageVector
    get() {
        if (_batteriesEnergy != null) {
            return _batteriesEnergy!!
        }
        _batteriesEnergy = ImageVector.Builder(
            name = "BatteriesEnergy",
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
        moveTo(12.5f, 2f)
        lineTo(10f, 6f)
        horizontalLineTo(14f)
        lineTo(11.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 6f)
        curveTo(17.9428f, 6f, 18.4142f, 6f, 18.7071f, 6.29289f)
        curveTo(19f, 6.58579f, 19f, 7.05719f, 19f, 8f)
        verticalLineTo(10.5f)
        moveTo(7f, 6f)
        curveTo(6.05719f, 6f, 5.58579f, 6f, 5.29289f, 6.29289f)
        curveTo(5f, 6.58579f, 5f, 7.05719f, 5f, 8f)
        lineTo(5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13f)
        horizontalLineTo(18f)
        curveTo(17.0572f, 13f, 16.5858f, 13f, 16.2929f, 13.2929f)
        curveTo(16f, 13.5858f, 16f, 14.0572f, 16f, 15f)
        verticalLineTo(20f)
        curveTo(16f, 20.9428f, 16f, 21.4142f, 16.2929f, 21.7071f)
        curveTo(16.5858f, 22f, 17.0572f, 22f, 18f, 22f)
        horizontalLineTo(20f)
        curveTo(20.9428f, 22f, 21.4142f, 22f, 21.7071f, 21.7071f)
        curveTo(22f, 21.4142f, 22f, 20.9428f, 22f, 20f)
        verticalLineTo(15f)
        curveTo(22f, 14.0572f, 22f, 13.5858f, 21.7071f, 13.2929f)
        curveTo(21.4142f, 13f, 20.9428f, 13f, 20f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        lineTo(22f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 13f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 13f, 2.58579f, 13f, 2.29289f, 13.2929f)
        curveTo(2f, 13.5858f, 2f, 14.0572f, 2f, 15f)
        verticalLineTo(20f)
        curveTo(2f, 20.9428f, 2f, 21.4142f, 2.29289f, 21.7071f)
        curveTo(2.58579f, 22f, 3.05719f, 22f, 4f, 22f)
        horizontalLineTo(6f)
        curveTo(6.94281f, 22f, 7.41421f, 22f, 7.70711f, 21.7071f)
        curveTo(8f, 21.4142f, 8f, 20.9428f, 8f, 20f)
        verticalLineTo(15f)
        curveTo(8f, 14.0572f, 8f, 13.5858f, 7.70711f, 13.2929f)
        curveTo(7.41421f, 13f, 6.94281f, 13f, 6f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 19f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 16f)
        lineTo(8f, 16f)
        }
        }.build()

        return _batteriesEnergy!!
    }

private var _batteriesEnergy: ImageVector? = null
