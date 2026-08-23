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

val HugeIcons.Bean: ImageVector
    get() {
        if (_bean != null) {
            return _bean!!
        }
        _bean = ImageVector.Builder(
            name = "Bean",
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
            moveTo(16.5751f, 3.08979f)
            curveTo(13.6421f, 2.55106f, 10.8277f, 4.49201f, 10.289f, 7.42494f)
            curveTo(10.0234f, 8.87061f, 8.87061f, 10.0234f, 7.42494f, 10.289f)
            curveTo(4.49201f, 10.8277f, 2.55106f, 13.6421f, 3.08979f, 16.5751f)
            curveTo(3.62852f, 19.508f, 6.44296f, 21.4489f, 9.37589f, 20.9102f)
            curveTo(15.2312f, 19.8347f, 19.8347f, 15.2312f, 20.9102f, 9.37589f)
            curveTo(21.4489f, 6.44296f, 19.508f, 3.62852f, 16.5751f, 3.08979f)
            close()
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
            moveTo(11.1734f, 5.64062f)
            curveTo(12.2727f, 6.35349f, 13f, 7.59141f, 13f, 8.99919f)
            curveTo(13f, 11.2083f, 11.2091f, 12.9992f, 8.99998f, 12.9992f)
            curveTo(7.5922f, 12.9992f, 6.35428f, 12.2719f, 5.64142f, 11.1726f)
        }
        }.build()

        return _bean!!
    }

private var _bean: ImageVector? = null
