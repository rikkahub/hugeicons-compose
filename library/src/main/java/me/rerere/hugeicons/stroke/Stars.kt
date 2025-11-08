package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = ImageVector.Builder(
            name = "Stars",
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
        moveTo(3f, 12f)
        curveTo(7.5f, 12f, 12f, 7.5f, 12f, 3f)
        curveTo(12f, 7.5f, 16.5f, 12f, 21f, 12f)
        curveTo(16.5f, 12f, 12f, 16.5f, 12f, 21f)
        curveTo(12f, 16.5f, 7.5f, 12f, 3f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 19.5f)
        curveTo(2.83333f, 19.5f, 4.5f, 17.8333f, 4.5f, 17f)
        curveTo(4.5f, 17.8333f, 6.16667f, 19.5f, 7f, 19.5f)
        curveTo(6.16667f, 19.5f, 4.5f, 21.1667f, 4.5f, 22f)
        curveTo(4.5f, 21.1667f, 2.83333f, 19.5f, 2f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5f)
        curveTo(17f, 5f, 19f, 3f, 19f, 2f)
        curveTo(19f, 3f, 21f, 5f, 22f, 5f)
        curveTo(21f, 5f, 19f, 7f, 19f, 8f)
        curveTo(19f, 7f, 17f, 5f, 16f, 5f)
        }
        }.build()

        return _stars!!
    }

private var _stars: ImageVector? = null
