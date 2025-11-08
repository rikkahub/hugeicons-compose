package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiComputer: ImageVector
    get() {
        if (_aiComputer != null) {
            return _aiComputer!!
        }
        _aiComputer = ImageVector.Builder(
            name = "AiComputer",
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
        moveTo(10.014f, 2f)
        curveTo(6.23617f, 2f, 4.34725f, 2f, 3.17362f, 3.17157f)
        curveTo(2f, 4.34315f, 2f, 6.22876f, 2f, 10f)
        curveTo(2f, 13.7712f, 2f, 15.6569f, 3.17362f, 16.8284f)
        curveTo(4.34725f, 18f, 6.23617f, 18f, 10.014f, 18f)
        horizontalLineTo(14.021f)
        curveTo(17.7989f, 18f, 19.6878f, 18f, 20.8614f, 16.8284f)
        curveTo(21.671f, 16.0203f, 21.9221f, 14.8723f, 22f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4f)
        horizontalLineTo(16f)
        curveTo(15.0572f, 4f, 14.5858f, 4f, 14.2929f, 4.29289f)
        curveTo(14f, 4.58579f, 14f, 5.05719f, 14f, 6f)
        verticalLineTo(8f)
        curveTo(14f, 8.94281f, 14f, 9.41421f, 14.2929f, 9.70711f)
        curveTo(14.5858f, 10f, 15.0572f, 10f, 16f, 10f)
        horizontalLineTo(18f)
        curveTo(18.9428f, 10f, 19.4142f, 10f, 19.7071f, 9.70711f)
        curveTo(20f, 9.41421f, 20f, 8.94281f, 20f, 8f)
        verticalLineTo(6f)
        curveTo(20f, 5.05719f, 20f, 4.58579f, 19.7071f, 4.29289f)
        curveTo(19.4142f, 4f, 18.9428f, 4f, 18f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10f)
        verticalLineTo(12f)
        moveTo(18.5f, 10f)
        verticalLineTo(12f)
        moveTo(15.5f, 2f)
        verticalLineTo(4f)
        moveTo(18.5f, 2f)
        verticalLineTo(4f)
        moveTo(14f, 5.5f)
        horizontalLineTo(12f)
        moveTo(14f, 8.5f)
        horizontalLineTo(12f)
        moveTo(22f, 5.5f)
        horizontalLineTo(20f)
        moveTo(22f, 8.5f)
        horizontalLineTo(20f)
        }
        }.build()

        return _aiComputer!!
    }

private var _aiComputer: ImageVector? = null
