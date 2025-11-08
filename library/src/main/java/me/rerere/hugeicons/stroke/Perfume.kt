package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Perfume: ImageVector
    get() {
        if (_perfume != null) {
            return _perfume!!
        }
        _perfume = ImageVector.Builder(
            name = "Perfume",
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
        moveTo(2f, 16.0333f)
        curveTo(2f, 17.9969f, 2.76322f, 19.7833f, 4.01078f, 21.1151f)
        curveTo(4.70497f, 21.8562f, 5.32548f, 22f, 6.32891f, 22f)
        horizontalLineTo(12.6711f)
        curveTo(13.6745f, 22f, 14.295f, 21.8562f, 14.9892f, 21.1151f)
        curveTo(16.2368f, 19.7833f, 17f, 17.9969f, 17f, 16.0333f)
        curveTo(17f, 13.0265f, 15.2105f, 10.4354f, 12.6328f, 9.2554f)
        curveTo(12.1918f, 9.05357f, 11.8016f, 9f, 11.3176f, 9f)
        horizontalLineTo(7.68245f)
        curveTo(7.19837f, 9f, 6.80816f, 9.05357f, 6.36725f, 9.2554f)
        curveTo(3.7895f, 10.4354f, 2f, 13.0265f, 2f, 16.0333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9f)
        verticalLineTo(8f)
        curveTo(7f, 6.34533f, 7.34533f, 6f, 9f, 6f)
        horizontalLineTo(10f)
        curveTo(11.6547f, 6f, 12f, 6.34533f, 12f, 8f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 6f)
        verticalLineTo(4.5f)
        curveTo(11f, 3.4506f, 10.6269f, 3f, 9.5f, 3f)
        curveTo(8.37313f, 3f, 8f, 3.4506f, 8f, 4.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 4f)
        horizontalLineTo(8f)
        moveTo(11f, 4f)
        horizontalLineTo(16f)
        }
        }.build()

        return _perfume!!
    }

private var _perfume: ImageVector? = null
