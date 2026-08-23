package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZodiacOphiuchus: ImageVector
    get() {
        if (_zodiacOphiuchus != null) {
            return _zodiacOphiuchus!!
        }
        _zodiacOphiuchus = ImageVector.Builder(
            name = "ZodiacOphiuchus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 3f)
            verticalLineTo(15f)
            curveTo(6f, 18.3137f, 8.68629f, 21f, 12f, 21f)
            curveTo(15.3137f, 21f, 18f, 18.3137f, 18f, 15f)
            verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 9.99893f)
            curveTo(6f, 6.93786f, 9f, 7.7607f, 12f, 10.0004f)
            curveTo(15f, 12.2401f, 18f, 13.0615f, 21f, 10.0004f)
        }
        }.build()

        return _zodiacOphiuchus!!
    }

private var _zodiacOphiuchus: ImageVector? = null
