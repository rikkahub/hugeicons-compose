package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blend: ImageVector
    get() {
        if (_blend != null) {
            return _blend!!
        }
        _blend = ImageVector.Builder(
            name = "Blend",
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
        moveTo(7.5f, 13f)
        horizontalLineTo(6.4f)
        curveTo(4.32582f, 13f, 3.28873f, 13f, 2.64437f, 12.3556f)
        curveTo(2f, 11.7113f, 2f, 10.6742f, 2f, 8.6f)
        verticalLineTo(6.4f)
        curveTo(2f, 4.32582f, 2f, 3.28873f, 2.64437f, 2.64437f)
        curveTo(3.28873f, 2f, 4.32582f, 2f, 6.4f, 2f)
        horizontalLineTo(8.6f)
        curveTo(10.6742f, 2f, 11.7113f, 2f, 12.3556f, 2.64437f)
        curveTo(13f, 3.28873f, 13f, 4.32582f, 13f, 6.4f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0348f, 19f)
        curveTo(9.17734f, 18.5206f, 7f, 16.0355f, 7f, 13.0418f)
        curveTo(7f, 9.70499f, 9.70499f, 7f, 13.0418f, 7f)
        curveTo(16.0355f, 7f, 18.5206f, 9.17734f, 19f, 12.0348f)
        }
        }.build()

        return _blend!!
    }

private var _blend: ImageVector? = null
