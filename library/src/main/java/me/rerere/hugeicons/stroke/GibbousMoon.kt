package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GibbousMoon: ImageVector
    get() {
        if (_gibbousMoon != null) {
            return _gibbousMoon!!
        }
        _gibbousMoon = ImageVector.Builder(
            name = "GibbousMoon",
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
        moveTo(20.5f, 14.469f)
        curveTo(19.3635f, 15.0758f, 18.0654f, 15.4199f, 16.687f, 15.4199f)
        curveTo(12.2097f, 15.4199f, 8.58014f, 11.7903f, 8.58014f, 7.31302f)
        curveTo(8.58014f, 5.9346f, 8.92416f, 4.63654f, 9.53102f, 3.5f)
        curveTo(5.50093f, 4.44451f, 2.5f, 8.0617f, 2.5f, 12.3798f)
        curveTo(2.5f, 17.4167f, 6.58325f, 21.5f, 11.6202f, 21.5f)
        curveTo(15.9383f, 21.5f, 19.5555f, 18.4991f, 20.5f, 14.469f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 12f)
        curveTo(21.5f, 6.75329f, 17.2467f, 2.5f, 12f, 2.5f)
        }
        }.build()

        return _gibbousMoon!!
    }

private var _gibbousMoon: ImageVector? = null
