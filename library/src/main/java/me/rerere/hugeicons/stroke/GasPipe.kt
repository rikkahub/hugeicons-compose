package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GasPipe: ImageVector
    get() {
        if (_gasPipe != null) {
            return _gasPipe!!
        }
        _gasPipe = ImageVector.Builder(
            name = "GasPipe",
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
        moveTo(2f, 17.5f)
        horizontalLineTo(8f)
        moveTo(8f, 20.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17.5f)
        horizontalLineTo(22f)
        moveTo(22f, 20.5f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        horizontalLineTo(10.5f)
        verticalLineTo(16f)
        horizontalLineTo(13.5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        curveTo(17f, 9.76142f, 14.7614f, 12f, 12f, 12f)
        curveTo(9.23858f, 12f, 7f, 9.76142f, 7f, 7f)
        curveTo(7f, 4.23858f, 9.23858f, 2f, 12f, 2f)
        curveTo(14.7614f, 2f, 17f, 4.23858f, 17f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        lineTo(13.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 16f)
        horizontalLineTo(10f)
        curveTo(9.05719f, 16f, 8.58579f, 16f, 8.29289f, 16.2929f)
        curveTo(8f, 16.5858f, 8f, 17.0572f, 8f, 18f)
        verticalLineTo(20f)
        curveTo(8f, 20.9428f, 8f, 21.4142f, 8.29289f, 21.7071f)
        curveTo(8.58579f, 22f, 9.05719f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(14.9428f, 22f, 15.4142f, 22f, 15.7071f, 21.7071f)
        curveTo(16f, 21.4142f, 16f, 20.9428f, 16f, 20f)
        verticalLineTo(18f)
        curveTo(16f, 17.0572f, 16f, 16.5858f, 15.7071f, 16.2929f)
        curveTo(15.4142f, 16f, 14.9428f, 16f, 14f, 16f)
        }
        }.build()

        return _gasPipe!!
    }

private var _gasPipe: ImageVector? = null
