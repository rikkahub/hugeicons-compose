package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = ImageVector.Builder(
            name = "Subscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.9923f, 21.4998f)
            horizontalLineTo(17.9923f)
            lineTo(21.1923f, 19.0998f)
            curveTo(21.6959f, 18.7221f, 21.9923f, 18.1294f, 21.9923f, 17.4999f)
            curveTo(21.9923f, 16.3954f, 21.0967f, 15.5f, 19.9922f, 15.5f)
            curveTo(18.8877f, 15.5f, 17.9921f, 16.3954f, 17.9921f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.70691f, 2.52474f)
            curveTo(4.6979f, 2.41997f, 5.94715f, 2.57715f, 6.72793f, 4.41069f)
            curveTo(7.54775f, 6.61097f, 9.57778f, 12.7403f, 10.0853f, 14.1548f)
            curveTo(10.6318f, 15.674f, 11.3345f, 16.7218f, 14.2234f, 16.4598f)
            moveTo(14.9921f, 2.50791f)
            curveTo(12.1292f, 2.48296f, 9.78686f, 7.22279f, 8.48556f, 9.49292f)
            curveTo(7.05413f, 12.1123f, 4.59467f, 16.6525f, 1.99207f, 16.4779f)
        }
        }.build()

        return _subscript!!
    }

private var _subscript: ImageVector? = null
