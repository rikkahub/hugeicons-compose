package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Split: ImageVector
    get() {
        if (_split != null) {
            return _split!!
        }
        _split = ImageVector.Builder(
            name = "Split",
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
        moveTo(21f, 8.5f)
        verticalLineTo(6.6f)
        curveTo(21f, 4.90294f, 21f, 4.05442f, 20.4728f, 3.52721f)
        curveTo(19.9456f, 3f, 19.0971f, 3f, 17.4f, 3f)
        horizontalLineTo(15.5f)
        moveTo(20f, 4f)
        lineTo(14.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8.5f)
        verticalLineTo(6.6f)
        curveTo(3f, 4.90294f, 3f, 4.05442f, 3.52721f, 3.52721f)
        curveTo(4.05442f, 3f, 4.90294f, 3f, 6.6f, 3f)
        horizontalLineTo(8.5f)
        moveTo(4f, 4f)
        lineTo(9.65686f, 9.65686f)
        curveTo(10.813f, 10.813f, 11.391f, 11.391f, 11.6955f, 12.1261f)
        curveTo(12f, 12.8612f, 12f, 13.6787f, 12f, 15.3137f)
        verticalLineTo(21f)
        }
        }.build()

        return _split!!
    }

private var _split: ImageVector? = null
