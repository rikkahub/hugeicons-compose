package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Apple01: ImageVector
    get() {
        if (_apple01 != null) {
            return _apple01!!
        }
        _apple01 = ImageVector.Builder(
            name = "Apple01",
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
        moveTo(8f, 5f)
        curveTo(5.23858f, 5f, 3f, 8.0139f, 3f, 11.0278f)
        curveTo(3f, 14.544f, 3.5f, 17.0556f, 5.5f, 20.0695f)
        curveTo(7.02044f, 22.1062f, 9.05026f, 22.6168f, 11.2139f, 21.1903f)
        curveTo(11.6757f, 20.8859f, 12.3243f, 20.8859f, 12.7861f, 21.1903f)
        curveTo(14.9497f, 22.6168f, 16.9796f, 22.1062f, 18.5f, 20.0695f)
        curveTo(20.5f, 17.0556f, 21f, 14.544f, 21f, 11.0278f)
        curveTo(21f, 8.0139f, 18.7614f, 5f, 16f, 5f)
        curveTo(14.5746f, 5f, 13.2885f, 5.7849f, 12.3777f, 6.63254f)
        curveTo(12.166f, 6.82949f, 11.834f, 6.82949f, 11.6223f, 6.63254f)
        curveTo(10.7115f, 5.7849f, 9.42542f, 5f, 8f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(6f, 10.3665f, 6.82273f, 8.73298f, 8f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        curveTo(12f, 4.66667f, 12.6f, 2f, 15f, 2f)
        }
        }.build()

        return _apple01!!
    }

private var _apple01: ImageVector? = null
