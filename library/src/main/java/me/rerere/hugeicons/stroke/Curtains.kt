package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Curtains: ImageVector
    get() {
        if (_curtains != null) {
            return _curtains!!
        }
        _curtains = ImageVector.Builder(
            name = "Curtains",
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
        moveTo(22f, 3f)
        lineTo(2f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14f)
        curveTo(5.5985f, 13.2925f, 6.76719f, 11.3937f, 7f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        curveTo(18.4015f, 13.2925f, 17.2328f, 11.3937f, 17f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        verticalLineTo(14.625f)
        moveTo(3f, 14.625f)
        verticalLineTo(16.75f)
        curveTo(3f, 18.7535f, 3f, 19.7552f, 3.58579f, 20.3776f)
        curveTo(4.17157f, 21f, 5.11438f, 21f, 7f, 21f)
        horizontalLineTo(8f)
        curveTo(8f, 19.5311f, 7.6f, 16.0778f, 6f, 14.0154f)
        moveTo(3f, 14.625f)
        curveTo(4.14794f, 14.5482f, 5.14101f, 14.3343f, 6f, 14.0154f)
        moveTo(6f, 14.0154f)
        curveTo(9.88075f, 12.5749f, 12.0001f, 7.21447f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 3f)
        verticalLineTo(14.625f)
        moveTo(21f, 14.625f)
        verticalLineTo(16.75f)
        curveTo(21f, 18.7535f, 21f, 19.7552f, 20.4142f, 20.3776f)
        curveTo(19.8284f, 21f, 18.8856f, 21f, 17f, 21f)
        horizontalLineTo(16f)
        curveTo(16f, 19.5311f, 16.4f, 16.0778f, 18f, 14.0154f)
        moveTo(21f, 14.625f)
        curveTo(19.8521f, 14.5482f, 18.859f, 14.3343f, 18f, 14.0154f)
        moveTo(18f, 14.0154f)
        curveTo(14.1192f, 12.5749f, 11.9999f, 7.21447f, 12f, 3f)
        }
        }.build()

        return _curtains!!
    }

private var _curtains: ImageVector? = null
