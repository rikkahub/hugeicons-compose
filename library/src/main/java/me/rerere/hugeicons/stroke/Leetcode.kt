package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Leetcode: ImageVector
    get() {
        if (_leetcode != null) {
            return _leetcode!!
        }
        _leetcode = ImageVector.Builder(
            name = "Leetcode",
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
        moveTo(13.8514f, 3f)
        lineTo(4.62921f, 12f)
        curveTo(3.79026f, 12.8187f, 3.79026f, 14.1462f, 4.62921f, 14.9649f)
        lineTo(10.1841f, 20.386f)
        curveTo(11.0231f, 21.2047f, 12.3833f, 21.2047f, 13.2222f, 20.386f)
        lineTo(15.9997f, 17.6754f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.33203f, 10.3377f)
        lineTo(10.1836f, 6.57889f)
        curveTo(11.0226f, 5.76016f, 12.3828f, 5.76016f, 13.2217f, 6.57889f)
        lineTo(15.9992f, 9.28943f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 13f)
        horizontalLineTo(20f)
        }
        }.build()

        return _leetcode!!
    }

private var _leetcode: ImageVector? = null
