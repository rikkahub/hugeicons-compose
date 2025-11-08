package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share08: ImageVector
    get() {
        if (_share08 != null) {
            return _share08!!
        }
        _share08 = ImageVector.Builder(
            name = "Share08",
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
        moveTo(21f, 6.5f)
        curveTo(21f, 8.15685f, 19.6569f, 9.5f, 18f, 9.5f)
        curveTo(16.3431f, 9.5f, 15f, 8.15685f, 15f, 6.5f)
        curveTo(15f, 4.84315f, 16.3431f, 3.5f, 18f, 3.5f)
        curveTo(19.6569f, 3.5f, 21f, 4.84315f, 21f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        curveTo(9f, 13.6569f, 7.65685f, 15f, 6f, 15f)
        curveTo(4.34315f, 15f, 3f, 13.6569f, 3f, 12f)
        curveTo(3f, 10.3431f, 4.34315f, 9f, 6f, 9f)
        curveTo(7.65685f, 9f, 9f, 10.3431f, 9f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17.5f)
        curveTo(21f, 19.1569f, 19.6569f, 20.5f, 18f, 20.5f)
        curveTo(16.3431f, 20.5f, 15f, 19.1569f, 15f, 17.5f)
        curveTo(15f, 15.8431f, 16.3431f, 14.5f, 18f, 14.5f)
        curveTo(19.6569f, 14.5f, 21f, 15.8431f, 21f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.72852f, 10.7495f)
        lineTo(15.2285f, 7.75f)
        moveTo(8.72852f, 13.25f)
        lineTo(15.2285f, 16.2495f)
        }
        }.build()

        return _share08!!
    }

private var _share08: ImageVector? = null
