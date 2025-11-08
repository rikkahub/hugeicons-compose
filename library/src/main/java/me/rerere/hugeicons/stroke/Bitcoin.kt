package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) {
            return _bitcoin!!
        }
        _bitcoin = ImageVector.Builder(
            name = "Bitcoin",
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
        moveTo(6f, 4f)
        horizontalLineTo(14.4f)
        curveTo(16.3882f, 4f, 18f, 5.79086f, 18f, 8f)
        curveTo(18f, 10.2091f, 16.3882f, 12f, 14.4f, 12f)
        moveTo(14.4f, 12f)
        curveTo(16.3882f, 12f, 18f, 13.7909f, 18f, 16f)
        curveTo(18f, 18.2091f, 16.3882f, 20f, 14.4f, 20f)
        horizontalLineTo(6f)
        moveTo(14.4f, 12f)
        horizontalLineTo(7.2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2f)
        lineTo(9f, 4f)
        moveTo(14f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 20f)
        lineTo(9f, 22f)
        moveTo(14f, 20f)
        verticalLineTo(22f)
        }
        }.build()

        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
