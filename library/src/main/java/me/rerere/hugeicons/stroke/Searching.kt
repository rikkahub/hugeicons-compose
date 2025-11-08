package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Searching: ImageVector
    get() {
        if (_searching != null) {
            return _searching!!
        }
        _searching = ImageVector.Builder(
            name = "Searching",
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
        moveTo(16.5f, 17.5f)
        lineTo(20f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 13f)
        curveTo(18f, 9.68629f, 15.3137f, 7f, 12f, 7f)
        curveTo(8.68629f, 7f, 6f, 9.68629f, 6f, 13f)
        curveTo(6f, 16.3137f, 8.68629f, 19f, 12f, 19f)
        curveTo(15.3137f, 19f, 18f, 16.3137f, 18f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.7654f, 9f)
        curveTo(20.2554f, 8.79701f, 20.6448f, 8.40766f, 20.8478f, 7.91761f)
        curveTo(21f, 7.55007f, 21f, 6.93188f, 21f, 6f)
        curveTo(21f, 5.06812f, 21f, 4.60218f, 20.8478f, 4.23463f)
        curveTo(20.6448f, 3.74458f, 20.2554f, 3.35523f, 19.7654f, 3.15224f)
        curveTo(19.3978f, 3f, 18.9319f, 3f, 18f, 3f)
        horizontalLineTo(6f)
        curveTo(5.06812f, 3f, 4.60218f, 3f, 4.23463f, 3.15224f)
        curveTo(3.74458f, 3.35523f, 3.35523f, 3.74458f, 3.15224f, 4.23463f)
        curveTo(3f, 4.60218f, 3f, 5.06812f, 3f, 6f)
        curveTo(3f, 6.93188f, 3f, 7.55007f, 3.15224f, 7.91761f)
        curveTo(3.35523f, 8.40766f, 3.74458f, 8.79701f, 4.23463f, 9f)
        }
        }.build()

        return _searching!!
    }

private var _searching: ImageVector? = null
