package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = ImageVector.Builder(
            name = "Rss",
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
        moveTo(12.9915f, 20.5f)
        curveTo(13.7121f, 20.5f, 13.9925f, 20.4956f, 13.9925f, 20.4956f)
        curveTo(17.4088f, 20.471f, 19.2922f, 20.3099f, 20.5342f, 19.2552f)
        curveTo(22f, 18.0104f, 22f, 16.0069f, 22f, 12f)
        curveTo(22f, 7.99306f, 22f, 5.98959f, 20.5342f, 4.7448f)
        curveTo(19.0683f, 3.5f, 16.7091f, 3.5f, 11.9906f, 3.5f)
        curveTo(7.27213f, 3.5f, 4.91289f, 3.5f, 3.44705f, 4.7448f)
        curveTo(2.32426f, 5.69827f, 2.0615f, 7.09687f, 2f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.98242f, 19.5f)
        horizontalLineTo(2.9914f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.7349f)
        curveTo(4.49328f, 15.7349f, 6.77053f, 18f, 6.77053f, 20.4996f)
        moveTo(10f, 20.4996f)
        curveTo(10f, 16f, 5.99511f, 12.5f, 2.04522f, 12.5f)
        }
        }.build()

        return _rss!!
    }

private var _rss: ImageVector? = null
