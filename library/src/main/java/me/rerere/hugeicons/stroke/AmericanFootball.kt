package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AmericanFootball: ImageVector
    get() {
        if (_americanFootball != null) {
            return _americanFootball!!
        }
        _americanFootball = ImageVector.Builder(
            name = "AmericanFootball",
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
        moveTo(21.3006f, 6.05187f)
        curveTo(21.1484f, 5.22701f, 20.7411f, 4.45623f, 20.1372f, 3.85008f)
        curveTo(19.5309f, 3.24641f, 18.7599f, 2.83927f, 17.9348f, 2.68704f)
        curveTo(13.7379f, 1.98816f, 9.32857f, 3.26088f, 6.29895f, 6.28553f)
        curveTo(3.27f, 9.30951f, 1.9905f, 13.7155f, 2.68454f, 17.9122f)
        curveTo(2.83679f, 18.7371f, 3.24405f, 19.5079f, 3.84791f, 20.114f)
        curveTo(4.45425f, 20.7177f, 5.22527f, 21.1248f, 6.0504f, 21.2771f)
        curveTo(10.2213f, 22.0738f, 14.6996f, 20.7027f, 17.6917f, 17.6794f)
        curveTo(20.7496f, 14.6729f, 22.0291f, 10.2497f, 21.3006f, 6.05187f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 20f)
        lineTo(20f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        lineTo(12f, 15f)
        moveTo(12f, 9f)
        lineTo(15f, 12f)
        }
        }.build()

        return _americanFootball!!
    }

private var _americanFootball: ImageVector? = null
