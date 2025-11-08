package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Riyal: ImageVector
    get() {
        if (_riyal != null) {
            return _riyal!!
        }
        _riyal = ImageVector.Builder(
            name = "Riyal",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5227f, 17.5229f, 22f, 12f, 22f)
        curveTo(6.47713f, 22f, 2f, 17.5227f, 2f, 12f)
        curveTo(2f, 6.47713f, 6.47713f, 2f, 12f, 2f)
        curveTo(17.5229f, 2f, 22f, 6.47713f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        verticalLineTo(12f)
        curveTo(18f, 13.6569f, 16.6569f, 15f, 15f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8f)
        verticalLineTo(12.5f)
        curveTo(11f, 13.0523f, 11.4477f, 13.5f, 12f, 13.5f)
        horizontalLineTo(13f)
        curveTo(13.5523f, 13.5f, 14f, 13.0523f, 14f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8f)
        verticalLineTo(12.5f)
        curveTo(8.5f, 13.0523f, 8.05228f, 13.5f, 7.5f, 13.5f)
        horizontalLineTo(6.5f)
        curveTo(5.94772f, 13.5f, 5.5f, 13.0523f, 5.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.49f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15.5f)
        verticalLineTo(15.51f)
        }
        }.build()

        return _riyal!!
    }

private var _riyal: ImageVector? = null
