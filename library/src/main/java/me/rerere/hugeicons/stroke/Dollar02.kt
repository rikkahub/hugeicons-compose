package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dollar02: ImageVector
    get() {
        if (_dollar02 != null) {
            return _dollar02!!
        }
        _dollar02 = ImageVector.Builder(
            name = "Dollar02",
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
        moveTo(18.4167f, 8.14815f)
        curveTo(18.4167f, 5.85719f, 15.5438f, 4f, 12f, 4f)
        curveTo(8.45617f, 4f, 5.58333f, 5.85719f, 5.58333f, 8.14815f)
        curveTo(5.58333f, 10.4391f, 7.33333f, 11.7037f, 12f, 11.7037f)
        curveTo(16.6667f, 11.7037f, 19f, 12.8889f, 19f, 15.8519f)
        curveTo(19f, 18.8148f, 15.866f, 20f, 12f, 20f)
        curveTo(8.13401f, 20f, 5f, 18.1428f, 5f, 15.8519f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }
        }.build()

        return _dollar02!!
    }

private var _dollar02: ImageVector? = null
