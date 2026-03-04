package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Repost: ImageVector
    get() {
        if (_repost != null) {
            return _repost!!
        }
        _repost = ImageVector.Builder(
            name = "Repost",
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
        moveTo(8.49997f, 15f)
        curveTo(8.49997f, 15f, 5.00001f, 17.5777f, 5f, 18.5f)
        curveTo(4.99999f, 19.4223f, 8.5f, 22f, 8.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 18.5f)
        lineTo(13.5f, 18.5f)
        curveTo(16.7875f, 18.5f, 18.4312f, 18.5f, 19.5376f, 17.592f)
        curveTo(19.7401f, 17.4258f, 19.9258f, 17.2401f, 20.092f, 17.0376f)
        curveTo(21f, 15.9312f, 21f, 14.2875f, 21f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 9f)
        curveTo(15.5f, 9f, 19f, 6.42229f, 19f, 5.49997f)
        curveTo(19f, 4.57766f, 15.5f, 2f, 15.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 5.5f)
        lineTo(10.5f, 5.5f)
        curveTo(7.21252f, 5.5f, 5.56878f, 5.5f, 4.46243f, 6.40796f)
        curveTo(4.25989f, 6.57417f, 4.07418f, 6.75989f, 3.90796f, 6.96243f)
        curveTo(3f, 8.06878f, 3f, 9.71252f, 3f, 13f)
        }
        }.build()

        return _repost!!
    }

private var _repost: ImageVector? = null
