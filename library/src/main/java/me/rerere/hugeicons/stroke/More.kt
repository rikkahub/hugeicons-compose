package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = ImageVector.Builder(
            name = "More",
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
        moveTo(15.5f, 6.5f)
        curveTo(15.5f, 8.433f, 13.933f, 10f, 12f, 10f)
        curveTo(10.067f, 10f, 8.5f, 8.433f, 8.5f, 6.5f)
        curveTo(8.5f, 4.567f, 10.067f, 3f, 12f, 3f)
        curveTo(13.933f, 3f, 15.5f, 4.567f, 15.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.5f)
        curveTo(22f, 19.433f, 20.433f, 21f, 18.5f, 21f)
        curveTo(16.567f, 21f, 15f, 19.433f, 15f, 17.5f)
        curveTo(15f, 15.567f, 16.567f, 14f, 18.5f, 14f)
        curveTo(20.433f, 14f, 22f, 15.567f, 22f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 17.5f)
        curveTo(9f, 19.433f, 7.433f, 21f, 5.5f, 21f)
        curveTo(3.567f, 21f, 2f, 19.433f, 2f, 17.5f)
        curveTo(2f, 15.567f, 3.567f, 14f, 5.5f, 14f)
        curveTo(7.433f, 14f, 9f, 15.567f, 9f, 17.5f)
        }
        }.build()

        return _more!!
    }

private var _more: ImageVector? = null
