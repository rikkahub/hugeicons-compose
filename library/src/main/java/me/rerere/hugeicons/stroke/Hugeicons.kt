package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hugeicons: ImageVector
    get() {
        if (_hugeicons != null) {
            return _hugeicons!!
        }
        _hugeicons = ImageVector.Builder(
            name = "Hugeicons",
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
        moveTo(2f, 9.5f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 9.5f)
        horizontalLineTo(3.5f)
        lineTo(4.23353f, 15.3682f)
        curveTo(4.59849f, 18.2879f, 4.78097f, 19.7477f, 5.77343f, 20.6239f)
        curveTo(6.76589f, 21.5f, 8.23708f, 21.5f, 11.1795f, 21.5f)
        horizontalLineTo(12.8205f)
        curveTo(15.7629f, 21.5f, 17.2341f, 21.5f, 18.2266f, 20.6239f)
        curveTo(19.219f, 19.7477f, 19.4015f, 18.2879f, 19.7665f, 15.3682f)
        lineTo(20.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        curveTo(5f, 5.41015f, 8.13401f, 2.5f, 12f, 2.5f)
        curveTo(15.866f, 2.5f, 19f, 5.41015f, 19f, 9f)
        }
        }.build()

        return _hugeicons!!
    }

private var _hugeicons: ImageVector? = null
