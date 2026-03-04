package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Villa01: ImageVector
    get() {
        if (_villa01 != null) {
            return _villa01!!
        }
        _villa01 = ImageVector.Builder(
            name = "Villa01",
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
        moveTo(7.5f, 18f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        verticalLineTo(13f)
        horizontalLineTo(3f)
        verticalLineTo(17f)
        curveTo(3f, 18.8856f, 3f, 19.8284f, 3.58579f, 20.4142f)
        curveTo(4.17157f, 21f, 5.11438f, 21f, 7f, 21f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17f)
        verticalLineTo(15f)
        curveTo(22f, 14.0572f, 22f, 13.5858f, 21.7071f, 13.2929f)
        curveTo(21.4142f, 13f, 20.9428f, 13f, 20f, 13f)
        horizontalLineTo(12f)
        verticalLineTo(21f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 21f, 20.8284f, 21f, 21.4142f, 20.4142f)
        curveTo(22f, 19.8284f, 22f, 18.8856f, 22f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        horizontalLineTo(16f)
        moveTo(22f, 9f)
        horizontalLineTo(20f)
        moveTo(20f, 9f)
        verticalLineTo(13f)
        moveTo(20f, 9f)
        horizontalLineTo(16f)
        moveTo(16f, 9f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.5f)
        verticalLineTo(12.9999f)
        horizontalLineTo(3f)
        verticalLineTo(7.07031f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        lineTo(13f, 3f)
        }
        }.build()

        return _villa01!!
    }

private var _villa01: ImageVector? = null
