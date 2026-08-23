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

val HugeIcons.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) {
            return _zodiacTaurus!!
        }
        _zodiacTaurus = ImageVector.Builder(
            name = "ZodiacTaurus",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 15f)
            arcTo(6f, 6f, 0f, true, false, 6f, 15f)
            arcTo(6f, 6f, 0f, true, false, 18f, 15f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 3f)
            curveTo(18f, 6.31371f, 15.3137f, 9f, 12f, 9f)
            curveTo(8.68629f, 9f, 6f, 6.31371f, 6f, 3f)
        }
        }.build()

        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null
